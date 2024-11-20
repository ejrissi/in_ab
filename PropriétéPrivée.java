public class PropriétéPrivée  extends Propriete{


    private int nbPiece;
    
    @Override
    public double calculImpot() {
        return ( surface/100)*50  +(nbPiece*10);
    }

    public PropriétéPrivée(int id, Person responsable, String adresse, double surface, int nbPiece) {
        super(id, responsable, adresse, surface);
        this.nbPiece = nbPiece;
    }

    public int getNbPiece() {
        return nbPiece;
    }

    public void setNbPiece(int nbPiece) {
        this.nbPiece = nbPiece;
    }

    @Override
    public String toString() {
        return "  PropriétéPrivée  nbPiece= " + nbPiece+" "+ super.toString() ;

    

    }
    
    
}
