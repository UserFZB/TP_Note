package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import app.role_habilitation.Habilitation;
import app.role_habilitation.R�le;

public class ServeurDiscussion {
	
	private Map<R�le,List<Utilisateur>> mapping_role_utilisateurs;
	private List<Canal> canaux;
	private String nom;
	private Map<R�le,List<Habilitation>> mapping_role_habilitation;
	
	public ServeurDiscussion()
	{
		mapping_role_utilisateurs = null;
		canaux = new ArrayList<Canal>();
		nom = "ServeurDiscussion";
		mapping_role_habilitation = null;
	}
	

}
