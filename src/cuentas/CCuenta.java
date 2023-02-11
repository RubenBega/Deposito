package cuentas;


public class CCuenta {

/**
 * Clase CCuenta. Inicialmente se crean los atributos con los que se va a trabajar.
 * Se les obtendrá un set y get para poder manipularlos externamente.
 *
 *  
*/
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    /**
     * 
     * Incluye un primer método para hacer un ingreso, comprobando que no puede hacerse un ingreso en negativo, arrojando un primer mensaje. 
     * @param cantidad
     * @throws Exception
     */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * A través del método retirar se comprueba que la cantidad no sea negativa, resultando un error. También analiza si el estado de la cuenta, 
     * a través de un método externo, es inferior a la cantidad que se desea retirar, dando como mensaje que no hay suficiente saldo.
     * En caso que se cumpla la condición, se le restará la cantidad solicitada al saldo, resultando saldo con los valores actualizados, y mostrando un mensaje nuevo.
     * @param cantidad
     * @throws Exception
     */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
        System.out.println ("Esta es una prueba de funcionamiento para comprobar el historial");
    }

    
    //getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    
    
}

