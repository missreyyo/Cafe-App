public class Cappucino extends CaffeineBeverage{
    int size;
    public Cappucino(boolean hasMilk,int size){
        super(size,hasMilk,"Cappucino");
        this.size= size;
    }

    @Override
    public int cost() {
        if(size==SMALL)
            return 6+super.cost();
        else if(size==MEDIUM)
            return 7+super.cost();
        else
            return 8+super.cost();
    }
}
