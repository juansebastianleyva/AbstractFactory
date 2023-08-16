package abstractFactory;

import abstractFactory.lg.BlurayLG;
import abstractFactory.lg.FactoryLG;
import abstractFactory.samsung.FactorySamsung;
import abstractFactory.samsung.TVSamsung;
import abstractFactory.templates.Factory;
import abstractFactory.templates.products.Bluray;
import abstractFactory.templates.products.PC;
import abstractFactory.templates.products.SistemaSonido;
import abstractFactory.templates.products.TV;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BlurayLG bluR=new BlurayLG();
//		TVSamsung tv= new TVSamsung();
				
		Factory factory=new FactoryLG();
		
		Bluray bluray=factory.getBluray();
		TV tv=factory.getTV();
		TV tv2=factory.getTV();
		PC pc=factory.getPC();
		SistemaSonido sistemaSonido=factory.getSistemaSonido();
		UnicaInstancia u1=UnicaInstancia.getUnicaInstancia();
		UnicaInstancia u2=UnicaInstancia.getUnicaInstancia();
		
		System.out.println(tv.toString());
	
		System.out.println("adios mundo");
		System.out.println(u1.sayHello());
		System.out.println(u2.sayHello());
	}

	// switch (key) {
	// 	case value:
			
	// 		break;
	
	// 	default:
	// 		break;
	// }

}
