
public class Pritisak extends Pregled {
	
	int puls = 65;
	int gornjaVr = 130;
	int donjaVr = 68;
	
	public Pritisak(){
		super();
		naziv = "Krvni pritisak";
	}
	
	public void rezultati(){
		System.out.println("Pritisak: "+gornjaVr+"/"+donjaVr+", i puls: "+puls);
	}


}
