# \[JavaScript] Object
    var obj = {
        key1: value1,
        key2: value2
    };
속성 이름과 속성 값으로 이루어져 있다.

속성 이름(key)를 입력할 때 문자니까 '' 사이에 넣어야 된다 생각했지만 아니었다.

속성 값(value)에는 진짜 아무거나 넣어도 된다.

문자, 숫자, boolean 뿐만 아니라 함수, 객체도 넣을 수 있다.

```javascript
>   var obj = {
        key1: 123,
        key2: 'abc',
        key3: true,
        key4: {x: 'sunny', y: 'rainy'}
    };

>   obj.key1;
<   123
>   obj.key4;
<   {x: "sunny", y: "rainy"}
```


```
>   obj.key2 = false;
<   false
>   obj.key2;
<   false
```
JavaScript는 public이 기본값이기 때문에! 속성값을 바꿀 수 있다.

다른 타입으로도 변경 가능하다.

_그래서 위험 요소가 될 수 있다._

