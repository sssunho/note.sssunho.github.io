# AWS, Web Application Hosting
아키텍처 센터 - AWS 참조 아키텍처 - Web Application Hosting

[그림](../img/aws2.png)


## RoadBalancing

부하 균산 균형. 부하가 치우쳐지지 않게 방지하는 기술 - 라운드 로빈

L4 Switch: 전송 계층에서 밸런싱을 구현. TCP 수준에서 부하 균산 일어난다. 패킷...

> 우선순위란 큐를 부여한, 상태정보를 가지고 부하 균산하는


## Elastic Load Balancing

서버를 여러 대 둘 수 있게하는 SW


## EC2

서버. 365일, 24시간 계속 운영해야 하기 때문에 무정지 서비스를 제공해야 한다

그래서 동기화 문제 발생

**_IaaS (Infrastructure as a Service)_**: 아키텍처 지식이 없어도 참조 모델 이용하여 빠르게 사용
> 우리는 엔진X 사용 예정


## Web Server

정적 서버에 최적화 된 것
L4 – Application Server (=EC2) + Node.js돌아감
> AWS에선 하나만 허용.. 서버는 돈이 해결


## Database Server

RDS – MySQL

복제 관계 : 둘 중 하나가 죽었을 때를 대비

셰딩
