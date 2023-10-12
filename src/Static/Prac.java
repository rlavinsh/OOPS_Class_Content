package Static;

public class Prac {

//    static {
//        System.out.println("Block-1");
//    }
    Prac(){
        System.out.println("Constructor calling");
    }
    static {
        System.out.println("Block 2");
    }

    public static void main(String[] args) {
        Prac p1 = new Prac();
    }

}
