mysqlclient를 설치하려다가 에러가 생길 때가 있다.

에러를 캡쳐해두지 않아서 아쉽다.. 한줄알았지ㅠㅠ


## MacOS에서
```shell
$ brew install mysql        # 실행하고 다시
$ pip3 install mysqlclient  # 하면 된다.
```



## Linux에서
E: Sub-process /usr/bin/dpkg returned an error code (1) 에러 발생시
```shell
$ sudo apt-get autoremove	# 사용하지 않는 패키지 삭제
$ sudo apt-get autoclean	# 다운로드된 패키지에서 오래된 저장소 삭제
$ pip3 install mysqlclient