public class Fiscalité {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Ahmed", "Mejrissi");
        Person p2 = new Person(2, "Louay", "Jday");
        Person p3 = new Person(3, "Moutes", "Hammami");

        Lotissement lotissement = new Lotissement(10);

        PropriétéPrivée propriete1 = new PropriétéPrivée(1, p1, "Corniche", 350, 4);
        Villa villa = new Villa(2, p2, "Dar Chaabane", 400, 6, true);
        Appartement appartement = new Appartement(3, p2, "Hammamet", 1200, 8, 3);
        PropriétéProfessionnelle proprietePro1 = new PropriétéProfessionnelle(4, p3, "Korba", 1000, 50, true);
        PropriétéProfessionnelle proprietePro2 = new PropriétéProfessionnelle(5, p1, "Bir Bouragba", 2500, 400, false);

        lotissement.ajouter(propriete1);
        lotissement.ajouter(villa);
        lotissement.ajouter(appartement);
        lotissement.ajouter(proprietePro1);
        lotissement.ajouter(proprietePro2);

        System.out.println("Liste des proprietes :");
        lotissement.afficherPropriétés();

        System.out.println("\nNombre total de pieces : " + lotissement.getnbPièces());

       
        PropriétéPrivée minPropriete = null;
        double minImpot = Double.MAX_VALUE;
        for (int i = 0; i < lotissement.nombre; i++) {
            if (lotissement.tabProp[i] instanceof PropriétéPrivée) {
                PropriétéPrivée prop = (PropriétéPrivée) lotissement.tabProp[i];
                double impots = prop.calculImpot();
                if (impots < minImpot) {
                    minImpot = impots;
                    minPropriete = prop;
                }
            }
        }

        if (minPropriete != null) {
            System.out.println("\nPropriete privee avec le moins d'impôts :");
            System.out.println(minPropriete);
            System.out.println("Impôts : " + minImpot + " DT");
        }

        
        lotissement.supprimer(appartement);
        System.out.println("\nListe des proprietes apres suppression de l'appartement :");
        lotissement.afficherPropriétés();

       
        Lprive lotPrivé = new Lprive(10);
        lotPrivé.ajouter(propriete1);
        lotPrivé.ajouter(villa);
        lotPrivé.ajouter(proprietePro1); 

        System.out.println("\nListe des proprietes privees :");
        lotPrivé.afficherPropriétés();
    }
}
