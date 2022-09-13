public class LindenTea extends TeaBeverage{
    int size;
    public LindenTea(boolean hasLemon,int size){
        super(size,"LindenTea",hasLemon);
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
