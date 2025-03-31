package barco;

/**
 *
 * @author Oscar
 * @version 2.0 - 28/03/2025
 */
public class Barco {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;
    private String modelo;
    private String color;

    /* Constructor sin argumentos */
    public Barco() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public Barco(String nom, double precio, int stock, String modelo, String color) {
        this.setNombre(nom);
        this.setPrecio(precio);
        this.setStock(stock);
        this.setModelo(modelo);
        this.setColor(color);
    }

    // Método para asignar el nombre del barco
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    // Método que me devuelve el nombre del barco
    public String obtenerNombre() {
        return getNombre();
    }

    // Método que me devuelve el stock de barcos disponible en cada momento
    public int obtenerStock() {
        return getStock();
    }

    /* Método para comprar barcos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede comprar un nº negativo de barcos");
        setStock(getStock() + cantidad);
    }

    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede vender una cantidad negativa de barcos");
        if (obtenerStock() < cantidad)
            throw new Exception("No hay suficientes barcos para vender");
        setStock(getStock() - cantidad);
    }

    // Método adicional para calcular el precio total del stock disponible
    public double calcularValorStock() {
        return getStock() * getPrecio();
    }

    // Método adicional para aplicar un descuento al precio
    public void aplicarDescuento(double porcentaje) throws Exception {
        if (porcentaje < 0 || porcentaje > 100)
            throw new Exception("Porcentaje de descuento inválido");
        setPrecio(getPrecio() - getPrecio() * (porcentaje / 100));
    }

    // Métodos para personalizar el barco con modelo y color
    public void personalizarBarco(String modelo, String color) {
        this.setModelo(modelo);
        this.setColor(color);
    }

    public String obtenerModelo() {
        return getModelo();
    }

    public String obtenerColor() {
        return getColor();
    }

	/**
	 * @return the color
	 */
	private String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	private void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the modelo
	 */
	private String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the stock
	 */
	private int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	private void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @return the precioIVA
	 */
	private double getPrecioIVA() {
		return precioIVA;
	}

	/**
	 * @param precioIVA the precioIVA to set
	 */
	private void setPrecioIVA(double precioIVA) {
		this.precioIVA = precioIVA;
	}

	/**
	 * @return the precio
	 */
	private double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	private void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
