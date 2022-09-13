public class OrderItem {
    Beverage beverage;
    int amount;
    public OrderItem(Beverage beverage,int amount){
        this.beverage =beverage;
        this.amount=amount;
    }
    public int cost(){
        return beverage.cost()*amount;
    }

}
