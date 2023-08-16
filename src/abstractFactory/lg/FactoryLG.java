package abstractFactory.lg;

import abstractFactory.templates.Factory;
import abstractFactory.templates.products.Bluray;
import abstractFactory.templates.products.PC;
import abstractFactory.templates.products.SistemaSonido;
import abstractFactory.templates.products.TV;

public class FactoryLG implements Factory{

	@Override
	public Bluray getBluray() {
		return new BlurayLG();
	}

	@Override
	public TV getTV() {
		return new TVLG();
	}

	@Override
	public PC getPC() {
		return new PCLG();
	}

	@Override
	public SistemaSonido getSistemaSonido() {
		return new SistemaSonidoLG();
	}

}
