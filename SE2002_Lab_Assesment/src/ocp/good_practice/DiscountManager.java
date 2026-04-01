public class DiscountManager {
    public double processDiscount(double price, DiscountStrategy strategy) {
        if(strategy==null){
            return price;
        }else {
            return strategy.apply(price);
        }
}