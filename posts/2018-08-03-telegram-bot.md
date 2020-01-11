---
layout: post
title: Telegram Bot
date: 2018-08-03 13:25:00 KST
description: You’ll find this post in your `_posts` directory. Go ahead and edit it and re-build the site to see your changes. # Add post description (optional)
img: software.jpg # Add image post (optional)
tags: [telegrambot, bot]
---

/setdescription
봇 눌렀을 때, 설명 띄우기

BotFather - /mybots
Bot Settings - Group Privacy - disabled
해야 일반 단톡방에서도 메세지를 읽어올 수 있다.


sendPhoto
https://core.telegram.org/bots/api#sendphoto
> 도움 1도 안된다

```python
data = {
'chat_id': str(chat_id),
'photo': open('./photos/{}'.format(photo), 'rb'),
'caption': 'caption aweoirhjqw;ef'
}
async with aiohttp.ClientSession() as session:
async with session.post(url, data=data) as resp:
return True
```


editMessage

```python
async def edit_message(self, chat_id, message_id, message, reply_markup=None):
apiEndpoint_edit = "https://api.telegram.org/bot{}/editMessageText".format(self.token)
headers = {"Content-Type": "application/json"}
data = {
"chat_id": chat_id,
"text": message,
"message_id": message_id,
"parse_mode": "Markdown"
}
if reply_markup:
for key, value in reply_markup.items():
data[key] = value

async with aiohttp.ClientSession(headers=headers) as session:
async with session.post(apiEndpoint_edit, data=json.dumps(data)) as resp:
ret = await resp.json()
return ret
```

```python
reply_markup = {"reply_markup": {
"inline_keyboard": [
[
{'callback_data': 'lc_telegram', 'text': 'telegram', 'url': 'https://t.me/langchain_kr'},
{'callback_data': 'lc_website', 'text': 'website', 'url': 'http://langchain.io/'}
],
[
{'callback_data': 'lc_koreos', 'text': 'koreos', 'url': 'http://koreos.io/LangChain'},
{'callback_data': 'set_lang', 'text': '⚙ Set your language'}
]
]
}}
```


