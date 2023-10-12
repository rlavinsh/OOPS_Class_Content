package Static;

public class Demo {
    String name;
    static int age;

    public static void greet(){
        System.out.println("Hello duniya");
        Demo dd = new Demo();
        dd.calling();
//        calling();
    }
    public void calling(){
//        greet();
        System.out.println("Non static calling");
//        greet();
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.name = "Amit";
        d1.age = 22;
        System.out.println(d1.name+" "+Demo.age);
        Demo d2 = new Demo();
        d2.name = "Akansha";
        d2.age = 20;
        System.out.println(d2.name+" "+Demo.age);
        Demo d3 = new Demo();
        d3.name = "Kaushik";
        d3.age = 25;
        System.out.println(d3.name+" "+Demo.age);
        System.out.println("Updated is "+age);
        d3.calling();
        Demo.greet();

    }
}
