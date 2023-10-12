package constructor;

public class Student {
    int roll;
    int age;
    int pocketMoney;

    Student(){
        this(22,10);
        System.out.println("Constructor is calling");
    }

    Student(int r , int a){
        this(26,31,1000);
        roll = r;
        age = a;
        System.out.println("constructor calling with 2 arguments");
    }
    Student(int roll,int age,int pocketMoney){
        this.roll = roll;
        this.age = age;
        this.pocketMoney = pocketMoney;
        System.out.println("constructor calling with 3 arguments");
    }


//    public void show(){
//        System.out.println("Roll is "+roll+"Age is "+age);
//    }
}
