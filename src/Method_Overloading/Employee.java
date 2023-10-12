package Method_Overloading;

public class Employee {
    int id;
    String name;
    int salary;
    int age;
    String naam;

    public void add(int id, int age){
        System.out.println(id+age);
    }
    public void add(int id, String name){
        System.out.println(id+name);
    }
    // Having the different arguments
    public void add(int id,int salary,int age){
        System.out.println(id+salary+age);
    }
    // Different in Order
    public void add(String name,int id){
        System.out.println(name+id);
    }
   public void add(String name,String naam){
       System.out.println(name+naam);
   }
}
