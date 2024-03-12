package interface_parcelas_contrato.model.services;

public interface OnlinePaymentService {
    
    Double paymentFee(Double amount);

    Double interest(Double amount, Integer months);

}
