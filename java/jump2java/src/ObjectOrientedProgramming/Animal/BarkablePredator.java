package ObjectOrientedProgramming.Animal;

// interface는 일반 클래스와 달리 extends 키워드를 이용하여 다중 상속이 가능하다.
public interface BarkablePredator extends Predator, Barkable {
}

//public interface BarkablePredator {
//    public void bark();
//    public String getFood();
//}
