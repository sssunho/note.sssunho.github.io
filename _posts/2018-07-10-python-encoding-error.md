---
layout: post
title: python/ UnicodeEncodeError
date: 2018-07-10 22:58:00 KST
tags: [problem, error, python, encode]
---


## problem

```
UnicodeEncodeError: 'latin-1' codec can't encode characters in position ...
```
파이썬 작업 중 `UnicodeEncodeError` 인코딩 에러가 계속 뜬다.

<br>

인코딩 문제는 방심할 때 나타난다. 어디서 어떻게 나타날지 모른다.

그래서 오늘은 인코딩이 일어날 때 사용중이었던 모듈을 기록해두려한다.

### spec

- sqlalchemy
- pymysql
- requests
- json

<br>

## cause

>  정확히는 원인을 찾아나간 과정입니다.

1. requests의 response가 문제인 줄 알았다.
    ```
    {'data1': "???? ???? ?? ??? ?? ??? ???.'",
    'data2': 'Huh? really?\n'
               'huh? really?\n'
               '? what?\n'
               'huh??\n'
               '? what?\n'
               'huh??\n'
               'huh??\n'
               "'Let's say. '\n",
    'data3': '????? ????? ?? ??? ?? ??? ??? &quot;'}
    ```

    그래서 일단 결과값들을 decoding하기 시작..

    json.loads()가 encoding, decoding을 못하는 줄 알고 온갖 인코딩, 디코딩 방법들을 시도했다.

    ```python
    res.json().encode('utf-8')
    json.loads(res.content, encoding='utf-8')
    ```

    <br>


2. mysql 테이블 character set을 잘못한 줄 알았으나 `utf8_general_ci`로 잘 되있었다.
    workbench에서 직접 쿼리도 때려보고,

    ```
   SHOW FULL COLUMNS FROM table_name;
   ```
   
   를 통하여 칼럼 속성도 다시 확인해보았으나 오류를 발견하지 못했다.

   <br>

3. 갑자기 쎄한 기분이 들어, sqlalchemy의 결과값, row를 찍어보았다. 

   역시나.. 쎄한기분은 틀리지 않는다.

   ```
   ("'???, ???'\x85?? ?? ???\n?? 2018-07-04 11:47\n?? '???'? ??[?? ?]\n(??=???) ???.")
   ```


드디어 원인을 찾았다! sqlalchemy 결과값부터가 문제였다.

여태 아무 문제없이 잘 돌고 있었는데.. 이렇게 통수를 치다니. 방심했다.

<br>

## solution

원인찾기는 많이 헤맸지만 문제해결은 어렵지 않았다.

[SQLAlchemy, MySQL Document](https://docs.sqlalchemy.org/en/latest/dialects/mysql.html?highlight=encode) 에서 바로 알 수 있다.

```
# 방법 1
engine = create_engine('mysql+mysqldb://...', charset=utf8)

# 방법 2
mysql+pymysql://{user}:{password}@{host}:3306/{database}?charset=utf8
```

`charset=utf8` 만 붙여주면 모든 것이 평화롭다.

<br>

## key point summary

sqlalchemy의 charset을 utf8로 설정해둠으로써 인코딩에 대한 우려를 접을 수 있다.

sqlalchemy 뿐만아니라 string을 다룰 땐 항상 charset, encode, decode를 조심하자. 제발.
