public class DiscountManager {
    public double processDiscount(double price, String type) {
        if (type.equals("STUDENT")) {
            return price * 0.8;
        } else if (type.equals("VIP")) {
            return price * 0.7;
        } 
        return price;
    }
}