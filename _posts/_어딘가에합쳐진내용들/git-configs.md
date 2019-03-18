# 기본 설정

## 에디터 설정
```shell
git config --global core.editor 에디터이름

# vim을 추천합니다!
git config --global core.editor vim		
```


## 사용자 설정
```
git config --global user.email '사용자@이메일'
git config --global user.name '사용자이름'
```
git을 사용하다가 `permission denied`가 뜬다면 설정을 확인하고,
만약 잘못 등록되어 있다면 수정해주면 된다.