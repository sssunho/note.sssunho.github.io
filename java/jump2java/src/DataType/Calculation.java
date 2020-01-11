package DataType;

public class Calculation {
    public static void main(String[] args) {
        System.out.println(7%3);
        System.out.println(3%7);

        int i = 0;
        System.out.println(i++);    // 출력값: 0, 값이 참조된 후에 증가
        System.out.println(++i);    // 출력값: 2, 값이 참조되기 전에 증가
        // 증감연산자가 변수의 앞/뒤에 붙는 것에 따라 증감되는 순서가 다르다.
    }
}
