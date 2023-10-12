package stat;

public class vechile {
    static class car{

        car(){
            System.out.println("car is there");
        }
        car(String type){
            System.out.println("car is running "+type);
        }
//        String c = "car is running";
    }
    static class Bike extends car{
        Bike(){
            super();
            System.out.println("Bike is running");
        }
    }

    public static void main(String[] args) {
        Bike b1 = new Bike();
    }
}
