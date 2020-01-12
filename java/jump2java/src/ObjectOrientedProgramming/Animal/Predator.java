package ObjectOrientedProgramming.Animal;

// abstract 키워드를 표기해줘야 한다
public abstract class Predator extends Animal {
    public abstract String getFood();

    // interface와 달리, 추상 클래스에 내용이 있는 메소드를 작성하면 상속받은 객체에서 메소드를 실행할 수 있다.
    public boolean isPredator() {
        return true;
    }
}

///* Interface
//클래스는 한번밖에 상속이 안되지만, 인터페이스는 다중 구현을 할 수 있다.
//클래스가 아니며, 클래스와 관련이 없다.
//구현 객체들끼리 같은 동작을 보장하기 위한 목적으로 사용된다.
// */
//public interface Predator {
//    /* 인터페이스의 메소드
//    메소드의 이름과 입출력에 대한 정의만 있고 내용은 없다.
//    인터페이스는 '규칙'이기 때문이다.
//    interface(추상)를 implements(구현)한 클래스들이 메소드의 내용을 작성(구현)해야 한다.
//     */
//    public String getFood();
//}
