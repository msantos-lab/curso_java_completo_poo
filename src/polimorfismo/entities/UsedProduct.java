package polimorfismo.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    private LocalDate manufactureDate;


    public UsedProduct() {
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    
    DateTimeFormatter fmtDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String priceTag() {
        return this.getName() + " (used) $ " + this.getPrice() + " (Manufacture date: " + manufactureDate.format(fmtDate) + ")";
    }

    


    
}
