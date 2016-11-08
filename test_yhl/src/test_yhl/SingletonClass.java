package test_yhl;

public class SingletonClass {
	
	private static SingletonClass instance = null;
	
	public static SingletonClass getInstance(){
		if(instance == null) {
//			synchronized(SingletonClass.class){
				if(instance == null){
					instance = new SingletonClass();
				}
//			}
		}
		
//		if(instance == null){
//			instance = new SingletonClass();
//		}
		return instance;
	}
	private SingletonClass(){}
}
