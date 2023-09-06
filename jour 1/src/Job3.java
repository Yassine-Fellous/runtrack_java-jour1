import java.util.Scanner;

public class Job3 {

    public float Addi(float atr1, float atr2){
        return atr1 + atr2;
    }
    public float Sous(float atr1, float atr2){
        return atr1 - atr2;
    }

    public float Mult(float atr1, float atr2){
        return atr1 * atr2;
    }

    public float Divi(float atr1, float atr2){
        return atr1 / atr2;
    }
    public void calc(){
        System.out.print("premier nombre : ");
        Scanner myObj1 = new Scanner(System.in);
        float atr1 = Float.parseFloat(myObj1.nextLine());
        System.out.print("Deuxieme nombre : ");
        Scanner myObj2 = new Scanner(System.in);
        float atr2 = Float.parseFloat(myObj2.nextLine());
        System.out.println("Addition :" + this.Addi(atr1, atr2));
        System.out.println("Soustraction :" + this.Sous(atr1, atr2));
        System.out.println("Multiplication :" + this.Mult(atr1, atr2));
        System.out.println("Division :" + this.Divi(atr1, atr2));


    }

    public static void main(String[] args) {
        Job3 c = new Job3();
        System.out.println(c.Addi(1,2));
        System.out.println(c.Sous(3,2));
        System.out.println(c.Mult(2,2));
        System.out.println(c.Divi(1,2));
        c.calc();


    }

}

