public class Appartement  extends PropriétéPrivée{

   private int numEtage;


   

public Appartement(int id, Person responsable, String adresse, double surface, int nbPiece, int numEtage) {
    super(id, responsable, adresse, surface, nbPiece);
    this.numEtage = numEtage;
}

public int getNumEtage() {
    return numEtage;
}

public void setNumEtage(int numEtage) {
    this.numEtage = numEtage;
}

@Override
public String toString() {
    return "Appartement numEtage=" + numEtage + super.toString();
}








   

    
    
}
