# OOP
Object-Oriendted Programming, 객체지향 프로그래밍

> JavaScript는 Function, Class 개념이 없다.

## Class & Function Library

#### Class Library
Function과 DATA가 합쳐진 것

#### Function Library
Function과 DATA가 따로 분리되어 있는, 절차적 언어


### 차이점
배포 방법이 다르다.

Class가 Function보다 크기가 더 크다.

Class가 메모리를 더 차지한다.

임베디드 SW에서는 Function을 사용한다.

임베디드 SW의 크기가 커지고 있다. 생산성에 집중하게 된다. ex) 삼성이 C++을 도입함



## 상속
객체 지향 프로그래밍의 특징이다.

할수록 결합도가 높아지기 때문에 최상의 방법은 아니다.

**Loosely Coupleds, High Cohension** (결합도는 낮게, 응집력은 높게)

#### Generalization
Parent <- Child = 청사진 – 객체

부모의 정보에 자식이 접근 가능하다.

객체는 여러 개 존재한다. 각각의 DATA, 공통 기능 존재 + 분기된 기능 발생

**Bottom Up!** 아래에서 위로
