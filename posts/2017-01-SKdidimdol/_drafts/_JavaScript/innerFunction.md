# inner function
함수 안에 있는 함수.
함수 내에서만 접근 가능하다.

```javascript
>   function outer() {
        var a = 10;
        var b = 20;

        console.log('a = ' + a + ', b = ' + b);

        function inner() {
            var c = 30;
            console.log('c = ' + c);
        }

        inner();
    }
>   outer();
<    a = 10, b = 20
<    c = 30
```

```javascript
>   function outer() {
        var a = 10;
        var b = 20;

        console.log('a = ' + a + ', b = ' + b);

        function inner() {
            //var c = 30;
            console.log('c = ' + c);
        }

        inner();
    }
>   outer();
<   a = 10, b = 20
<   Uncaught ReferenceError: c is not defined
```

```javascript
>   function outer() {
        var a = 10;
        var b = 20;

        console.log('a = ' + a + ', b = ' + b);

        function inner() {
            //var c = 30;
            console.log('c = ' + c);
        }

        inner();
    }
>   c = 40;
>   outer();
<   a = 10, b = 20
<   c = 40
```
global scope에서 c를 찾았다



### 함수를 return하면 어떻게 될까?
반환된 inner function(내부함수), **Closure**라고 한다. 캡슐화!

But! JavaScript의 문법은 아니다.

> JavaScript의 캡슐화

> http://www.crockford.com/

> http://javascript.crockford.com/private.html
