package interface_locadora_carro.model.entities;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime start;
    private LocalDateTime end;

    private Invoice invoice;
    private Vehicle vehicle;


    public CarRental() {
    }

    public CarRental(LocalDateTime start, LocalDateTime end, Vehicle vehicle) {
        this.start = start;
        this.end = end;
        this.vehicle = vehicle;
    }

    public CarRental(LocalDateTime start, LocalDateTime end, Invoice invoice, Vehicle vehicle) {
        this.start = start;
        this.end = end;
        this.invoice = invoice;
        this.vehicle = vehicle;
    }


    public LocalDateTime getStart() {
        return start;
    }
    public void setStart(LocalDateTime start) {
        this.start = start;
    }
    public LocalDateTime getEnd() {
        return end;
    }
    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
    public Invoice getInvoice() {
        return invoice;
    }
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "CarRental [start=" + start + ", end=" + end + ", invoice=" + invoice + ", vehicle=" + vehicle + "]";
    }

    


    
}
