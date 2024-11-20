public class PropriétéProfessionnelle extends Propriete {
    private int nbEmployes;
    private boolean esEtatique;

    

    public PropriétéProfessionnelle(int id, Person responsable, String adresse, double surface, int nbEmployes,
            boolean esEtatique) {
        super(id, responsable, adresse, surface);
        this.nbEmployes = nbEmployes;
        this.esEtatique = esEtatique;
    }



    public int getNbEmployes() {
        return nbEmployes;
    }



    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }



    public boolean isEsEtatique() {
        return esEtatique;
    }



    public void setEsEtatique(boolean esEtatique) {
        this.esEtatique = esEtatique;
    }



    @Override
    public double calculImpot() {
       if(esEtatique)
       {
        return 0;
       }
      return (surface/100)*100 +(30*nbEmployes);
    }



    @Override
    public String toString() {
        return "PropriétéProfessionnelle nbEmployes=" + nbEmployes + ", responsable=" + super.toString()
                + ", esEtatique=" + esEtatique ;
    }

    

    
    
}
