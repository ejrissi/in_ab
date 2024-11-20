public class Lprive extends Lotissement{

    public Lprive(int capacité) {


        super(capacité);
    }

    @Override
    public boolean ajouter(Propriete p) {
        if (p instanceof PropriétéPrivée) {
            return super.ajouter(p);
        } else {
            System.out.println("Seules les propriétés privées peuvent être ajoutées.");
            return false;
        }
    }

    @Override
    public PropriétéPrivée getpropriétéByIndex(int i) {
        Propriete prop = super.getpropriétéByIndex(i);
        if (prop instanceof PropriétéPrivée) {
            return (PropriétéPrivée) prop;
        }
        return null;
    }

    @Override
    public int getnbPièces() {
        int nb = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof PropriétéPrivée) {
                nb += ((PropriétéPrivée) tabProp[i]).getNbPiece();
            }
        }
        return nb;
    }

}
