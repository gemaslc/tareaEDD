/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.aplicacion;

/**
 *
 * @author Gema Natalia
 */
/**
 * La clase Cliente representa a los clientes del Hotel.
 * Contiene información básica como nombre, DNI, teléfono y un código que se genera automáticamente.
 */
public class Cliente {
	/**
	 * Contador para generar códigos para cada cliente.
	 */
    private static int contadorClientes = 0;
    /**
     * Código único del cliente.
     */
    private int codigo;
    /**
     * Nombre del cliente.
     */
    private String nombre;
    /**
     * DNI del cliente.
     */
    private String dni;
    /**
     * Tlfno del cliente.
     */
    private String telefono;
    /**
     * A partir de aqui comienzan los getter y setter.
     */
    public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Y aqui terminan.
	 */
	

	/**
	 *Asi se crea una instancia en Cliente, con su nombre, su dni , telefono y codigo, si el DNI no es correcto
	 *no se creara el objeto/instancia.
	 */
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
        Utilidades.validarDNI(dni); 
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.codigo = obtenerNumeroCliente();
    }
    /**
     * Nos proporciona un numero unico para un cliente especifico.
     */
        private static int obtenerNumeroCliente() {
        contadorClientes++;
        return contadorClientes;
    }

        /**
         * Muestra o devuelve la informacion del cliente
         */
    public String mostrarInformacion() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", DNI: " + dni + ", Teléfono: " + telefono;
    }
}
