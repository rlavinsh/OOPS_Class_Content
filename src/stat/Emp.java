package stat;

import java.util.Scanner;

public class Emp {
    String name;
    String email;
    int phone;
    String address;

    public Emp(){

    }

    public Emp(String name,String email) {
        this.name = name;
        this.email = email;

    }
    public Emp(String email,int phone) {
        this.email = email;
        this.phone = phone;
    }
    public Emp(String name, String email, int phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

//    void display(){
//        System.out.println(name);
//        System.out.println(email);
//        System.out.println(phone);
//        System.out.println(address);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String email = sc.next();
        int phone = sc.nextInt();

        Emp e1 = new Emp(name,email);
//        System.out.println(e1.name);
//        System.out.println(e1.email);
//        System.out.println(e1.phone);
//        System.out.println(e1.address);

        Emp e2 = new Emp(email,phone);
        System.out.println(e2.email);
        System.out.println(e2.phone);
    }

}
