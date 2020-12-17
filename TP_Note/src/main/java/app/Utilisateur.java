package app;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	
	private List<ServeurDiscussion> serveurs;
	private String prenom;
	private String nom;
	private String login;
	private String motDePasse;
	private String mail;
	
	public Utilisateur()
	{
		
	}

	public List<ServeurDiscussion> getServeurs() {
		return serveurs;
	}

	public void setServeurs(List<ServeurDiscussion> serveurs) {
		this.serveurs = serveurs;
	}

}
