package Practica;

public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	//Constructores
	
	public Cuenta(String titular) {
        this(titular, 0); //Sobrecarga
        
    }
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		//si la cantidad es menor que cero, lo ponemos a cero
		if(cantidad < 0) {
			this.cantidad = 0;
		}else {
			this.cantidad=cantidad;
		}
	}
	
	//METODOS
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	// CREAMOS UN METODO PARA INGRESAR DINERO
	/**
     * Ingresa dinero en la cuenta, 
     * solo si es positivo la cantidad
     *
     * @param cantidad
     */
	public void ingresar(double cantidad) {
		if(cantidad>0) {
			//cantida=cantidad+cantidad
			this.cantidad+=cantidad;
		}
	}
	// CREAR UN METODO PARA RETIRAR DINERO
	/**
     * Retira una cantidad en la cuenta, si se quedara en negativo se quedaria
     * en cero
     *
     * @param cantidad
     */
	public void retirar(double cantidad) {
		if(this.cantidad-cantidad<0) {
			this.cantidad=0;
		}else {
			// cantidad=cantidad-cantidad 
			this.cantidad-=cantidad;
		}
	}
	
	@Override
	public String toString() {
		return "EL titular " + titular + " tiene "+cantidad+" euros en la cuenta";
	}
	
}
