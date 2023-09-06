public class Job6 {
    public String nom;
    public float[] note = {15, 12, 18, 10};

    public void Plusnote() {
        float valeurMax = note[0];
        for (int i = 1; i < note.length; i++) {

            if (note[i] > valeurMax) {
                valeurMax = note[i];
            }
        }
        System.out.print("note la plus haute " + valeurMax);
    }

    public void Moinsnote() {
        float valeurMini = note[0];
        for (int i = 1; i < note.length; i++) {

            if (note[i] < valeurMini) {
                valeurMini = note[i];
            }
        }
        System.out.print("note la moins haute " + valeurMini);
    }


}
