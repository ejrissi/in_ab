public class Villa extends PropriétéPrivée {
    private boolean avecPiscine;



    public double calculImpot() {
       if(avecPiscine)
       {
        return  super.calculImpot()+200;
       }
       return  super.calculImpot();
    }

    

    public Villa(int id, Person responsable, String adresse, double surface, int nbPiece, boolean avecPiscine) {
        super(id, responsable, adresse, surface, nbPiece);
        this.avecPiscine = avecPiscine;
    }

    public boolean isAvecPiscine() {
        return avecPiscine;
    }

    public void setAvecPiscine(boolean avecPiscine) {
        this.avecPiscine = avecPiscine;
    }

    @Override
    public String toString() {
        return "Villa :avecPiscine=" + " "+avecPiscine + super.toString();
    }
    

    
}
