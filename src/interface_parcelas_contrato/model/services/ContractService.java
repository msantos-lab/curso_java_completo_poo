package interface_parcelas_contrato.model.services;

import java.time.LocalDate;

import interface_parcelas_contrato.model.entities.Contract;
import interface_parcelas_contrato.model.entities.Installment;

public class ContractService {

    OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.addInstallments(new Installment(quota, dueDate));
        }

    }
}
