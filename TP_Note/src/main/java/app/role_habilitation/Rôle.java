package app.role_habilitation;

public class Rôle {
	
	private String nomRole;
	
	public Rôle(String nom)
	{
		nomRole = nom;
	}
	
	public boolean equals(Object o)
	{
		if (this != o)
			return false;
		else return true;
	}
	
	public int hashCode()
	{
		
	}

}
