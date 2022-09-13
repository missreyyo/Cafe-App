import java.util.ArrayList;

public class Order {
    ArrayList<OrderItem> orderItems= new ArrayList<>();

    public void add(OrderItem newItem){

        orderItems.add(newItem);
    }

    @Override
    public String toString() {
        String string = "";

        for(OrderItem item : orderItems){
            String amount= String.valueOf(item.amount);
            String size;
            if(item.beverage.size==0) {
                size = "Small";
            } else if(item.beverage.size==1){
                size = "Medium";}
            else {
                size = "Large";
            }
            String name = item.beverage.name;
            String hasAdding;
            if(item.beverage.hasAdding){
                hasAdding = "with";
            }
            else{
                hasAdding = "without";
            }
            String hasThing;

            if(item.beverage instanceof CaffeineBeverage){
                hasThing= "Milk";
            }
            else{
                hasThing="Lemon";
            }
            String cost= String.valueOf(item.cost());
            string += amount + " "+ size+ " " + name +" "+ hasAdding +" "+ hasThing +" " +cost+ " " + "TL"+ "\n";
        }
        String total = "TOTAL : "+ totalCost() + " TL";
        return string+total;
    }
    public int totalCost(){
        int totalCost = 0;
        for(OrderItem item : orderItems){
            totalCost += item.cost();
        }
        return totalCost;
    }
}
