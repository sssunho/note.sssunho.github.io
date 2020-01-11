> WebStrom의 장점 중에 하나, **서버를 연결해서 파일을 쉽게 주고받을 수 있다!**

>  심지어 SSH session 터미널도 열 수 있다! 바밤

### Deployment 들어가는 방법
프로젝트 파일을 열지 않은 상태일 때,
Default Settings - Build, Execution, Deployment - Deployment

또는 프로젝트 파일을 열어둔 상태일 때,
Tools - Deployment - Configuration


## Add Deployment
- Type: SFTP

SSH File Transfer Protocol 또는 Secure File Transfer Protocol이라 부른다.

신뢰할 수 있는 데이터 스트림을 통해 파일 접근, 파일 전송, 파일 관리를 제공하는 네트워크 프로토콜이다.


- SFTP host: 연결할 서버 주소 입력

- Username: 로그인할 사용자이름

- Auth type: Key pair

Private Key(.ppk) 파일로 연결할 것이다. 그러면 따로 비밀번호 입력할 필요 없다.


그림대로 설정한 후 'Test SFTP Connection'을 클릭하여 연결됐는지 확인한다.

연결이 확인됐으면 'Autodetect'를 해준다.

'Web server root URL'이 자동으로 입력된 것을 확인할 수 있다.


## Mappings
프로젝트를 오픈한 상태에서 가능하다

빨간박스를 클릭해서 폴더를 설정하면 그 폴더안에 있는 파일들을 내려받거나 내 프로젝트에서 업로드할 수 있다

- 'Browse Remote Host'를 통해서 연결된 폴더를 볼 수 있다.

  (Tools - Deployment - Browse Remote Host)

- 다운로드 & 업로드
  오른쪽 마우스를 누르면 Download from&Upload to 버튼이 있다.

