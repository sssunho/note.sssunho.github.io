# EC2, Ubuntu 서버 만들기

1. Region, Asia Pacific(Seoul)로 설정

[그림](../img/aws-ec2_1.png)


2. Compute - EC2 - Launch Instance 클릭

[그림](../img/aws-ec2_2.png)


3. Step 1: Ubuntu Server 클릭

[그림](../img/aws-ec2_3.png)


4. Step 2~5

[그림](../img/aws-ec2_4.png)

Next를 눌러줍니다. 기본 설정으로 충분하다

Step 4, Add Storage는 Volume(디스크) 추가하는 거


5. Step 6: Security Group 설정

[그림](../img/aws-ec2_5.png)

SSH, HTTP, HTTPS 만들어준다

**Source 설정하기**

My IP: 내 아이피

Anywhere: 개발 중엔 위험하다, 서비스 실행 할 때 쓰도록 한다

Custom: 특정 IP 설정가능하다


6. Private Key 저장

[그림](../img/aws-ec2_6.png)

PEM 파일이 있어야 사용 가능하다!

**매우 중요! 절대 노출하지 말기!**

저장하고나서 생성된 서버를 목록에서 확인할 수 있다.
