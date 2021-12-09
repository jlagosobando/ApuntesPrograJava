import java.util.Scanner;

public class Main{
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        Minimarket MiMinimarket = new Minimarket("La Bodeguita");
        Cargo CargoVendedor = new Cargo("Vendedor");
        Cargo CargoCajero = new Cargo("Cajero");

        Empleado EmpleadoJulio = new Empleado("Julio",CargoVendedor);
        String Vendedor1puesto="Abarrotes";
        
        Empleado EmpleadoEsteban = new Empleado("Esteban",CargoVendedor);
        String Vendedor2puesto="Panaderia";
        
        Empleado EmpleadoMario = new Empleado("Mario",CargoCajero);
        String Cajero1puesto="Abarrotes";
        
        Empleado EmpleadoJaime = new Empleado("Jaime",CargoVendedor);
        String Vendedor4puesto="Abarrotes";
        
        //TO DO:
        String minimarket_zona1="Abarrotes";
        String minimarket_zona2="Panaderia";
        String minimarket_zona3="Congelados";


        //calcular ventas de Julio
        int cantidadProductosJulio=5;
        int ventaJulio=0;
        int precio;
        for(int i=1;i<=5;i++){
            System.out.println("Ingrese ventas Julio");
            precio=teclado.nextInt();
            ventaJulio=ventaJulio+precio;
        }

        //calcular ventas de Esteban
        int cantidadProductosEsteban;
        System.out.println("Ingrese cantidad productos Esteban");
        cantidadProductosEsteban=teclado.nextInt();
        int ventaEsteban=0;
        for(int i=1;i<=cantidadProductosEsteban;i++){
            System.out.println("Ingrese venta Esteban");
            precio=teclado.nextInt();
            ventaEsteban=ventaEsteban+precio;
        }

        //procesar ventas en caja
        int RegistroCajaMario=0;
        RegistroCajaMario=ventaEsteban+ventaJulio;

    }
}
