public class Lotissement implements GestionPropriete {

    protected Propriete[] tabProp;
    protected int nombre;

    




    public Lotissement(int capacité)
    {
        nombre=0;
        tabProp=new Propriete[capacité];


    }

    public Propriete getpropriétéByIndex(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        }
        return null;  
    }
    
    int getnbPièces()
    {
        int nb=0;
        for(int i=0;i<tabProp.length;i++)
        {
            if(tabProp[i] instanceof PropriétéPrivée)
            {
                nb+=((PropriétéPrivée)tabProp[i]).getNbPiece();
            }
        }

        return nb;
    }

    @Override
    public void afficherPropriétés() {
        for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i].toString());
        }
    }

    @Override
    public boolean ajouter(Propriete p) {
        if(nombre<tabProp.length)
        {
            tabProp[nombre]=p;
            nombre++;
            return true;
        }

        return false;

    }

    @Override
   
    public boolean supprimer(Propriete p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].id == p.id) { 
                
                for (int j = i; j < nombre - 1; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                tabProp[--nombre] = null; 
                return true;
            }
        }
        return false;
    }
    


   
    
}
