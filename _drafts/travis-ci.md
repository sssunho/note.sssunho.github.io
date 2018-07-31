---
layout: post
title: travis ci/ 시작하기
date: 2018-07-31 13:25:00 KST
description: You’ll find this post in your `_posts` directory. Go ahead and edit it and re-build the site to see your changes. # Add post description (optional)
img: software.jpg # Add image post (optional)
tags: [ci, travis-ci]
---

https://docs.travis-ci.com/user/getting-started/

`.travis.yml
```
language: python
python:
- '3.6'

before_install:
- openssl aes-256-cbc -K $encrypted_fe7a31125bf0_key -iv $encrypted_fe7a31125bf0_iv
  -in config.json.enc -out config.json -d

install:
- pip install -r requirement.txt
- python -m nltk.downloader punkt

script: pytest test
sudo: enabled
services:
- redis-server
```



- testcase를 자동으로 돌려줄 도구가 필요했다

지속적인 통합, continuos integration


- travis-ci 계정 만들기

https://travis-ci.org/


- travis-ci 로그인 후, profile 들어가서 테스트 돌릴 repository 활성화 시켜주기


- github repository에 올리면 안되는, 설정키, 비밀 파일 올리기

https://docs.travis-ci.com/user/encrypting-files/
https://blog.outsider.ne.kr/1252

터미널에서 github repository로 cd 해준 후, travis login을 해준 후 진행해줄 것

```
$ travis encrypt-file super_secret.txt --add
```
명령어를 진행하면 .travis.yml에 자동으로 명령어가 등록된다.

비밀파일.enc 파일과 함께 git push 하기. 비밀파일은 절대 같이 push하지 말 것


- .travis.yml
requirement.txt에 있는 것부터 설치도되록 설정해줘야한다.

  - nltk 설치하는 명령어

install:
- "python -m nltk.downloader punkt"

-로 넣으면 여러개 넣을 수 있고, 아니면 install: qwerqqr로 한줄만 넣을 수 있음

  - redis 설치

https://docs.travis-ci.com/user/database-setup/#redis

services: - redis-server 만 넣어주면 알아서 돌아간다


