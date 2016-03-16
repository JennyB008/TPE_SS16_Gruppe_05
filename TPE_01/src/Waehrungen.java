
public class Waehrungen {
	private String name;
	private String kuerzel;
	private double kurs;
	
	public Waehrungen (String name, String kuerzel, double kurs){
		this.name = " ";
		this.kuerzel = " ";
		this.kurs = 0.0;
	}
	public String getName(){
		return name;
	}
	public String getKuerzel(){
		return kuerzel;
	}
	public double getKurs(){
		return kurs;
	}
}
