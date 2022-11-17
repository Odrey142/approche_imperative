package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
	String [] nomVilles = {"Fort de France","Trinitée","Saint Pierre","Ajoupa","Lamentin"};

	System.out.println(nomVilles[0]+" " + nomVilles[1]+" " + nomVilles[2] +"  "+ nomVilles[3] + "  "+nomVilles[4]);
	System.out.println(nomVilles.length);

	System.out.println("--------------------------------------------------------------");
	
	nomVilles[3]="Reims";
	System.out.println(nomVilles[0]+" " + nomVilles[1]+" " + nomVilles[2] +"  "+ nomVilles[3] + "  "+nomVilles[4]);

	}

	

}
