# Elastic IPs, 정적 IP 설정하기

1. 새로운 IP 주소 만들기

[그림](../img/aws-ip1.png)

'Allocate new address'를 클릭하면 새로운 IP 주소가 할당된다


2. IP 주소 서버와 연결시키기

[그림](../img/aws-ip1.png)

새로 만든 IP 주소를 선택한 상태에서 'Actions'를 클릭헤서 'Associate address'를 클릭한다

[그림](../img/aws-ip1.png)

'Instance'에 이전에 만들어둔 EC2 Instance ID를 입력한다

그리고 'Associate' 누르면 연결 끝!


    EC2 Instance 중지할 때 IP를 삭제하지 않으면 Stop 과금, 패널티를 받으므로 조심!
    Instance 삭제할 때 IP도 없앨건지 묻기 때문에 그 때 삭제하면 됩니다.