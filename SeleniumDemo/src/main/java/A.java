
public class A {
	
	
	public A(){
		
		System.out.println("Default constructor");
		System.out.println("parent class constructor");
	}
	
	public A(int i){
		
		System.out.println("Single param. constructor");
		System.out.println(i);
	}
	
    public A(int i,int j){
		
		System.out.println("two param. constructor");
		System.out.println("the value of i "+i);
		System.out.println("the value of j "+j);
	}
	

	public static void main(String[] args) {
		
		A a=new A();//default constructor
		A a1=new A(10);//param. constructor
		A a2=new A(50,80);//param. constructor
		
		
		
	}

}
