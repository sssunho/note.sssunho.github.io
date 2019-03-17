# GIT - Cannot Merge

커밋이 꼬이거나 같은 파일을 여기저기서 수정했을 때 `충돌`이 생길 수 있다.

```
git reset --hard HEAD~1

git rebase --abort
#또는
git rebase

# conflit 생긴 파일 수정/해결하기

git add 충돌생긴파일.py
git rebase --continue

git commit --amend
git push origin HEAD:브랜치
```
