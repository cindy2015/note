package mesClasses;

public class Essai {

	public static void main(String[] args) {
		
		
		Bulletin b;
		b = new Bulletin();
		NotesEtCoef n1 = new NotesEtCoef();
		
		n1.initialise("Math", 12, 2);
		b.listeNotes[0] = n1;		
		
		NotesEtCoef n2 = new NotesEtCoef();
		n2.initialise("anglais", 14, 3);
		b.listeNotes[1] = n2;
		
		NotesEtCoef n3 = new NotesEtCoef();
		n2.initialise("francais", 2, 1);
		b.listeNotes[2] = n3;
		
		b.afficheMatiere();
		
		
		

	}

}
