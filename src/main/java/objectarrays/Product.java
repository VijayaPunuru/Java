package objectarrays;

public class Product implements Comparable<Product>{
    private int weight;
    private int price;
    private int id;
    public Product(int weight,int price,int id){
        this.weight=weight;
        this.price=price;
        this.id=id;
    }

    public Product(){

    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Product o) {
        if(this.price>o.price) return 1;
        else if(this.price < o.price) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Product p1 = new Product(23, 1999, 101);
        Product p2 = new Product(62, 1999, 102);
        Product p3 = new Product(29, 358, 103);

        int temp = p1.compareTo(p2);

        if (temp < 0) {
            System.out.println(" Product 1 is cheaper than Product 2 " );
        } else if (temp> 0) {
            System.out.println(" Product 1 is expensive than Product 2");
        } else {
            System.out.println("  Product 1 and Product 2 have the same price ");
        }
    }
}
