# \[JavaScript] 특징
[참고](https://developer.mozilla.org/en-US/docs/Web/JavaScript)


## 언어적 특징

1. First-class Functions

    프로그래밍 언어는 해당 언어의 함수가 다른 변수처럼 취급 될 때 First-class 함수를 갖고 있다고 한다.

    코드를 데이터로 사용할 수 있는 언어!


2. Prototype-based programming

    클래스가 명시적으로 정의되지 않고,

    속성 및 메서드를 다른 클래스의 인스턴스에 추가하거나 빈 오브젝트에 추가하는 객체 지향 프로그래밍의 한 형태.

    객체를 원형(프로토타입)으로 하여 복제의 과정을 통하여 객체의 동작 방식을 다시 사용할 수 있다.

    그 전에는 객체지향 요소가 없었는데 요구사항 증가로 객체지향 모양을 갖추게 되었다.


3. Lightweight interpreted, declarative

    가볍게 해석하고, 선언한다.


4. Multi-paradigm

    함수기반으로 시작하여 점점 여러가지 성격을 갖추게 되었다.


5. Dynamic scripting language

    컴파일과 실행이 분리되어 있다

    **입력값에 따라 타입이 정해진다.** 문자열을 기본형으로 받아들인다.

    JavaScript는 1950년에 등장, 웹 브라우저에서 문자열을 처리하는데 도움을 주기 위해 생겼다.

    PER의 영향 많이 받음. 웹에서 돌아가야 하기 때문에 더 가볍고, 컴파일이 아닌 Script 형태로 나옴.

    > 기본형 = 값을 갖는 데이터 타입 = Primitive Type



## 그 밖에도..

- JavaScript 표준은 ECMAScript이다.

  ECMAScript는 웹 표준. (웹 표준은 사양, 청사진을 의미한다)

  ECMAScript2015(ECMAScript6, ES6): NodeJS 지원

  JavaScript는 구현체. 난해하고 어려워서 100% 호환하면서 쉬운 TypeScript 등장한다.

  > **_TypeScript?_**

  > compile-to-JavaScript: 컴파일하면 JavaScript가 되는 언어.

  > 컴파일 시점에 타입 체크를 하고, 전통적인 객체기반 프로그래밍 패턴을 도입하는 것 이외에도 강력한 기능들을 JavaScript 에 추가한다


- JavaScript는 비동기 방식을 사한다

    > **_동기 & 비동기_**

    > 동기: INPUT과 OUTPUT이 하나의 사이클. 함수가 호출되면 다 실행될 때까지 대기상태 유지.

    > 비동기: 대기상태 없이 처리하는 것, 데이터 무결성 문제가 발생한다.


- JavaScript는 BIG DATA의 Back-end에서 사용하지 않는다

  Front-end에서는 Data-Driven Documents(D3) 사용한다.

