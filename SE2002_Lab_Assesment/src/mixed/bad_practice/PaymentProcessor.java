public class PaymentProcessor {
    public void pay(double amount) {
        BankAPI api = new BankAPI();
        api.execute(amount);

        
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write("Paid: " + amount);
        } catch (Exception e) { e.printStackTrace(); }
    }
}

class BankAPI {
    public void execute(double a) { System.out.println("Transaction done."); }
}