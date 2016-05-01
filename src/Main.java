

public class Main {

	public static void main(String[] args) {
		
		Doktor Milan = new Doktor("Milan","Stojkovic","Hirurg");
		Doktor Uros = new Doktor("Uros","Jovic","Opsta praksa");
		Doktor Jovan = new Doktor("Jovan","Jovanovic","Dermatolog");
		
		Pacijent Dragan = new Pacijent("Dragan", "Stankovic",112233,45);
		Pacijent Srdjan = new Pacijent("Srdjan", "Mikovic",112233,45);
		Pacijent Dejan = new Pacijent("Dejan", "Dejanovic",112233,45);
		
		Dragan.izaberiLekara(Milan);
		Srdjan.izaberiLekara(Milan);
		Srdjan.izaberiLekara(Jovan);
		
		Milan.prikaziPacijente();
		
		Milan.zakaziPregledSecera(Dragan);
		Milan.zakaziPregledHolesterola(Dragan);
		Milan.zakaziPregledPritiska(Dragan);
		
		Milan.prikaziZakazanePreglede(Dragan);
		
		Dragan.obaviPregled();		
		

	}

}
