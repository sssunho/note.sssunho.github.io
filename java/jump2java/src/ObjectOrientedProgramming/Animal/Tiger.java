package ObjectOrientedProgramming.Animal;

// polymorphism(다형성): 한 개 이상의 자료형을 가지게 되는 것
// 인터페이스를 상속받으려면 implements 키워드를 사용해야 한다.
public class Tiger extends Animal implements Predator {
    public String getFood() {
        return "apple";
    }
}
