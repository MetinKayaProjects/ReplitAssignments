package homework_repl_it_220_229___220;

public abstract class VendingMachine { //parent class
	  
    public abstract void select(int itemNumber);
    public abstract double pay(double money);
    public abstract double returnChange();
    public abstract void cancel();
    
}
