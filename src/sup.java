public class sup {
    static class A{
        String color = "black";
    }
    static class B extends A{
        void colorful(){
            System.out.println(super.color);
        }
        String color = "white";
    }

    public static void main(String[] args) {
        B b1 = new B();
        System.out.println(b1.color);
        b1.colorful();
    }
}
