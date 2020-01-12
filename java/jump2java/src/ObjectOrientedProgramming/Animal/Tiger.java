package ObjectOrientedProgramming.Animal;

// polymorphism(다형성): 하나의 객체가 여러 개의 자료형을 가질 수 있는 것
// 인터페이스를 상속받으려면 implements 키워드를 사용해야 한다.
// 인터페이스는 여러개를 구현할 수 있다.
public class Tiger extends Predator implements Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}
