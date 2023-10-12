package inheritence;

public class Human {
    // Here we will discuss the concept of super keyword
    void color() {
        System.out.println("Human");
    }
}
   class child extends Human {
        void  playing() {
//            super.color();
            System.out.println("child is playing");
        }



    public static void main(String[] args) {
        child cc = new child();
        cc.playing();
    }
}

