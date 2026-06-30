import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precio;

        System.out.print("Ingrese el monto de la compra: ");
        precio = sc.nextDouble();

        System.out.println("Total a pagar: S/" + precio);

    }

}