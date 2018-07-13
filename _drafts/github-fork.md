## Github, forked repository로 작업하기

https://help.github.com/articles/fork-a-repo/



```shell
$ git remote -v
origin	https://github.com/sssunho/translator_api.git (fetch)
origin	https://github.com/sssunho/translator_api.git (push)

$ git remote add upstream https://github.com/psy2848048/translator_api.git
origin	https://github.com/sssunho/translator_api.git (fetch)
origin	https://github.com/sssunho/translator_api.git (push)
upstream	https://github.com/psy2848048/translator_api.git (fetch)
upstream	https://github.com/psy2848048/translator_api.git (push)

$ git fetch upstream
$ git merge upstream/master
```

