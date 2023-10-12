package getter;

class Product{
    private int id = 101;
    private String name = "Maggi";
    private int price;

    public int getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {

        this.price = price;
    }

}
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setPrice(14);
        System.out.println(p1.getId());
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        

    }
}
