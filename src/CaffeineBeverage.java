public class CaffeineBeverage extends Beverage{
boolean hasMilk;

    public CaffeineBeverage(int size,boolean hasMilk,String name) {
        super(size, name, hasMilk);
        this.hasMilk=hasMilk;
    }

    @Override
    public int cost() {
        if(hasMilk)
            return 1;
        else
            return 0;
    }
}
