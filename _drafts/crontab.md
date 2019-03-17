# Crontab

티켓 잔여석 알림을 만드는 중, 스케줄러를 찾다가 crontab을 알게 되었다.

**Linux, MacOS** 둘 다에서 사용할 수 있다. 짱!



1. crontab 파일 열기

````shell
crontab -e
````

이미 존재한다면 수정모드로, 없다면 새로운 파일이 열린다.




2. 스케줄 입력하기

```
* * * * *  command to execute
│ │ │ │ │
│ │ │ │ └─── day of week (0 - 6) (0 to 6 are Sunday to Saturday, or use names; 7 is Sunday, the same as 0)
│ │ │ └──────── month (1 - 12)
│ │ └───────────── day of month (1 - 31)
│ └────────────────── hour (0 - 23)
└─────────────────────── min (0 - 59)
```




만약 10분마다 virtualenv를 활성화시키고 qwer.py파일을 작동되게 하고싶다면

```
10 * * * * . ./venv/bin/active && python3 path/to/qwer.py
```




3. 저장하기

원하는 스케줄을 다 입력했다면 저장하고 나가면 끝!




4. 저장한 스케줄 확인하기

```shell
crontab -l
```


굉장히 간단한 방법으로 스케줄러를 설정할 수 있다. 개꿀!


#### 참고

- <https://ole.michelsen.dk/blog/schedule-jobs-with-crontab-on-mac-osx.html>


- <http://hytgbn.net/2009/08/crontab-mac%EB%93%B1%EC%97%90%EC%84%9C-crontab-%EC%82%AC%EC%9A%A9%EB%B2%95/>