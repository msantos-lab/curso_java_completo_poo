package polimorfismo.entities;

public class ImportedProduct extends Product {

    private Double customsFee;


    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return this.getPrice() + customsFee;
    }
    

    @Override
    public String priceTag() {
        return this.getName() + " $ " + this.totalPrice() + " (Customs fee: $ " + customsFee + ")";
    }

}
