package fr.operateurs;

public class DeclarationOperateur {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		boolean testEt = a>0 && b <10;
		
		System.out.println(testEt);
		
		System.out.println("--------------------------------------------------------------");
		a = a+1;
		System.out.println(a);
		
		System.out.println("--------------------------------------------------------------");
		a++;
		System.out.println(a);
		
		System.out.println("--------------------------------------------------------------");
		a+=1;
		System.out.println(a);
		
		System.out.println("--------------------------------------------------------------");
		
		String c = (a>0) ? "a est plus grand que 0": "a est inférieur à 0";
		System.out.println(c);
		
		System.out.println("--------------------------------------------------------------");
		
	}

}
