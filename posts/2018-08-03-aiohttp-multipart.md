---
layout: post
title: aiohttp - multipart
date: 2018-08-03 00:00:00 +0300
tags: [aiohttp]
---


http://docs.aiohttp.org/en/stable/client_quickstart.html?highlight=file#post-a-multipart-encoded-file

```python
url = 'http://httpbin.org/post'
data = {'file': open('report.xls', 'rb')}
async with aiohttp.ClientSession() as session:
    async with session.post(apiEndpoint_send, data=data) as resp:
        return True
```

