# [JavaScript] About JavaScript (1) - What is JavaScript?
> 언어를 배우고 사용할 때 해당 언어에 대한 특징들을 다 이해하고 사용하는가?
그렇지 않다면 분명 한계가 찾아온다.

> 설명하는 것은 어렵지만, 할줄 모른다면 제대로된 이해를 하지 못한 것이다.
나는 이제 이해하고 사용하고싶다. 그래서 설명하기 연습을 하기 위해 이 글을 작성한다.

> 모든 프로그래밍 언어는 해당 언어에 대한 모든 것이 담긴 문서(docs)를 갖고 있다.
docs만큼 자세히, 모든 것이 담긴 설명책은 없다.
프로그래밍 언어를 배울 때 처음 들은 말이 docs를 끼고 살아야한다는 것이었다.
물론 알고있지만 그러기 쉽지 않다. 봐도 잘 모르겠고 뭐라는지도 모른다.
영어라 손이 잘 가지도 않는다. 한글 해석도 있긴 하지만 좀 부족하다.
하지만 반복학습만큼 무서운 것은 없다. 계속 억지로 보면볼수록 익숙해진다. 노력하자!

> JavaScript를 표현할 때 사용되는 단어에 집중할 것이다.
그 단어를 정확히 모른다면 설명이 안되기 때문이다.
그래서 나는 한 단어씩 다 파고들 예정이다.

> 내 포스트는 프로그래밍의 기초가 정말 부족한 사람들을 도와줄 것이다.



**[JavaScript Document](https://developer.mozilla.org/en-US/docs/Web/JavaScript)
(Doc)를 항상 끼고 살자. 모르는게 있다면 Doc에서 먼저 찾아보자!**

나는 자세한 기본 배경이 궁금하여
[About JavaScript](https://developer.mozilla.org/en-US/docs/Web/JavaScript/About_JavaScript)
를 보았다.


## What is JavaScript?
    JavaScript® (often shortened to JS) is a lightweight, interpreted, object-oriented language with first-class functions,
    and is best known as the scripting language for Web pages, but it's used in many non-browser environments as well.
    It is a prototype-based, multi-paradigm scripting language that is dynamic, and supports object-oriented, imperative, and functional programming styles.
제일 먼저 나오는 문구이다.
나는 여기를 보자마자, '단어 하나하나를 다 몰라!!!'였다. 나 너무 심각한데? 난 그냥 개발자를 관두는게 나을까
싶지만 그래도 포기하지 않는다!


- [lightweight language](https://en.wikipedia.org/wiki/Lightweight_programming_language)

  가벼운게 뭐지? 언어가 가볍다는게 무슨 말일까?
  메모리 공간을 적게 차지하고, 최소한의 구문과 기능을 갖고 있고, 구현하기 쉽운 언어다.


- interpreted language

  인터프리터 언어는 항상 컴파일드 언어와 함께 언급된다.
  인터프리터 언어는 코드를 한줄씩 바로 해석해서 실행하고, 컴파일드 언어는 코드를 컴퓨터가 실행가능한 언어로 옮기고 실행한다.
  인터프리터는 원시 코드를 한 줄씩 읽어들여 목적 코드로 바꾸어준다.

  > 자세한 설명은 좋은 글을 보길 바란다.

  > Wikipedia: https://en.wikipedia.org/wiki/Interpreted_language, https://en.wikipedia.org/wiki/Compiler

  > 이명헌 경영스쿨: http://www.emh.co.kr/content.pl?compiled_interpreted


- object-oriented language/programming

  객체지향 프로그래밍이란 추상화, 캡슐화(Encapsulation), 상속(Inheritance), 다형성(Polymorphism)을 이용하여
  코드 재사용과 유지보수를 쉽게 할 수 있는 장점을 얻는, 객체들을 연결시켜 프로그래밍 하는 것이다.

  객체지향은 크게 프로토타입 기반(Prototype-based)과 클래스 기반(Class-based)로 나눠진다.

  > [Wikipedia](https://en.wikipedia.org/wiki/Object-oriented_programming)에
  있는 내용을 아래의 글들이 잘 설명해준다. 다 읽으면 객체지향을 제대로 이해할 수 있을 것이다.

  > [객체지향 개념 (쫌 아는체 하기)](https://www.slideshare.net/plusjune/ss-46109239)
  : 75장이라 엄청 많다 생각하고 읽기 시작했는데 엄청 쉽게 설명되있어서 순식간에 다 읽어버렸다.

  > [객체-지향 프로그래밍 이란 무엇인가? (OOP)](http://vandbt.tistory.com/10)
  : 내가 궁금해하던 부분들을 명쾌하게 설명해준 글이다. 나뿐만 아니라 모두가 그럴 것이라 생각한다.

  > [객체지향개발(OOP) 개념 정리](http://88240.tistory.com/228)
  : 객체지향의 특징 4가지를 설명해둔 글이다.


- [first-class function](https://en.wikipedia.org/wiki/First-class_function)

  직역하면 '일급 함수'이다. 함수형 언어를 뜻한다.
  함수가 다른 변수와 같이 취급되면 First-class function이라 한다. 코드를 데이터로 넣을 수 있다.
  그래서 반환값으로 숫자, 문자 뿐만 아니라 함수도 반환할 수 있다.

  > [JavaScript의 함수는 1급 객체(first class object)이다](http://bestalign.github.io/2015/10/18/first-class-object/)


- prototype-based programming

  JavaScript에는 class 개념이 없다.(라고 하지만 es6부터는 class 문법이 생기긴했다)
  대신, Object라는 Constructor(생성체)를 만들고 Prototype으로 이어 '상속'을 할 수 있다. function도 object

  그래서 Prototype-based Programming이다.
  Objective-oriendted Programming의 한 갈래이며, 이와 함께 언급되는 것이 Class-based Programming이다.

  > [Inheritance and the prototype chain](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Inheritance_and_the_prototype_chain)

  > [[Javascript] 프로토타입 이해하기](https://medium.com/@bluesh55/javascript-prototype-%EC%9D%B4%ED%95%B4%ED%95%98%EA%B8%B0-f8e67c286b67)
  : Docs를 해석해준 사이트

  > [객체 지향 언어의 두 가지 줄기](http://mohwa.github.io/blog/javascript/2015/10/16/prototype/)


- multi-paradigm programming language

  말 그대로, 다양한 언어적 특성을 갖고 있는 언어를 뜻한다.

  최초에는 브라우저 사용을 위한 script 언어였다.
  이후 객체지향의 모습을 갖추고, 함수 지향의 언어의 성격, 인터프리터언어의 성격을 가지게 되었다.

  JavaScript는
  부분적으로 concurrent(병행형),
  fuctional(함수형), imperative(명령형),
  reflaction(반영형, 함수와데이터를 구분하지 않는),
  object-oriented(객체 지향) 등의 프로그래밍 패러다임을 갖고 있다.


- dynamic scripting language(dynamic programming language)

  값에 의해 타입이 결정되는 형태의 언어.

  > **script는 무엇인가?**

  > 컴퓨터 프로그래밍에서의 스크립트란 (컴퓨터 프로세서가 아닌) 다른 프로그램에 의해 번역되거나 수행되는 프로그램이나 명령어들의 나열을 말한다. 몇몇 언어들은 명백히 스크립트 언어로 이해되어 왔는데, 그 중에서도 비교적 유명한 것들로는 Perl, JavaScript, IBM 메인프레임에서 사용되는 REXX, 그리고 Tcl/Tk 등이 있다. 월드와이드웹에서의 이용을 생각해보면, Perl 이나 JavaScript 등과 같은 스크립트 언어들은 웹 사이트의 입력 폼이나 기타 다른 서비스를 제공하기 위해 종종 사용되며, 웹 서버에 의해 처리된다.
    웹 페이지 내에 포함되어 있는 자바 스크립트는 웹 브라우저, 즉 클라이언트 측에서 수행된다.
    일반적으로 스크립트 언어들은 보다 구조적이며 컴파일이 필요한 C 나 C++ 과 같은 언어들에 비해 쉬우며 빠르게 작성할 수 있어서, 매우 제한된 능력을 가진 프로그램이나 컴파일된 기존 프로그램과 연결하여 재 사용될 수 있는 프로그램들을 만드는데 가장 적당하다. 그러나, 스크립트는 컴파일된 프로그램보다 실행시간이 오래 걸리는데, 그 이유는 모든 명령어가 기본 명령어 처리기에 의해 직접 처리되지 못하고, 우선 다른 프로그램에 의해 전처리가 필요하기 때문이다.

  > 스크립트는 때로, 명령들이 파일 내에 미리 저장되어 있다가 파일이름을 마치 하나의 명령처럼 입력했을 때, 운영체계의 명령어 인터프리터에 의해 파일 내의 내용이 차례로 수행되는 명령 목록을 의미하는 것으로 사용되는 경우도 있다 (MS-DOS의 배치파일이 그 예이다).

  > 멀티미디어 개발 프로그램들에서 말하는 "스크립트"는 상영될 멀티미디어 파일의 순서를 지칭하기 위해 입력된 명령어 순서를 의미한다 (이미지, 음향간의 순서와 그것들 간의 속도조절 그리고 있을법한 사용자 입력에 따른 결과 등).

  > _읽어도 모르겠다.._

