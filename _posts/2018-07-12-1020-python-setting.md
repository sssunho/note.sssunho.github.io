---
layout: post
title: python/ install on python3
date: 2018-07-12 10:20:00 KST
description: You’ll find this post in your `_posts` directory. Go ahead and edit it and re-build the site to see your changes. # Add post description (optional)
img: software.jpg # Add image post (optional)
tags: [Productivity, Software] # add tag
---

### spec

- ubuntu
- python 3.5

<br>

```shell
$ python3 -version
$ sudo apt-get install python3-pip
$ pip3 --version
$ sudo apt-get install virtualenv

$ virtualenv -p python3 `virtualenv_name`
Already using interpreter /usr/bin/python3
Using base prefix '/usr'
New python executable in /home/ubuntu/mycat/bin/python3
Also creating executable in /home/ubuntu/mycat/bin/python
Installing setuptools, pkg_resources, pip, wheel...done.

$ source `virtualenv_name`/bin/activate
$ . `virtualenv_name`/bin/activate


```



https://cjh5414.github.io/ubuntu-pyenv-virtualenv/



ImportError: No module named 'google' 

```
pip install --upgrade google-api-python-client
```

pip 설치하기
`python3 get-pip.py`




