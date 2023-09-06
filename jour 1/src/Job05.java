import java.util.Random;

public class Job05 {

    public int de1;
    public int de2;

    public void De1() {
        Random random = new Random();
        de1 =1 + random.nextInt(6);

        System.out.println("de1 = " + de1 + "\n");
    }

    public void De2() {
        Random random = new Random();
        de2 = 1 + random.nextInt(6);

        System.out.println("de2 = " + de2 + "\n");
    }

    public void somme(){
        int i = de1 + de2;
        System.out.println("somme des de = " + i + "\n");
    }

    public static void main(String[] args) {
        Job05 d = new Job05();
        d.De1();
        d.De2();
        d.somme();
    }
}
