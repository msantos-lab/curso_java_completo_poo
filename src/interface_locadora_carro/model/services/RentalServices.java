package interface_locadora_carro.model.services;

import java.time.Duration;

import interface_locadora_carro.model.entities.CarRental;
import interface_locadora_carro.model.entities.Invoice;

public class RentalServices {

    private Double pricePerDay;
    private Double pricePerHour;

    private TaxService taxService;


    public RentalServices(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getEnd()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if(hours <= 12.00){
            basicPayment = pricePerHour * Math.ceil(hours);
        }else{
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax)); 
    }
    
}
