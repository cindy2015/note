package mesClasses;

public class NotesEtCoef {
	
	String matiere;
	double notes;
	int coef;
	
	void affiche() { // VOID N'A PAS DE VALEUR DE RETOUR NI ARGUMENT
		System.out.println("La matiere : " + matiere + " " + "La note : " + notes + " Le coef est : " + coef + " ");
	}
	
	void initialise(String nouveauNom, double nouvelleNote, int nouveauCoef) { 
		
		matiere = nouveauNom; 
		notes = nouvelleNote;
		coef = nouveauCoef;
	}
		
		double nbPoint() {
			
			double p;
			p = notes*coef;
			return p;
			
			
					
			
		}			
	
		
	}
	
