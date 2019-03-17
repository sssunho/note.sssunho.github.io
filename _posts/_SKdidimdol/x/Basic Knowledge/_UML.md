# UML
Unified Modeling Language

요구분석, 시스템설계, 시스템 구현 등의 시스템 개발 과정에서, 개발자간의 의사소통을 원활하게 이루어지게 하기 위하여 표준화한 모델링 언어


### Class Diagrams
[참고](http://www.sparxsystems.com/resources/uml2_tutorial/uml2_classdiagram.html)

클래스 다이어그램은 객체 지향 시스템의 구성 요소를 보여줍니다.

[그림3](../img/img3.png)

상속구조가 없다는 것은 일반화(Generalization)가 없는 것이다.


#### interfaces
인터페이스를 구현함으로써 클래스는 필수 동작을 지원하므로 시스템에서 비 관련 요소를 동일한 방식으로 (즉 공통 인터페이스를 통해) 처리 할 수 ​​있습니다.

Communication 할 수 있게 해주는 약속, Protocol -행위에 대한 약속

가져다 쓰려면 구현을 해야 한다, 일종의 계약


#### Tables
Stereo Type으로 어휘 확장. 글씨로만 표현하지 못하는 것을 전달할 수 있게

ex) extends – 실선 화살표, implements – 점선 화살표


#### Associations
연관 관계, 모이면 멤버가 된다

접근 제한자 표현: -(private) #(protected) x(default), +(public)

클래스 이름이 기울어져 있으면 추상 클래스를 나타낸다. ex) <\<abstract>>


#### Aggregations
made up of smaller components, 구성품 관계.

강약 집합관계 표현 -마름모, 칠하거나 아니거나

0..*, 다대다 표시


#### 기타
Association Classes: 표시 유무 선택적

Realization: =implements

[그림4]()

Dependencies: 점섬 화살표, 이미 선이 있으면 생략한다
