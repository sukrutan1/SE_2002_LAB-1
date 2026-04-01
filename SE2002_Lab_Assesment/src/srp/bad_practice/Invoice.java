public class Invoice {
    private double amount;

    public Invoice(double amount) { this.amount = amount; }

    public void calculateTotal() { 
        this.amount = this.amount * 1.20; // adding tax
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to MySQL database...");
    }

    public void sendEmail() {
        System.out.println("Sending invoice email to customer...");
    }
}