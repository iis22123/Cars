package Cars;

public class Car {
	
	private String marka, modelo, year, pinakida,arithmos_plaisiou;

	public Car(String marka, String modelo, String pinakida, String year, String arithmos_plaisiou) {
		super();
		this.marka = marka;
		this.modelo = modelo;
		this.pinakida = pinakida;
		this.year = year;
		this.arithmos_plaisiou = arithmos_plaisiou;
	}

	public String getMarka() {
		return marka;
	}

	public String getModelo() {
		return modelo;
	}

	public String getYear() {
		return year;
	}

	public String getPinakida() {
		return pinakida;
	}

	public String getArithmos_plaisiou() {
		return arithmos_plaisiou;
	}
	
	
	
}
