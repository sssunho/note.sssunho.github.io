---
layout: post
title: Conference on Javascript
date: 2017-09-10 00:00:00 +0300
description: You’ll find this post in your `_posts` directory. Go ahead and edit it and re-build the site to see your changes. # Add post description (optional)
img: js-1.png # Add image post (optional)
tags: [Js, Conference] # add tag
---

```shell
"""
    # SQLAlchemy를 사용해봅시다.
    http://docs.sqlalchemy.org/en/latest/
"""
    
#: confing 설정
    DATABASE_CONFIG = {
        'driver': 'mysql+pymysql',
        'host': '',
        'dbname': '',
        'user': '',
        'password': '',
        'port': 3306
    }
    SQLALCHEMY_DATABASE_URI = '{driver}://{user}:{password}@{host}/{dbname}'.format(**DATABASE_CONFIG)
    SQLALCHEMY_TRACK_MODIFICATIONS = True

#: app/__init__ 설정
# Define the database object which is imported
# by modules and controllers
db = SQLAlchemy(app)

# Build the database:
# This will create the database file using SQLAlchemy
db.create_all()


########################################################################

# app/module/model에서 사용하기
from app import db
from sqlalchemy import MetaData, Table, text, and_

conn = db.engine.connect()
meta = MetaData(bind=db.engine)
os = Table('doc_origin_sentences', meta, autoload=True)

#: 여러개의 쿼리를 실행할 때 Transaction 처리를 위해 필요 - UPDATE, INSERT할 떄
trans = conn.begin()
try:
    query1 = conn.execute()
    query2 = conn.execute()

    trans.commit()  # 모든 쿼리를 실행하고 꼭 넣어야 실제 DB에 적용된다.
except:
    trans.rollback()  # 중간에 에러가 발생한 경우, Rollback()을 위해 넣어준다.


# SELECT
res = conn.execute(os.select(and_(`조건1`, `조건2`))).fetchall()

# UPDATE
# p.c.id = p(테이블)의 id라는 c(칼럼)
res = conn.execute(p.update(p.c.id == pid), name=name, status=status, due_date=due_date)

# INSERT
res = conn.execute(p.insert(), name=name, due_date=due_date, open_grade=open_grade)


#: text를 사용하면 일반 쿼리문을 그대로 실행할 수 있습니다
res = conn.execute(text(
    """SELECT os.id as sentence_id, d.origin_lang, d.trans_lang, os.text as origin_text
            , IF(ts.text is not NULL, ts.text, '') as trans_text
            , IF(ts.status is not NULL, ts.status, 0) as trans_status
            , IF(ts.type is not NULL, ts.type, 0) as trans_type
            , IF(comment_cnt is not NULL, comment_cnt, 0) as comment_cnt
      FROM `marocat v1.1`.doc_origin_sentences os 
      JOIN docs d ON d.id = os.doc_id
      LEFT JOIN doc_trans_sentences ts ON ts.origin_id = os.id AND ts.is_deleted = FALSE
      LEFT JOIN ( SELECT origin_id, COUNT(*) as comment_cnt FROM trans_comments 
                  WHERE is_deleted = FALSE GROUP BY origin_id ) tc ON tc.origin_id = os.id
      WHERE os.doc_id = :did AND os.is_deleted = FALSE;"""), did=211).fetchall()

# fetchall()
for r in res:
    print(r)
    print(r['col1'])

# fetchone()
col1_res = res['col1']


########################################################################

#: 테이블 autoload하는 방법1
meta = MetaData(bind=db.engine)
os = Table('doc_origin_sentences', meta, autoload=True)

#: 테이블 autoload하는 방법2
class User(db.Model):
    meta = MetaData(bind=db.engine)
    __table__ = Table('translation_memory', meta, autoload=True)

#: 방법2 select 사용법
# res = User.query.all()
# print(res)

```
