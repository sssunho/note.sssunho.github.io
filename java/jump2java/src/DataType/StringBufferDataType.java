package DataType;

public class StringBufferDataType {
    public static void main(String args[]) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");
        System.out.println(sb.toString());

        /* String과의 차이점
        StringBuffer는 mutable 객체여서 단 한번만 생성되고 값을 변경할 수 있다.
        String은 immutable 객체여서 수정 되는게 아니라 또 다른 객체를 생성하여 리턴한다.

        StringBuffer는 String보다 메모리 사용량이 많고 속도도 느리다.
         */

        StringBuffer sb2 = new StringBuffer();
        sb2.append("World2");
        sb2.insert(0, "Hello ");
        System.out.println(sb2.toString());
    }
}
