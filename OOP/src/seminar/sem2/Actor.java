package seminar.sem2;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    protected Actor(String name) {
        this.name = name;
        isMakeOrder=false;
        isTakeOrder=false;
    }
    public String getName() {
        return name;
    }
}


