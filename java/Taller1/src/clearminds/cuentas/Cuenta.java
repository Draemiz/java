package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	
	//Constructores
	
	public Cuenta(String id) {
	    this.id = id;
	    this.tipo = "A";
	    this.saldo = 0;
	}
	
	public Cuenta(String id, String tipo, double saldo) {
	    this.id = id;
	    this.tipo = tipo;
	    this.saldo = saldo;
	}
	
	//Getters y Setters
	
	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprimir() {
	    System.out.println("******************");
	    System.out.println("\nCUENTA\n");
	    System.out.println("******************");
	    
	    System.out.println();
	    
	    System.out.println("Número de Cuenta: " + id);
	    System.out.println("\nTipo: " + tipo);
	    System.out.println("\nSaldo: USD " + saldo);
	    
	    System.out.println();
	    
	}
	
	public void imprimirConMiEstilo() {
	    System.out.println("┌──────────────────────────┐");
	    System.out.println("│        MI CUENTA         │");
	    System.out.println("├──────────────────────────┤");
	    System.out.println("│ ID: " + id);
	    System.out.println("│ Tipo: " + tipo);
	    System.out.println("│ Saldo: $" + saldo);
	    System.out.println("└──────────────────────────┘");
	}
}
