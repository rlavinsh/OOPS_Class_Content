package inheritence;

public class Fruit {
    void taste() {
        System.out.println("Fruit is tasty");
    }
    void color() {
        System.out.println("Fruit color is awesome");
    }
}

    class apple extends Fruit {

        void healthyApple() {
            System.out.println("An apple a day keep the doctor away");
        }

    }

    class Lichi extends apple{
        void seeds(){
            System.out.println("contains seeds");
        }

    public static void main(String[] args) {
        Lichi ll = new Lichi();
        ll.color();
        ll.taste();
        ll.healthyApple();
        ll.seeds();
    apple aa = new apple();
    aa.taste();
    aa.color();
    aa.healthyApple();

    }
}

