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
