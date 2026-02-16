import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Metodos m = new Metodos();
        int cant = 0;
        System.out.println("Ingrese la dimension del patio ");
        cant = teclado.nextInt();
        objVehiculo[] r = new objVehiculo[cant];
        r = m.LlenarRegistros(r);
        r = m.calcularNuevoPago(r);
        m.mostrarRegistros(r);
    }
}
