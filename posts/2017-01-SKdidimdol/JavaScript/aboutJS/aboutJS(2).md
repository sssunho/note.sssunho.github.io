# [JavaScript] About JavaScript (2) - What JavaScript implementations are available?
[About JavaScript](https://developer.mozilla.org/en-US/docs/Web/JavaScript/About_JavaScript)
(1)을 이어서 '자바스크립트는 어떻게 구현되어 있을까'에 대해 보겠다.


JavaScript는 브렌던 아이크(Brendan Eich)가 만들었다.
브렌던 아이크가 MDN(Mozilla Developer Network), Mozila 재단의 캡틴이었기 때문에 MDN이 JavaScript에 대한 모든 권한을 갖고있다.

이후 ECMA-262 Edition 5 및 이후 버전을 준수하도록 업데이트되었다.
- ECMAScript: JavaScript 언어의 사양, 웹 표준.


### JavaScript Engine

a program or interpreter which executes JavaScript code.
자바스크립트 코드를 실행시켜주는 인터프리터/프로그램을 말한다.

JavaScript의 가장 일반적인 호스트 환경은 웹 브라우저다.



    Each of Mozilla's JavaScript engines expose a public API which application developers can use to integrate JavaScript into their software.
    By far, the most common host environment for JavaScript is web browsers.
    Web browsers typically use the public API to create host objects responsible for reflecting the DOM into JavaScript.

    모질라의 자바스크립트 엔진은 공개 API를 제공하여 자바스크립트를 소프트웨어에 통합 할 수 있습니다.
    JavaScript를 위한 가장 일반적인 호스트 환경은 웹 브라우저입니다.
    웹 브라우저는 일반적으로 public API를 사용하여 DOM을 JavaScript로 반영하는 호스트 객체를 만듭니다.

- host environment: 프로그램에게 서비스를 제공하는 장치나 프로그램을 의미함.
- host objects:
- DOM
