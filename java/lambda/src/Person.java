@FunctionalInterface
interface Say {
    int numbers(int a, int b);
}

public class Person {
    public void hi(Say say) {
        int number = say.numbers(3, 4);
        System.out.println("Number is " + number);
    }

    public static void main(String[] args) {
        // 람다식을 사용한 경우
        Person person = new Person();
        person.hi((a, b) -> {   // 람다식 평가 결과로 Functional Interface 인스턴스를 생성하기 때문에 Say를 따로 선언하지 않는다.
            System.out.println("parameter numbers are " + a + ", " + b);
            return 0;
        });

        /*// 람다식을 사용하지 않은 경우
        Person person = new Person();
        person.hi(new Say() {
            @Override
            public int numbers(int a, int b) {
                System.out.println("parameter numbers are " + a + ", " + b);
                return 0;
            }
        });*/
    }
}
