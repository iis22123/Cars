package Cars;

public class Insurance {
	
	private String kodikos_paketou, perigrafi, diarkeia;

	public Insurance(String kodikos_paketou, String perigrafi, String diarkeia) {
		super();
		this.kodikos_paketou = kodikos_paketou;
		this.perigrafi = perigrafi;
		this.diarkeia = diarkeia;
	}

	public String getKodikos_paketou() {
		return kodikos_paketou;
	}

	public String getPerigrafi() {
		return perigrafi;
	}

	public String getDiarkeia() {
		return diarkeia;
	}

}
