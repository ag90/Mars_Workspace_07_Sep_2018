package OOP;

public class ConcatenationConceptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=100;
		int j=50;
		
		String SeleniumTool="Selenium";
		String Proglang="Java";
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(SeleniumTool);
		System.out.println(Proglang);
		
		System.out.println(SeleniumTool + Proglang);
		System.out.println(i+SeleniumTool);
		System.out.println(i+SeleniumTool+j);
		System.out.println(i+SeleniumTool+j+Proglang);
		System.out.println(i+j+SeleniumTool+Proglang);
		System.out.println(i+SeleniumTool+Proglang+j);
		System.out.println(SeleniumTool+Proglang+i+j);//String concatenation
		System.out.println(SeleniumTool+Proglang+(i+j));//This is used to addtion.
		
	}

}
