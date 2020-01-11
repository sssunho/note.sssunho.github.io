# 점프 투 자바

https://wikidocs.net/book/31



시작 날짜: 2020-01-12

> - 시작한 이유
>
> `Test-Driven Development: By Example`을 실습과 함께 해보려 했는데, 나는 자바 프로젝트를 혼자 만들줄도 모르는 상태여서 예제를 찾다가. 우연히 점프 투 자바 웹문서를 찾게 되었다.



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





## Control flow statement (제어문)

### For each

```java
package ControlFlowStatement;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
```

Java에는 `for (초기치; 조건문; 증가치)`만 있는줄 알았었다. 계속 업그레이드 되는구만





## Object Oriented Programming(객체지향 프로그래밍)

### Inheritance (상속)

- Method Overriding
  부모 클래스의 메소드를 자식 클래스가 동일한 형태로 또다시 구현하는 행위
- Method Overloading
  메소드의 이름은 같지만 파라미터를 다르게 구현하는 행위

- 자바는 다중 상속을 지원하지 않는다
  다중 상속은 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다.
  A와 B에 sleep이라는 함수가 똑같이 있는데 class C가 A와 B를 상속받은 경우, sleep을 실행했을 때 어떤 클래스의 메소드를 실행할 것인가?
  다중 상속을 지원하게 되면 애매모호한 부분이 생기게 된다. 자바는 이러한 불명확한 부분을 애초에 잘라 냈다.



#### Constructor(생성자)

객체 변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제하는 방법

객체가 생성될 때 호출된다. (new 키워드로 객체가 만들어질 때)

생성자의 규칙대로만 객체를 생성할 수 있다.



- 생성자 규칙

1. 클래스명과 메소드명 동일
2. 리턴 타입 정의하지 않음



#### Interface(추상)

클래스는 한번밖에 상속이 안되지만, 인터페이스는 다중 구현을 할 수 있다.

클래스가 아니며, 클래스와 관련이 없다.

구현 객체들끼리 같은 동작을 보장하기 위한 목적으로 사용된다.

의존성을 제거할 때 유용하게 쓸 수 있다.

인터페이스를 상속받으려면 `implements` 키워드를 사용해야 한다.



- 인터페이스의 메소드

메소드의 이름과 입출력에 대한 정의만 있고 내용은 없다. 인터페이스는 '규칙'이기 때문이다.

interface(추상)를 implements(구현)한 클래스들이 메소드의 내용을 작성(구현)해야 한다.

