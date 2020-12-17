package app;

public class Message implements Destinataire{
	
	private Utilisateur auteur;
	private Destinataire destinataire;
	private String texte;
	

	public void setDestinaire(Canal c) {
		
		destinataire = c;
		
	}


	public void setTexte(String message) {
		
		texte = message;
		
	}


	public char[] getTexte() {
		
		return texte.toCharArray();
	}


	
	

}
