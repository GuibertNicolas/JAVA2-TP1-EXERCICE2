package racine;
/**
 * TP1 Exercice 2 : racine, Nicolas GUIBERT
 * @author Guibert
 * Excepetion lorsque l'opérande est négative pour une racine
 */
public class RacineException extends Exception{
	public RacineException() {
			System.out.println("L'opérande ne peut pas être négative");
	}
}
