package barco;

import junit.framework.TestCase;

/**
 * Clase de Junit para realizar los tests.
 * Contiene tests para verificar el correcto funcionamiento de los métodos.
 * @author Oscar
 * @version 3.0 - 28/03/2025
 */
public class BarcoTest extends TestCase {

    /**
     * Constructor que inicializa el test case con un nombre específico.
     * 
     * @param testName Nombre que sirve para identificar el test
     */
    public BarcoTest(String testName) {
        super(testName);
    }

    /**
     * Método que se ejecuta antes de cada prueba individual.
     * Utilizado para iniciar valores que hagan falta para los tests
     * 
     * @throws Exception Si ocurre algún error durante la el inicio de los parámetros
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     * Método que se ejecuta después de cada prueba individual.
     * Se utiliza para liberar recursos utilizados en los tests.
     * 
     * @throws Exception Si ocurre algún error durante la liberación
     */
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Prueba el método comprar con una cantidad válida (positiva).
     * Verifica que el stock se incrementa correctamente cuando
     * se compra una cantidad válida de barcos.
     * 
     * @throws Exception Si ocurre algún error durante la ejecución
     */
    public void testComprar1() throws Exception {
        System.out.println("Test de prueba para Comprar - Caso válido");
        int cantidad = 100;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        barco1.comprar(cantidad);
        assertTrue(barco1.obtenerStock() == 400);
    }

    /**
     * Prueba el método comprar con una cantidad negativa.
     * Verifica que se lanza una excepción cuando se intenta
     * comprar una cantidad negativa de barcos.
     * 
     * @throws Exception Si ocurre algún error durante la ejecución
     */
    public void testComprar2() throws Exception {
        System.out.println("Test de prueba para Comprar - Cantidad negativa");
        int cantidad = -100;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        try {
            barco1.comprar(cantidad);
            fail("Se esperaba una excepcion por cantidad negativa");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    /**
     * Prueba el método vender con una cantidad válida (dentro del stock disponible).
     * Verifica que el stock se reduce correctamente cuando
     * se vende una cantidad válida de barcos.
     * 
     * @throws Exception Si ocurre algún error durante la ejecución
     */
    public void testVender1() throws Exception {
        System.out.println("Test de prueba para Vender - Caso válido");
        int cantidad = 200;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        barco1.vender(cantidad);
        assertTrue(barco1.obtenerStock() == 100);
    }

    /**
     * Prueba el método vender con una cantidad mayor al stock disponible.
     * Verifica que se lanza una excepción cuando se intenta
     * vender más barcos de los disponibles en stock.
     * 
     * @throws Exception Si ocurre algún error durante la ejecución
     */
    public void testVender2() throws Exception {
        System.out.println("Test de prueba para Vender - Stock insuficiente");
        int cantidad = 400;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        try {
            barco1.vender(cantidad);
            fail("Se esperaba una excepcion por cantidad mayor al stock");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    /**
     * Prueba el método vender con una cantidad negativa.
     * Verifica que se lanza una excepción cuando se intenta
     * vender una cantidad negativa de barcos.
     * 
     * @throws Exception Si ocurre algún error durante la ejecución
     */
    public void testVender3() throws Exception {
        System.out.println("Test de prueba para Vender - Cantidad negativa");
        int cantidad = -200;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        try {
            barco1.vender(cantidad);
            fail("Se esperaba una excepcion por cantidad negativa");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}