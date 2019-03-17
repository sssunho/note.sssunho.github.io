# DOM
https://developer.mozilla.org/ko/docs/Gecko_DOM_Reference/%EC%86%8C%EA%B0%9C

**HTMLDocument = window.document**


```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <script>
    window.addEventListener('load', function (event) {
      window.document.write(event);
    }, false)
  </script>
</head>
<body>
  <h1>Load Event!!!</h1>
  <hr>
</body>
</html>
```
[결과](../img/js-basic1.png)

write 함수가 전체내용을 지운다, 바꿔버려! ~~왜지?..~~

### ?
block - 전체
/ content - 사이즈만큼

span / div

v
### load
https://developer.mozilla.org/en-US/docs/Web/Events/load

자원의 적재가 다 끝나면 발생하는 이벤트


### innerHTML
HTMLElement – Properties-Element – innerHTML

https://developer.mozilla.org/en-US/docs/Web/API/Element/innerHTML

