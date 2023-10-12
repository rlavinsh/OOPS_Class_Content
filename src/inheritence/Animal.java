package inheritence;

public class Animal {
    void eat(){
        System.out.println("Animals eats grass");
    }
}
 class Lion extends Animal{
   void king(){
       System.out.println("lion is king");
   }
 }
 class cow extends Animal{
    void color(){
        System.out.println("cow color is white");
    }
     public static void main(String[] args) {
         cow cc = new cow();
         cc.eat(); // this is the method of animal class
         cc.color();  // this is the method of cow class

         Lion ll = new Lion();
         ll.king();
         ll.eat();
     }
 }

