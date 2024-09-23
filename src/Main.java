public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // Примерные данные для расчета
        double loanAmount = 1_000_000; // Сумма кредита
        double annualInterestRate = 9.99; // Годовая процентная ставка
        int loanTerm = 1; // Срок кредита в годах

        // Первый расчет
        double payment1 = service.calculate(loanAmount, annualInterestRate, loanTerm);
        System.out.printf("Ежемесячный платеж за 1 год: %.2f\n", payment1);

        // Второй расчет: срок кредита 2 года
        loanTerm = 2;
        double payment2 = service.calculate(loanAmount, annualInterestRate, loanTerm);
        System.out.printf("Ежемесячный платеж за 2 года: %.2f\n", payment2);

        // Третий расчет: срок кредита 3 года
        loanTerm = 3;
        double payment3 = service.calculate(loanAmount, annualInterestRate, loanTerm);
        System.out.printf("Ежемесячный платеж за 3 года: %.2f\n", payment3);
    }
}