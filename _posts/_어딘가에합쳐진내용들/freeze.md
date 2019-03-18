설치된 패키지들을 텍스트 파일로 만들기 (Output: installed packages in requirements format)

#### 패키지 텍스트 파일 만들기
```
$ pip3 freeze > requirements.txt
```

#### 패키지 텍스트 파일로 설치하기
```
$ pip3 install -r requirements.txt
```