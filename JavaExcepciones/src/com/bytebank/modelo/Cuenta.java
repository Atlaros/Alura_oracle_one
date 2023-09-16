package com.bytebank.modelo;

/**@version
 * @category
 * @author Adriana
 *
 */
public abstract class Cuenta {

	/*public  accesible desde cualquier parte
	 * default  accesible desde el paquete
	 * protected default + clase hijas
	 * private solo desde la calse misma
	*/
    protected double saldo;
    private int agencia = 1;
    private int numero;
    private Cliente titular = new Cliente();

    private static int total;

    public Cuenta() {

    }

    public Cuenta( int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Estoy creando una cuenta " + this.numero);

        Cuenta.total ++;
    }

    public abstract void deposita(double valor);

    public void  saca(double valor) throws SaldoInsuficienteException {
    	if(this.saldo < valor) {
    		throw new SaldoInsuficienteException("no tienes saldo");
    	}
        this.saldo -= valor;
   
    }

    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            try {
				this.saca(valor);
			} catch (SaldoInsuficienteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

    @Override
    public String toString() {
    	String cuenta =  "Numero: " + this.numero + ", Agencia: " + this.agencia;
    	// TODO Auto-generated method stub
    	return cuenta;
    }
    
    @Override
	public boolean equals(Object obj) {
    	Cuenta cuenta = (Cuenta) obj;
    	return this.agencia == cuenta.getAgencia() && 
    			this.numero == cuenta.getNumero();
	}
}
