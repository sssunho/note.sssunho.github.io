package ObjectOrientedProgramming;

// 파일명이 Counter.java라면 Counter.java 내의 Counter라는 클래스는 public 으로 선언하라는 관례(규칙)가 있다.
public class MethodVariable {
    int a;

    public void variableScope(int a) {
//        a++;  // 로컬 변수
        this.a++;
    }

    public static void main(String args[]) {
//        int a = 1;

        MethodVariable mv = new MethodVariable();
//        mv.variableScope(a);
//        System.out.println(a);
        mv.a = 1;
        System.out.println(mv.a);
    }
}
