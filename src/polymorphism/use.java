package polymorphism;

public class use {
    public static void main(String[] args) {
        Map<String,Integer> mm = new Map<>();
        mm.insert("Akhil",25);
        System.out.println(mm.getValue("Akhil"));
        System.out.println(mm.size());
    }

}
