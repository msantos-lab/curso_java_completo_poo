package produto;

public class Product {
    public String name;
    public double price;
    public int quantity;


    public void AddProducts(int qtd){      
        double total = price * qtd;
        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f %n", name, price, qtd, total);
        System.out.println();
    }


    public void RemoveProducts(int qtd){
        double total = price * qtd;
        System.out.printf("Updated data: %s, $ %.2f, %d units, Total: $ %.2f %n", name, price, qtd, total);
        System.out.println();
    }
    
}
