
public class Holesterol extends Pregled {

	Holesterol(){
		super();
		naziv = "Nivo holesterola u krvi";
		vrednost = 12;
		vremeOdObroka = 3;
	}
	public void rezultati(){
		//log.rezultati(this);
		System.out.println(naziv + " " + vrednost + ":" + " vreme od obroka:" + vremeOdObroka);
	}

	
}
