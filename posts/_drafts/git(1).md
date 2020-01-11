# 기본적인 GIT 사용법(1)

### 1. git 시작하기
```
git clone 주소
```
내가 작업할 repository 주소를 넣어서 repository를 다운받아 쓸 수 있다.


### 2. 작업할 branch 따기
```
git branch -vv
```
현재 내가 따온 브랜치 목록, commit 상황 및 마지막 commit 제목을 볼 수 있다.

사용중인 branch 앞에 *표시가 뜬다.


```
git checkout -b 브랜치이름 따올브랜치이름
```
내가 쓸 브랜치가 목록에 없다면 위의 명령어를 통해 브랜치를 가져올 수 있다.

브랜치 이름은 내가 임의로 정할 수 있다. 나는 보통 브랜치이름 그대로 가져온다.

따올 브랜치 이름은 origin/브랜치이름 또는 브랜치이름으로 가져오는데,
내가 어떤 git을 쓰는지에 따라 다르니까 잘 알아보도록!(무책임)


```
git branch -D 삭제할브랜치
```
브랜치를 잘못 따왔다면 당황하지말고 삭제해주자!


### 3. status, 상태 확인
```
git status
```
변경된 파일 목록 및 상태를 확인할 수 있다.


### 4. add
```
git add 파일이름
```
status에서 확인한 수정된 파일을 commit하기 위해 add를 해주어야한다.

그냥 다 넣을거면 `git add .`하면 된다.


### 5. commit
```
git commit
git commit --amend
```
`git status`를 통해 수정사항을 다 add 했다면 commit을 해준다!

그러면 하나의 파일이 뿅! 뜰텐데 첫번째 라인에 commit 메세지를 입력해준다.
`--amend`는 gerrit에서 가능한 기능인데 이전에 commit한 것을 따라가게 해준다.

### 6. push
```
git push origin HEAD:origin/브랜치이름
```
commit한 것을 repository에 적용되도록 해준다.



여기까지가 git의 제일제일 기본적이면서도 최소한의 사용 방법이다.
git은 정말 끝이 없다..!!!!!

> **참고**
>
> https://git-scm.com/
