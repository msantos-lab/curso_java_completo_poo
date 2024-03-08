package enumeracao.entities;

public class Product {

    private String name;
    private Double price;


    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuffer builder = new StringBuffer();
        builder.append(getName());
        builder.append(", $");
        builder.append(getPrice());

        return builder.toString();
    }
    

}
