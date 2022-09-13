public class TeaBeverage extends Beverage{
    boolean hasLemon;


    public TeaBeverage(int size, String name, boolean hasLemon) {

        super(size, name, hasLemon);
        this.hasLemon= hasLemon;
    }

    @Override
    public int cost() {
        if(hasLemon)
            return 1;
        else
            return 0;
    }
}
