package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		Double baseInstallment = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			LocalDate installmentDate = contract.getDate().plusMonths(i);
			Double interestAmount = onlinePaymentService.interest(baseInstallment, i);
			Double paymentFee = onlinePaymentService.paymentFee(baseInstallment + interestAmount);
			Double totalInstallment = baseInstallment + interestAmount + paymentFee; 

			contract.getInstallments().add(new Installment(installmentDate, totalInstallment));
		}
	}
}