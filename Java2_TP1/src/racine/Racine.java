package racine;

/*TP1 Exercice 2 : racine, Nicolas GUIBERT*/

public class Racine{
	private double precision;
	Racine(double precision){
		this.precision = precision;
	}
	double racine (double operande) throws RacineException{
		if (operande<0) throw new RacineException(); //Si jamais l'op�rande est strictement n�gative, on utilise l'exception
		else {//sinon on op�re la fonction
			double solution, carre, a, b;
			a=0;
			b=operande;
			solution = (a+b)/2;
			while(b-a>precision) {
				carre=solution*solution;
				if (carre>operande) b=solution;
				else a=solution;
				solution = (a+b)/2;
			}
			return solution;
		}
	}
	
	double getPrecision() {
		return precision;
	}
	
	void setPrecision(double precision) {
		this.precision = precision;
	}
}
