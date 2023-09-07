import java.util.Scanner;

public class Job7 {

    public void Acer(){
        System.out.print("rayon du cercle : ");
        Scanner myObj1 = new Scanner(System.in);
        float atr1 = Float.parseFloat(myObj1.nextLine());
        float cart = atr1 * atr1;
        float result = (float) (3.14 * cart);
        System.out.print("l'air de ce cercle est de : " + result + "\n");
    }
    public void Acar(){
        System.out.print("rayon du carrer : ");
        Scanner myObj1 = new Scanner(System.in);
        float atr1 = Float.parseFloat(myObj1.nextLine());
        float result = atr1 * atr1;
        System.out.print("l'air de ce carrer est de : " + result);
    }

    public static void main(String[] args) {
        Job7 ca = new Job7();
        ca.Acer();
        ca.Acar();
    }

}
