package barco;

/**
 * Clase que representa un barco con sus propiedades y operaciones básicas.
 * Permite gestionar el stock, aplicar descuentos y personalizar características.
 * 
 * @author Oscar
 * @version 3.0 - 28/03/2025
 */
public class Barco {
    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;
    private String modelo;
    private String color;

    /**
     * Constructor por defecto que crea una instancia de Barco sin parámetros.
     */
    public Barco() {
    }

    /**
     * Constructor que inicializa todas las propiedades del barco.
     * 
     * @param nom Nombre del barco
     * @param precio Precio base del barco
     * @param stock Cantidad inicial en inventario
     * @param modelo Modelo del barco
     * @param color Color del barco
     */
    public Barco(String nom, double precio, int stock, String modelo, String color) {
        this.setNombre(nom);
        this.setPrecio(precio);
        this.setStock(stock);
        this.setModelo(modelo);
        this.setColor(color);
    }

    /**
     * Asigna un nuevo nombre al barco.
     * 
     * @param nom Nuevo nombre para el barco
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre actual del barco.
     * 
     * @return Nombre del barco
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Obtiene la cantidad actual en stock.
     * 
     * @return Número de unidades disponibles
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Incrementa el stock con la cantidad especificada.
     * 
     * @param cantidad Número de unidades a añadir (debe ser positivo)
     * @throws Exception Si la cantidad es negativa
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede comprar un nº negativo de barcos");
        setStock(getStock() + cantidad);
    }

    /**
     * Reduce el stock con la cantidad especificada.
     * 
     * @param cantidad Número de unidades a vender (debe ser positivo y menor o igual al stock)
     * @throws Exception Si la cantidad es negativa o mayor al stock disponible
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede vender una cantidad negativa de barcos");
        if (obtenerStock() < cantidad)
            throw new Exception("No hay suficientes barcos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Calcula el valor total del inventario actual.
     * 
     * @return Valor monetario del stock (precio unitario × cantidad)
     */
    public double calcularValorStock() {
        return getStock() * getPrecio();
    }

    /**
     * Aplica un descuento porcentual al precio del barco.
     * 
     * @param porcentaje Valor del descuento (entre 0 y 100)
     * @throws Exception Si el porcentaje no está en el rango válido
     */
    public void aplicarDescuento(double porcentaje) throws Exception {
        if (porcentaje < 0 || porcentaje > 100)
            throw new Exception("Porcentaje de descuento inválido");
        setPrecio(getPrecio() - getPrecio() * (porcentaje / 100));
    }

    /**
     * Personaliza las características visuales del barco.
     * 
     * @param modelo Nuevo modelo del barco
     * @param color Nuevo color del barco
     */
    public void personalizarBarco(String modelo, String color) {
        this.setModelo(modelo);
        this.setColor(color);
    }

    /**
     * Obtiene el modelo actual del barco.
     * 
     * @return Modelo del barco
     */
    public String obtenerModelo() {
        return getModelo();
    }

    /**
     * Obtiene el color actual del barco.
     * 
     * @return Color del barco
     */
    public String obtenerColor() {
        return getColor();
    }

    // Métodos getters y setters con documentación básica
    /**
     * @return Color actual del barco
     */
    private String getColor() {
        return color;
    }

    /**
     * @param color Nuevo color para el barco
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
