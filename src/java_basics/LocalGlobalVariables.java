package java_basics;

public class LocalGlobalVariables {
	
	int num = 25;
	void localVariable(){
		int num = 44;
		System.out.println("Local variable: " + num);
	}
	
	public static void main(String[] args){
		LocalGlobalVariables obj = new LocalGlobalVariables();
		System.out.println("Instance variable: " + obj.num);
		obj.localVariable();
	}
}
