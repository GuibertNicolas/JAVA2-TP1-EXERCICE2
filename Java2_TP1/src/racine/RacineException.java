package racine;
/**
 * TP1 Exercice 2 : racine, Nicolas GUIBERT
 * @author Guibert
 * Excepetion lorsque l'op�rande est n�gative pour une racine
 */
public class RacineException extends Exception{
	public RacineException() {
			System.out.println("L'op�rande ne peut pas �tre n�gative");
	}
}
