---
layout: post
title: bot/ telegram bot
date: 2018-06-25 00:00:00 KST
description: You’ll find this post in your `_posts` directory. Go ahead and edit it and re-build the site to see your changes. # Add post description (optional)
img: workflow.jpg # Add image post (optional)
fig-caption: # Add figcaption (optional)
tags: [bot, telegram]
---

https://core.telegram.org/bots/api

봇은 키워드 설정을 잘해야한다
message, callback_query
inline keyboard - url, callback_data

<br>

##getUpdate

https://api.telegram.org/bot561471433:AAEeWZ7KdcqjYc4ujyufJHuKl8EpPQC3MdY/getUpdates

```json
{
    "ok": true,
    "result": [
        {
            `"update_id"`: 144932917,
            "message": {
                `"message_id"`: 2,
                "from": {
                    "id": 604252092,
                    "is_bot": false,
                    "first_name": "SunHo",
                    "last_name": "Lee",
                    "language_code": "ko-KR"
                },
                "chat": {
                    `"id"`: 604252092,
                    "first_name": "SunHo",
                    "last_name": "Lee",
                    "type": "private"
                },
                "date": 1529892301,
                `"text"`: "nice"
            }
        }
    ]
}
```

polling: 특정 시간마다 계속 불러온다

Webhook이 있으나 드러워서 안써~ 느리고, 죽고.. HTTPS도 까다롭게 필요하고..

<br>

##sendMessage

https://core.telegram.org/bots/api#sendmessage

https://api.telegram.org/bot561471433:AAEeWZ7KdcqjYc4ujyufJHuKl8EpPQC3MdY/sendMessage

```json
{
    "ok": true,
    "result": {
        "message_id": 3,
        "from": {
            "id": 561471433,
            "is_bot": true,
            "first_name": "test",
            "username": "sunnytestbot"
        },
        "chat": {
            "id": 604252092,
            "first_name": "SunHo",
            "last_name": "Lee",
            "type": "private"
        },
        "date": 1529892458,
        "text": "to meet you"
    }
}
```

