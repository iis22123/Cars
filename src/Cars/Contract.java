package Cars;

public class Contract {
	
	private String cost;
	private Customer cus;
	private Car car;
	private Insurance ins;
	
	public Contract(String cost, Customer cus, Car car, Insurance ins) {
		super();
		this.cost = cost;
		this.cus = cus;
		this.car = car;
		this.ins = ins;
	}

	public String getCost() {
		return cost;
	}

	public Customer getCus() {
		return cus;
	}

	public Car getCar() {
		return car;
	}

	public Insurance getIns() {
		return ins;
	}
	
	public void printData(Customer cus, Insurance ins) {
		System.out.println("Όνομα: "+cus.getName()+" "+cus.getLastName()+" Αριθμός πινακίδας: " +car.getPinakida()+ " Περιγραφή: "+ ins.getPerigrafi()+" Κόστος: "+cost);
	}

}
