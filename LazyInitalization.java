package SingaltonDemo;

public class LazyInitalization {
	
	private static LazyInitalization li;
	private LazyInitalization() {}
private static LazyInitalization getInstance() {
	if (li==null) {
		li = new LazyInitalization();		
	}	
	return li;
	
}
	
}
