public class CreditPaymentService {
    public double calculate(double loanAmount, double annualInterestRate, int loanTerm) {
        double monthlyInterestRate = annualInterestRate / 100 / 12; // Преабразуем годовую ставку в месечную
        double numberOfPayments = loanTerm * 12; // Общее количество платежей
        double monthlyPayment = loanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return monthlyPayment;


    }
}
