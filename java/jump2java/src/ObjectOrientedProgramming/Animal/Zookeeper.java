package ObjectOrientedProgramming.Animal;

public class Zookeeper {
//    public void feed(Tiger tiger) {
//        System.out.println("feed apple");
//    }
//
//    public void feed(Lion lion) {
//        System.out.println("feed banana");
//    }

    // 동물 종류에 의존적인 클래스에서 동물 종류와 상관없는 독립적인 클래스가 되었다.
    public void feed(Predator predator) {
//        System.out.println("feed food");
        System.out.println("feed " + predator.getFood());
    }

    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zookeeper.feed(tiger);
        zookeeper.feed(lion);
    }
}
