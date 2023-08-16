package abstractFactory;

public class UnicaInstancia {

	private static UnicaInstancia myInstancia=null;
	
	private UnicaInstancia() {
		
	}
	
	public static UnicaInstancia getUnicaInstancia() {
		//HOLA MUNDO
		if(myInstancia==null) {
			myInstancia=new UnicaInstancia();
		}
		return myInstancia;
		
	}
	
	public String sayHello() {
		return "HOLA MUNDO";
	}
	
	
}
