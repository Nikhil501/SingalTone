package SingaltonDemo;

public class SynchronizedBlock {
	private static SynchronizedBlock syblock;
	
	private SynchronizedBlock() {}
	synchronized public static SynchronizedBlock getInstance() {
		
		if (syblock==null) {
			syblock= new SynchronizedBlock();
			
		}
		
		return syblock;		
	}
}
