package class_object;

class Student{
    private int id;
    private String name;
    private int roll;

    void setDetails(int i, String naam, int r){
        if(i <=0){
            System.out.println("Id can't be negative");
        }else{
            id = i;
        }
        name = naam;
        roll = r;
    }

    void showDetails(){
        System.out.println("id is "+id+" name is "+name+" roll is "+roll);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails(-101,"Lavinsh",27);
        s1.showDetails();
    }


}
