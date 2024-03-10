package classes_abstratas.entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anuallncome, Double healthExpenditures) {
        super(name, anuallncome);
        this.healthExpenditures = healthExpenditures;
    }


    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    

    @Override
    public Double tax() {

        double total = 0.0;

        if (this.getAnuallncome() > 20000) {
            total = (this.getAnuallncome() * 0.25) - (healthExpenditures / 2);
        } else {
            total = this.getAnuallncome() * 0.15;
        }

        return total;
    }

    @Override
    public String toString() {
        return this.getName() + ": $ " + String.format("%.2f", tax());
    }

}
