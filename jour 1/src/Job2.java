public class Job2 {
    public String marque = null;
    public String couleur = null;
    public float vitesse;
    public Boolean demarrer = false;


    public void Demarrer(){
        demarrer = true;
        System.out.printf("la voiture est démarrer\n");
    }

    public float Accelerer(){
        if (demarrer = true) {
            vitesse = vitesse + 10;
            System.out.printf("la vitesse est maintenant de " + vitesse + "/KM\n");
        }
        else{System.out.printf("vous ne pouvez pas accélere la voiture n'est pas démarrer\n");

        }
        return vitesse;
    }

    public float FreinerArret(){
        if (demarrer = true) {
            vitesse = 0;
            System.out.printf("voiture arreter et la vitesse rénitialiser à " + vitesse + "/KM \n");
        }
        else{System.out.printf("vous ne pouvez pas Freiner la voiture n'est pas démarrer\n");

        }
        return vitesse;
    }

    public void SetCouleur(String nouvelleCouleur) {
        couleur = nouvelleCouleur;
        System.out.printf("la couleur est "+ couleur + "\n");

    }


    public void SetMarque(String nouvelleMarque) {
        marque = nouvelleMarque;
        System.out.printf("la marque est "+ marque + "\n");

    }

    public static void main(String[] args) {
        Job2 v = new Job2();
        v.SetCouleur("rouge");
        v.SetMarque("ferrari");
        v.Demarrer();
        v.Accelerer();
        v.Accelerer();
        v.FreinerArret();
    }

};

