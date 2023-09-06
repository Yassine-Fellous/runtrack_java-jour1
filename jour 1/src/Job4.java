public class Job4 {
    public int solde = 100;

    public void Affisolde(){
        System.out.print("votre solde est de : " + solde+ "$\n");
    }

    public void Deposer(int somme){
        solde = somme + solde;
        System.out.print(somme + "$ a été déposer votre solde et de " + solde + "$\n");
    }

    public void Retrait(int somme){
        if(somme < solde){
            solde = solde - somme;
            System.out.print(somme + "$ a été retirer votre solde et de " + solde + "$\n");
        }
        else {
            System.out.print("tentative de retrait de " + somme + "$ solde insuffisant" + "\n");
        }

    }

    public static void main(String[] args) {
        Job4 b = new Job4();
        b.Affisolde();
        b.Deposer(50);
        b.Retrait(70);
        b.Retrait(90);
    }

}
