package SingletonePattern;

/* Singleton Pattern
단 하나의 객체만을 생성하게 강제하는 패턴
 */
class Singleton {
    private static Singleton one;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (one == null) {
            one = new Singleton();
        }
        return one;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
