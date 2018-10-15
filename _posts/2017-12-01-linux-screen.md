---
layout: post
title: linux/ screen commands
date: 2017-12-01 00:00:00 KST
description: You’ll find this post in your `_posts` directory. Go ahead and edit it and re-build the site to see your changes. # Add post description (optional)
img: software.jpg # Add image post (optional)
tags: [Productivity, Software] # add tag
---

###스크린 목록 확인

```shell
$ user ~ 0 screen -list
There is a screen on:
	22879.myscreen	(2017년 12월 01일 11시 41분 24초)	(Detached)
1 Socket in /var/run/screen/S-user.
```





###스크린 연결 해제

```shell
$ screen -d myscreen
```





###스크린 삭제

```shell
$ pkill screen
```

- 스크린을 강제로 종료합니다.



```shell
$ screen -wipe
```

- wipe 옵션을 써도 된다

