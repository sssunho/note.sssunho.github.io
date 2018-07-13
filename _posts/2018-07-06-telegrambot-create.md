---
layout: post
title: bot/ create telegram bot (1)
date: 2018-07-06 00:49:00 KST
tags: [bot, telegram]
---

## issue

회사에서 챗봇 서비스를 제공하기로 했습니다.

챗봇을 인공지능으로 대응하는 곳이 많다고 하지만, 아직 인공지능에게 온전히 맡기기엔 어려운 상황입니다.

기능을 최소한으로, 하나에 집중해서 만드는 게 더 효과적입니다. 선택과 집중을 하는 것이죠.

쨋든, 좋은 기회를 얻게 되어서 챗봇을 만들어 보겠습니다.

<br>

## process

1. `BotFather` 검색하여 사용자 추가하고 대화창에 들어간다. (텔레그램에서)

    <br>

2. `/start` 메세지 전송

    ```
    I can help you create and manage Telegram bots. If you're new to the Bot API, please see the manual.

    You can control me by sending these commands:

    /newbot - create a new bot
    /mybots - edit your bots [beta]

    Edit Bots
    /setname - change a bot's name
    /setdescription - change bot description
    /setabouttext - change bot about info
    /setuserpic - change bot profile photo
    /setcommands - change the list of commands
    /deletebot - delete a bot

    Bot Settings
    /token - generate authorization token
    /revoke - revoke bot access token
    /setinline - toggle inline mode
    /setinlinegeo - toggle inline location requests
    /setinlinefeedback - change inline feedback settings
    /setjoingroups - can your bot be added to groups?
    /setprivacy - toggle privacy mode in groups

    Games
    /mygames - edit your games [beta]
    /newgame - create a new game
    /listgames - get a list of your games
    /editgame - edit a game
    /deletegame - delete an existing game
    ```

    메뉴얼이 답장으로 옵니다.

    <br>   

3. `/newbot` 메세지 전송

    ```
    Alright, a new bot. How are we going to call it? Please choose a name for your bot.
    ```

    만들 봇의 닉네임(이름)을 지어주라고 답장이 와요.

    <br>

4. `nickname` 전송

    username과 헷갈리지 마셔요. 이건 다른 봇이나 계정과 중복되도 상관없어요.

    ```
    Good. Now let's choose a username for your bot. It must end in `bot`. Like this, for example: TetrisBot or tetris_bot.
    ```

    이제 username을 보내라고 답장으로 알려주죠.

    <br>

5. `username` 전송

    - 규칙 1: 다른 username과 중복되면 안된다.
    - 규칙 2: **bot**으로 끝나야 된다. *_bot, bot, Bot, BOT* 대소문자 구분없음.

    ```
    Done! Congratulations on your new bot. You will find it at t.me/sunnytestbot. You can now add a description, about section and profile picture for your bot, see /help for a list of commands. By the way, when you've finished creating your cool bot, ping our Bot Support if you want a better username for it. Just make sure the bot is fully operational before you do this.

    Use this token to access the HTTP API:
    561471433:AAEeWZ7KdcqjYc4ujyufJHuKl8EpPQC3MdY

    For a description of the Bot API, see this page: https://core.telegram.org/bots/api
    ```

    봇이 만들어졌다며 축하메세지가 도착했습니다.

    <br>

6. 정보 저장해두기

    위의 메세지는 많은 정보를 갖고 있는데, 그 중에서도 아래 두개는 꼭 저장해주세요.

    - 토큰: 561471433:AAEeWZ7KdcqjYc4ujyufJHuKl8EpPQC3MdY
    - 프로필 주소: t.me/sunnytestbot

    <br>

7. `username`을 검색한다.
    
    결과로 내가 만든 봇의 `nickname`이 뜨는걸 확인할 수 있습니다.

    <br>

8. `/start` 메세지 전송

   모든 봇은 */start* 메세지와 함께 시작합니다.

<br>
<br>

그럼 이제 봇을 본격적으로 시작해보겠습니다.

<br>

> - 참고
>
> [Telegram Bot API Document](https://core.telegram.org/bots/api)

