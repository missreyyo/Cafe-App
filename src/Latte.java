public class Latte extends CaffeineBeverage {
    int size;


    public Latte(boolean hasMilk,int size){
        super(size, hasMilk, "Latte");
        this.size= size;
    }

    @Override
    public int cost() {
        if(size==SMALL)
            return 5+super.cost();
        else if(size==MEDIUM)
            return 6+super.cost();
        else
            return 7+super.cost();
    }
}
