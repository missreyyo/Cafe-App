public abstract class Beverage  {
    int size;
    String name;
    boolean hasAdding;
    public static int SMALL=0;
    public static int MEDIUM=1;
    public static int LARGE=2;


    public Beverage(int size,String name,boolean hasAdding) {
        this.size=size;
        this.name=name;
        this.hasAdding=hasAdding;
    }

    public abstract int cost();
}
