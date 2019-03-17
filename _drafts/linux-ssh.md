# [Linux] Linux 접속하기

## Mac, Terminal에서
```
ssh 접속주소
```
초간단!!!!!


## Windows, Putty로

- [Putty 다운로드](https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html)


### 1. HostName/IP 설정
[그림](../img/putty1.png)

**_AWS에서 만든 서버 적용하려면.._**

HostName에 EC2 Instance의 'Public DNS (IPv4)' 또는 'IPv4 Public IP' 입력하기


### 2. Logging 설정
[그림](../img/putty3.png)

- Session Logging - Printable output 설정

내가 여태 입력한 것 출력된 것 다 저장된다. **추천!**

- Log file name 설정

내가 원하는 위치에 로그를 저장하는 폴더를 따로 만든다.

저장될 파일 이름은 putty_&Y&M&D_&T.log 하면 날짜시간 다 알 수 있어서 좋다.


### 3. Private Key 설정
[그림](../img/putty2.png)

Private key file for authentication을 .ppk 파일로 설정한다.

그러면 로그인할 때 매번 비밀번호 입력할 필요 없이 사용자이름만 입력하면 된다.

