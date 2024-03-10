package classes_abstratas.entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    
    public Company() {
        super();
    }

    public Company(String name, Double anuallncome, Integer numberOfEmployees) {
        super(name, anuallncome);
        this.numberOfEmployees = numberOfEmployees;
    }


    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }


    @Override
    public Double tax(){

        double total = 0.0;

        if(numberOfEmployees > 10){
            total = (this.getAnuallncome() * 0.14) ;

        }else{
            total = this.getAnuallncome() * 0.16;
        }

        return total;
    }


    @Override
    public String toString() {
        return this.getName() + ": $ " + String.format("%.2f", tax());
    }

   
}
