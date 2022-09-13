public class BlackTea extends TeaBeverage{
    int size;
    public BlackTea(boolean hasLemon, int size){
        super(size,"BlackTea",hasLemon);
        this.size=size;
    }

    @Override
    public int cost() {
        if(size==SMALL)
            return 3+super.cost();
        else if(size==MEDIUM)
            return 4+super.cost();
        else
            return 5+super.cost();
    }
}
