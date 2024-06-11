package Cars;

public class Customer {
	
	private String name, lastName, diefthinsi, arithmos_diplomatos;

	public Customer(String name, String lastName, String diefthinsi, String arithmos_diplomatos) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.diefthinsi = diefthinsi;
		this.arithmos_diplomatos = arithmos_diplomatos;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDiefthinsi() {
		return diefthinsi;
	}

	public String getArithmos_diplomatos() {
		return arithmos_diplomatos;
	}
	
	public void printData(Car car, Contract con) {
		System.out.println("Όνομα: "+name+" "+lastName+" Όχημα: " +car.getModelo()+" "+car.getMarka()+" "+car.getPinakida()+" Κόστος: "+con.getCost());
	}
	
	
}
