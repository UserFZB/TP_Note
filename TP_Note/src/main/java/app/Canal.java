package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import app.exception.ActionNonAutoriseeException;
import app.role_habilitation.Habilitation;
import app.role_habilitation.Rôle;
import app.webhook.Webhook;
import zoo.Zoo;

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
	
	public void ecrireMessage(Utilisateur utilisateur, Message message) throws ActionNonAutoriseeException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Rôle r = new Rôle("member");
		Utilisateur ut = mapping_role_utilisateurs.get(r).stream().filter(u -> u.equals(utilisateur)).findFirst().orElse(null);
		if(ut != null)
		{
			historiques.add(message);
		}else
		{
			throw new ActionNonAutoriseeException();
		}
			

				
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
