package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.role_habilitation.Habilitation;
import app.role_habilitation.Rôle;
import app.webhook.Webhook;

public class Canal implements Comparable, Destinataire{
	
	private Map<Rôle,List<Utilisateur>> mapping_role_utilisateurs;
	private int ordre;
	private List<Webhook> webhooks;
	private String nom;
	private Map<Rôle,List<Habilitation>> mapping_role_habilitation;
	private List<Message> historiques;
	
	public Canal()
	{
		mapping_role_utilisateurs = new HashMap<Rôle, List<Utilisateur>>();
		ordre = 0;
		webhooks = new ArrayList<Webhook>();
		nom = "Canal";
		mapping_role_habilitation = null;
		historiques = new ArrayList<Message>();
		
	}
	
	public void ecrireMessage(Utilisateur utilisateur, Message message)
	{
		historiques.add(message);
	}


	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getMapping_role_utilisateurs() {
		
		return mapping_role_utilisateurs;
	}

	public Object getMapping_role_habilitations() {
		
		return mapping_role_habilitation;
	}

	public List<Message> getHistoriques() {
		
		return historiques;
	}
	
	

}
