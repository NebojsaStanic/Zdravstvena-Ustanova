import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class Pacijent{
	
	private String ime;
	private String prezime;
	private int jmbg;
	private int brKartona;
	
	Doktor izabraniLekar;
	Pregled pregled;
	
	
	public Pacijent(String ime, String prezime, int jmbg, int brk) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.brKartona = brk;
		Logger.getLogger().writeToFile("Kreiran pacijent:", this);
		
	}

	public void izaberiLekara(Doktor doktor) {
		// TODO Auto-generated method stub
		if(izabraniLekar == null){
			izabraniLekar = doktor;
			izabraniLekar.pacijenti.add(this);
			Logger.getLogger().writeToFile("Izabran lekar:", doktor);
		}
		else{
			System.out.println("Pacijent " +this.ime + " vec ima izabranog lekara " + izabraniLekar);
		}
	}

	public void obaviPregled() {
		izabraniLekar.obaviPregled(pregled);
	}
	

	
	public String toString(){
		return ime;
	}
	
	public String getIme(){
		return ime;
	}

}
