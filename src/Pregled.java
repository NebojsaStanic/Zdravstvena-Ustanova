import java.util.Date;

public abstract class Pregled {

	String naziv;
	Date datum;
	int vrednost;
	int vremeOdObroka;
	int gornjaVr;
	int donjaVr;
	int puls;
	
	
	public Pregled(){
		datum = new Date();
	}
	
	public String toString(){
		return naziv;
	}
	
	public void rezultati(){}

	
}
