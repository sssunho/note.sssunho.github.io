# GIT - .gitignore 파일 만들기

## .gitignore 파일 만들기
다운로드받은 레포지토리 안에다가 만들어준다.
repository에 넣지 않을 파일과 폴더(추적하지 않는 파일)들을 설정하는 `파일`이다.

```python
vim .gitignore
```
이렇게 파일을 만들고

```
*.pyc
*.swp
profile_pic/
app/docs
.coverage
.cache/
.tox/
coverage*
src/warning_application.py
.idea/
.DS_Store
```
이런식으로 무시할 것들을 적고 저장한다.
그냥 막쓴 예제니까 따라하는걸 추천하진 않습니다.

.gitignore에 적용되는 사항은 git status를 했을 때 수정사항에 포함되지 않습니다.

.gitignore에 등록되어 있지만 repository에 등록하고 싶은 경우에 그냥 `git add 파일이름`을 하면 된다.
