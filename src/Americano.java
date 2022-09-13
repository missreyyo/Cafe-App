public class Americano extends CaffeineBeverage{
    int size;

    public Americano(boolean hasMilk,int size){
        super(size,hasMilk,"Americano");
        this.size= size;
    }

    @Override
    public int cost() {
        if(size==SMALL)
            return 7+super.cost();
        else if(size==MEDIUM)
            return 8+super.cost();
        else
            return 9+super.cost();
    }
}
