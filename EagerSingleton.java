package SingaltonDemo;
public class EagerSingleton {	
//	Eagerly ,Instance will be created at load time
private static final 	EagerSingleton es = new EagerSingleton(); 

//private constructor to avoid client applications to use constructor
private EagerSingleton(){}

public static EagerSingleton getInstance(){
    return es;
}	
}
