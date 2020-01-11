package ObjectOrientedProgramming.Animal;

public class HouseDog extends Dog {
    /* Constructor(생성자)
    객체 변수에 값을 무조건 설정해야만 객체가 생성될 수 있도록 강제하는 방법
    객체가 생성될 때 호출된다. (new 키워드로 객체가 만들어질 때)
    생성자의 규칙대로만 객체를 생성할 수 있다.

    - 생성자 규칙
    1. 클래스명과 메소드명 동일
    2. 리턴 타입 정의하지 않음
     */
    public HouseDog(String name) {
        this.setName(name);
    }
    /* Method overriding
    부모 클래스의 메소드를 자식 클래스가 동일한 형태로 또다시 구현하는 행위
     */
    public void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    /* Method overloading
    이미 존재하는 메소드의 이름과 같지만 입력 파라미터를 다르게 구현하는 행위
     */
    public void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }

    public static void main(String[] args) {
//        HouseDog houseDog = new HouseDog();
//        houseDog.setName("happy");
//        houseDog.sleep();
//        houseDog.sleep(3);

        HouseDog houseDog = new HouseDog("happy");
        System.out.println(houseDog.name);
    }
}

/* 자바는 다중 상속을 지원하지 않는다
다중 상속은 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다.
A와 B에 sleep이라는 함수가 똑같이 있는데 class C가 A와 B를 상속받은 경우, sleep을 실행했을 때 어떤 클래스의 메소드를 실행할 것인가?
다중 상속을 지원하게 되면 애매모호한 부분이 생기게 된다. 자바는 이러한 불명확한 부분을 애초에 잘라 낸 언어이다.
 */
