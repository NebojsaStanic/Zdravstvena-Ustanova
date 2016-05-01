
public class Secer extends Pregled {
	
	Secer(){
		super();
		naziv = "Nivo secera u krvi";
		vrednost = 5;
		vremeOdObroka = 2;
	}
	
	public void rezultati(){
		System.out.println(naziv + " " + vrednost + ":" + " vreme od obroka:" + vremeOdObroka);
	}

}
