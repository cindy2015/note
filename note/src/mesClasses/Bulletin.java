package mesClasses;

public class Bulletin { 
	
	String nom_eleve;
	NotesEtCoef []listeNotes = new NotesEtCoef[3]; 
	
	void afficheMatiere() {
		
		for (int i = 0; i < listeNotes.length; i++) 
			System.out.println(listeNotes[i].matiere);
	}
		
		void afficheTout() { 
			
			for (int i = 0; i < listeNotes.length; i++) {
				listeNotes[i].affiche();
				
		}
}
			
		
		void afficheNote(String matiereRecherchee) {
			
			for (int i = 0; i < listeNotes.length; i++) {
				System.out.println(listeNotes[i].matiere + " " + listeNotes[i].notes); 
			}		
			
		}	
		
		void afficheNbreDePointTotal() {
			double nb = 0;
			for (int i = 0; i < listeNotes.length; i++) {
				nb = nb + listeNotes[i].coef * listeNotes[i].notes;
				System.out.println("nombre de points : "+ nb);
				
			}
			
		}
			
		double afficheNotePonderee(){
			int coefTotal = 0;
			double nb = 0;
			for (int i = 0; i < listeNotes.length; i++) {
				nb = nb + listeNotes[i].coef * listeNotes[i].notes;
				coefTotal = coefTotal + listeNotes[i].coef; }
			
			System.out.println(nb/coefTotal);
			return nb/coefTotal;
				
							
		}
		
		void afficheMention() {
			double noteGenerale = afficheNotePonderee();
			System.out.println("mention :");
			if(noteGenerale > 16)
				System.out.println("Très bien");
			
			if(noteGenerale > 14)
				System.out.println("Assez Bien");
			
			if(noteGenerale < 10)
				System.out.println("Pas mal");
			
			
			
		}
				
	}
			
		
		
		
		
		


		
			
			
		
		
	
	
