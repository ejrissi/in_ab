public interface GestionPropriete {
    
    final int MAX_PROPRIETES=20;

    void afficherPropriétés();
    boolean ajouter(Propriete p);
    boolean supprimer(Propriete p);

}
