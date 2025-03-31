package barco;

/**
 * Clase principal que demuestra el uso de la clase Barco.
 * Contiene el método main para ejecutar operaciones de compra, venta, y otros metodos.
 * 
 * @author Oscar
 * @version 3.0 - 28/03/2025
 */
public class MainBarco {

    /**
     * Punto de entrada principal para la aplicación.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Barco barco1;
        int stockActual;

        barco1 = new Barco("Titanic", 500000, 20, "Modelo Clásico", "Blanco");
        
        operativaBarcos(barco1, 300);
        
        stockActual = barco1.obtenerStock();
        System.out.println("El stock actual es: " + stockActual);

        mostrarInformacionBarco(barco1);
    }

    /**
     * Realiza operaciones básicas de compra y venta con un barco.
     * 
     * @param barco Instancia de Barco con la que operar
     * @param cantidad Cantidad de barcos a vender
     */
    public static void operativaBarcos(Barco barco, int cantidad) {
        try {
            System.out.println("Venta de Barcos");
            barco.vender(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al vender: " + e.getMessage());
        }

        try {
            System.out.println("Compra de Barcos");
            barco.comprar(10);
        } catch (Exception e) {
            System.out.println("Fallo al comprar: " + e.getMessage());
        }
    }

    /**
     * Muestra información detallada sobre el barco.
     * 
     * @param barco Instancia de Barco a mostrar
     */
    public static void mostrarInformacionBarco(Barco barco) {
        double valorStock = barco.calcularValorStock();
        System.out.println("El valor total del stock es: " + valorStock);

        try {
            barco.aplicarDescuento(10);
            System.out.println("Se aplicó un descuento del 10%.");
        } catch (Exception e) {
            System.out.println("Error al aplicar descuento: " + e.getMessage());
        }

        barco.personalizarBarco("Modelo Deportivo", "Rojo");
        System.out.println("El modelo actual es: " + barco.obtenerModelo());
        System.out.println("El color actual es: " + barco.obtenerColor());
    }
}