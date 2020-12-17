package app;

import static org.junit.Assert.*;


import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

import app.exception.ActionNonAutoriseeException;
import app.role_habilitation.Habilitation;
import app.role_habilitation.R�le;

public class AppTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
    public void ecrireMessageOK() throws ActionNonAutoriseeException {
        // Etape 1 : pr�paration des objets
        Canal c = new Canal();

        Message m = new Message();
        m.setDestinaire(c);
        m.setTexte("Bonne f�tes de fin d'ann�e !");

        Utilisateur utilisateur = new Utilisateur();
        c.getMapping_role_utilisateurs().put(new R�le("Membre"), Arrays.asList(utilisateur));
        c.getMapping_role_habilitations().put(new R�le("Membre"), Arrays.asList(Habilitation.ECRITURE));

        // Etape 2 : appel de la m�thode test�e
        c.ecrireMessage(utilisateur, m);

        // Etape 3 test du retour
        List<Message> historiques = c.getHistoriques();
        Assert.assertEquals(1, historiques.size());
        System.out.println(historiques.get(0).getTexte());
    }

    @Test
    public void ecrireMessageKO() {

        // Etape 1 : pr�paration des objets
        Canal c = new Canal();

        Message m = new Message();
        m.setDestinaire(c);
        m.setTexte("Bonne ann�e 2021 !");

        Utilisateur utilisateur = new Utilisateur();

        // Etape 2 : appel de la m�thode test�e
        try {
            c.ecrireMessage(utilisateur, m);

            // Etape 3 test du retour
            fail("L'exception aurait du �tre lev�e, on ne doit pas passer ici !");
        } catch (ActionNonAutoriseeException e) {

            // Etape 3 test du retour = si on arrive ici, le test est concluant
        }
    }

}
