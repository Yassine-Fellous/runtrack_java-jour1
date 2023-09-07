public class Job6 {
    public String nom = "bob";
    public float[] note = {15, 12, 18, 10};

    public void Affinom(){
        System.out.println("nom : " + nom + "\n");
    }

    public void Plusnote() {
        float valeurMax = note[0];
        for (int i = 1; i < note.length; i++) {

            if (note[i] > valeurMax) {
                valeurMax = note[i];
            }
        }
        System.out.print("note la plus haute " + valeurMax + "\n");
    }

    public void Moinsnote() {
        float valeurMini = note[0];
        for (int i = 1; i < note.length; i++) {

            if (note[i] < valeurMini) {
                valeurMini = note[i];
            }
        }
        System.out.print("note la moins haute " + valeurMini + "\n");
    }

    public void Moyenne(){
        float s = 0;
        int i = 0;
        while (i < note.length){
            s = s + note[i];
            i++;
        }
        float moyenne = s / note.length;
        System.out.print("note la moins haute " + moyenne);
    }

    public static void main(String[] args) {
        Job6 cl = new Job6();
        cl.Affinom();
        cl.Plusnote();
        cl.Moinsnote();
        cl.Moyenne();
    }


}
