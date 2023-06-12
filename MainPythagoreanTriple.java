import java.util.Scanner;
public class MainPythagoreanTriple {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        PythagoreanTriple triple = new PythagoreanTriple(m, n);

        System.out.println("The Pythagorean triple is: " + triple.getSide1() + ", " + triple.getSide2() + ", " + triple.getHypotenuse());
        scanner.close();
    }
}
