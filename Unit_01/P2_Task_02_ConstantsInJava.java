package Unit_01;

public class P2_Task_02_ConstantsInJava {
	//defining a constant
  static final double pi=3.14;
	public static void main(String[] args) {
		System.out.println(pi);
		fun(pi);
	    
	}
	// only static function can access static variables.
	 static void fun(double x){
		System.out.println(x);
	}
}