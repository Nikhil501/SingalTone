package SingaltonDemo;
public class StaticBlock {
	
	private static StaticBlock sb;
	private StaticBlock() {}
static
{	
	try {
		sb = new StaticBlock();

	}catch (Exception e) {
		
		throw new RuntimeException("");
	}
}	
public static StaticBlock getintance() {
	return sb;
	
}
}
