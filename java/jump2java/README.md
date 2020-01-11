# 점프 투 자바

https://wikidocs.net/book/31



시작 날짜: 2020-01-12

> - 시작한 이유
>
> `Test-Driven Development: By Example`을 실습과 함께 해보려 했는데, 나는 자바로 Hello, World!조차 할 줄 모르는 상태라 예제를 찾다가. 우연히 점프 투 자바 웹문서를 찾게 되었다.



## Hello World!

```java
package HelloWorld;

// 파일명과 클래스명이 동일한 경우 클래스명 앞에 public 키워드를 붙여준다.
public class HelloWorld {
    //　main 메소드가 없으면 실행되지 않는다. Run 버튼 활성화도 안됨
    public static void main(String args[]) {
        /* main
        시작과 끝을 관리하는 main 메소드
        클래스 내의 함수는 함수라 말하지 않고 메소르다고 한다. 자바는 클래스 기반이므로 메소드라고 말하자.
         */
        /* static
        인스턴스 생성없이 실행할 수 있음을 의미
         */
        System.out.println("Hello World!");
    }
}
```



## Data Type (자료형)

### Numbers

#### 증감연산자

```java
package DataType;

public class Calculation {
    public static void main(String[] args) {
        System.out.println(7%3);
        System.out.println(3%7);

        int i = 0;
        System.out.println(i++);    // 출력값: 0, 값이 참조된 후에 증가
        System.out.println(++i);    // 출력값: 2, 값이 참조되기 전에 증가
        // 증감연산자가 변수의 앞/뒤에 붙는 것에 따라 증감되는 순서가 다르다.
    }
}
```



### StringBuffer

```java
package DataType;

public class StringBufferDataType {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        System.out.println(sb.toString());

        /* String과의 차이점
        StringBuffer는 mutable 객체여서 단 한번만 생성되고 값을 변경할 수 있다.
        String은 immutable 객체여서 수정 되는게 아니라 또 다른 객체를 생성하여 리턴한다.

        StringBuffer는 String보다 메모리 사용량이 많고 속도도 느리다.
         */

        StringBuffer sb2 = new StringBuffer();
        sb2.append("World2");
        sb2.insert(0, "Hello ");
        System.out.println(sb2.toString());
    }
}
```



### List

```java
package DataType;

import java.util.ArrayList;

public class ListDateType {
    public static void main(String[] args) {
//        ArrayList pitches = new ArrayList();
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add(0, "129");

        System.out.println(pitches.get(1));
    }
}
```

Generics 표현식으로 리스트 안에 담을 수 있는 자료형을 명시한다.



### Map

```java
package DataType;

import java.util.HashMap;

public class MapDataType {
    public static void main(String args[]) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.containsKey("people"));
    }
}
```

Python의 Dictionary 자료형과 같은 Map.