package homework_repl_it_210_219_____218;

public class Main {
	public static void main(String[] args) {
	    Catalog ctl = new Catalog();
			ctl.loadItems();
			ctl.loadPrices();
			ctl.loadMonthlyPayments();
			
			System.out.println(ctl.items.toString());
			System.out.println(ctl.prices.toString());
			System.out.println(ctl.monthlyPayments.toString());

	    Catalog ctl2 = new Catalog();
	    ctl2.loadWholeCatalog();
	    System.out.println(ctl2.getWholeCatalog().toString().trim());
			
	  }

}
