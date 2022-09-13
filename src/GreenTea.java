public class GreenTea extends TeaBeverage{
    int size;
    public GreenTea(boolean hasLemon,int size){
        super(size,"GreenTea",hasLemon);
        this.size= size;
    }

    @Override
    public int cost() {
        if(size==SMALL)
            return 4+super.cost();
        else if(size==MEDIUM)
            return 5+super.cost();
        else
            return 6+super.cost();
    }
}
