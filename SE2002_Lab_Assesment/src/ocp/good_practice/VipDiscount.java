public class VipDiscount implements DiscountStrategy{
    @Override
    public double apply(double price){
        return price*0.7;
    }
}