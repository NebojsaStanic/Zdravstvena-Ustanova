import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
	
	Date datum = new Date();
	
	private static Logger log;
	
	private Logger(){};
	
	public static Logger getLogger(){
		if(log == null){
			log = new Logger();
		}
		return log;
	}
	
	public void writeToFile(String str, Object o){
		try{
			BufferedWriter out = new BufferedWriter(new FileWriter("C:/java.log/LOG",true));
			out.write(datum + " " + str + " " + o);
			out.newLine();
			out.close();
		}
		catch(IOException e){
			System.out.println("Greska!");
		}
	}
}

