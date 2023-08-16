package abstractFactory.templates;

import abstractFactory.templates.products.Bluray;
import abstractFactory.templates.products.PC;
import abstractFactory.templates.products.SistemaSonido;
import abstractFactory.templates.products.TV;

public interface Factory {
	
	public Bluray getBluray();
	public TV getTV();
	public PC getPC();
	public SistemaSonido getSistemaSonido();

}
