package abstractFactory.samsung;

import abstractFactory.templates.Factory;
import abstractFactory.templates.products.Bluray;
import abstractFactory.templates.products.PC;
import abstractFactory.templates.products.SistemaSonido;
import abstractFactory.templates.products.TV;

public class FactorySamsung implements Factory{

	@Override
	public Bluray getBluray() {
		return new BluraySamsung();
	}

	@Override
	public TV getTV() {
		return new TVSamsung();
	}

	@Override
	public PC getPC() {
		// TODO Auto-generated method stub
		return new PCSamsung();
	}

	@Override
	public SistemaSonido getSistemaSonido() {
		return new SistemaSonidoSamsung();
	}

}
