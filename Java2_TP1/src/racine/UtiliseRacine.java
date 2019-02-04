package racine;
/*TP1 Exercice 2 : racine, Nicolas GUIBERT*/
import java.util.Scanner;

public class UtiliseRacine {
	public static void main(String[] argv) throws RacineException{
		System.out.println("Choisir la valeur de l'opérande : ");
		Scanner sc = new Scanner(System.in);//on demande la valuer à l'utilisateur
		double operande= sc.nextDouble();
		sc.close();//ferme le scanner
		double valeurRacine;
		Racine extracteur = new Racine(0.01);
		valeurRacine=extracteur.racine(operande);
		System.out.println(valeurRacine);
		System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));
		extracteur.setPrecision(0.00001);
		valeurRacine=extracteur.racine(operande);
		System.out.println(valeurRacine);
		System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));
	}
}
