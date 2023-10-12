package Static;

public class Person {
    String name;
    int age;
    static int population;

    Person(String name,int age){
        this.name = name;
        this.age = age;
        population++;
    }

    public static void main(String[] args) {
//        Person p1 = new Person("Lavinsh",15);
//        System.out.println(p1.name+" "+p1.age );
//
//        Person p2 = new Person("Yash" ,24);
//        System.out.println(p2.name+" "+p2.age);

//        System.out.println(Person.population);
    }

}

