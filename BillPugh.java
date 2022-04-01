package SingaltonDemo;

public class BillPugh {
	
	private BillPugh() {}
	
	private static class BillPughSingalton
	{
		private static final BillPugh bp = new BillPugh();		
	}
	
	public static BillPugh getInstance()
	{
		return BillPughSingalton.bp;
		
		
	}

}
