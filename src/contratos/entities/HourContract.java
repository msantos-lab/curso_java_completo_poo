package contratos.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class HourContract {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;
    
    public HourContract() {
    }

    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }


    //Métodos
    public double totalValue(){
        return hours * valuePerHour;
    }

    @Override
    public String toString() {
        return "HourContract [date=" + date.format(fmt1) + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
    }


}
