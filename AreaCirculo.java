import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double areaC;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el radio del círculo: ");
        double radio=sc.nextDouble();

        areaC= 3.1416*(radio*radio);

        System.out.println("El área del círculo es: "+ areaC);

    }
}
