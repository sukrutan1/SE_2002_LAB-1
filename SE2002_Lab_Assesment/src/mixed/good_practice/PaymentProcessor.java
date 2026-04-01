public class PaymentProcessor {
    private PaymentGateway paymentGateway;
    private Logger logger;

    public PaymentProcessor(PaymentGateway paymentGateway, Logger logger) {
        this.paymentGateway = paymentGateway;
        this.logger = logger;
    }

    public void pay(double amount) {
        paymentGateway.execute(amount);
        logger.log("Paid: " + amount);
    }
}

class BankAPI implements PaymentGateway {
    @Override
    public void execute(double a) { 
        System.out.println("Transaction done."); 
    }
}