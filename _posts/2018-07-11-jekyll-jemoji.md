---
layout: post
title: jekyll/ GemNotFound  
date: 2018-07-11 22:48:00 KST
tags: [githubpages, jekyll, errors]
---

## problem

github pages에 포스팅할 때, 수정사항이 반영됐나 바로 확인하기 위해서 `jekyll serve`를 돌리고 싶었습니다.

```shell
$ jekyll serve
/Library/Ruby/Gems/2.3.0/gems/bundler-1.16.2/lib/bundler/spec_set.rb:91:in `block in materialize': Could not find gemoji-3.0.0 in any of the sources (Bundler::GemNotFound)
...
```
GemNotFound가 뜨면서 `gemoji`를 찾을 수 없다고 합니다.

<br>

## cause

Gemfile에 추가해둔 gemoji가 문제입니다. gemoji가 설치가 안되어 있는거죠.

그럼 gemoji를 설치해주면 되겠습니다.

<br>

## solution

```shell
$ bundle
```
`bundle` 명령어를 통해 Gemfile에 추가한 gem을 설치해줍니다.

```shell
Gem::FilePermissionError: You don't have write permissions for the /var/folders/53/m5_nh66s4zqf0r36sgc3dyx40000gp/T/bundler20180711-1697-1vghnecgemoji-3.0.0/bin directory.
An error occurred while installing gemoji (3.0.0), and Bundler cannot continue.
Make sure that `gem install gemoji -v '3.0.0' --source 'https://rubygems.org/'` succeeds before bundling.

In Gemfile:
  gemoji
```
라며 permission error가 나타날 수도 있습니다.

```shell
# 방법 1
$ gem install gemoji -v '3.0.0' --source 'https://rubygems.org/'

# 방법 2
$ sudo bundle
Don't run Bundler as root. Bundler can ask for sudo if it is needed, and installing your bundle as root will break this application for all non-root users on this machine.
Fetching gem metadata from https://rubygems.org/...........
...
Bundle complete! 3 Gemfile dependencies, 29 gems now installed.
Use `bundle info [gemname]` to see where a bundled gem is installed.
```
두 가지 방법으로 설치를 할 수 있습니다.

두번째 방법은 경고가 뜨기 때문에 첫번째 방법을 추천합니다.

