package OOP;

public class CastingDemo {

	public static void main(String[] args) {

	byte x = 0;
	int y=x;//up casting
	
	int k=0;
	long h=k;//up casting
	
	int o=0;
	double l=o;//up casting
	
	char bo='c';
	int c=bo;//up casting
	
	
	int m=0;
	byte b=(byte)m;//down casting
	
	long p=0;
	int q=(int)p;//down casting
	
	double i=0;
	int u=(int)i;//down casting
	
	int w=100;
	char v=(char)w;//down casting
	
	String str=Integer.toString(v);//We can assess value of int data type of reference variable value through this method:  Integer.toString(Int reference variable)
	System.out.println(str);
	
	
	
	
		

		
	}

}
