---
layout: post
title: Gmail API
date: 2018-09-05 00:00:00 +0300
tags: [google, google_api]
---

- https://developers.google.com/gmail/api/quickstart/python

`SCOPES` 수정하기
```
SCOPES = ['https://mail.google.com/', 'https://www.googleapis.com/auth/gmail.modify', 'https://www.googleapis.com/auth/gmail.compose', 'https://www.googleapis.com/auth/gmail.send']
```

- https://developers.google.com/gmail/api/guides/sending

`return {'raw': base64.urlsafe_b64encode(message.as_string())}`
대신 
`return {'raw': base64.urlsafe_b64encode(message.as_string().encode()).decode()}`
로 실행하기

- Linux에서 처음 돌릴 때
`python run.py --noauth_local_webserver`로 실행 후 URL 별도로 실행하여 발급된 코드 입력하면 됩니다.
