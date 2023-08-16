package abstractFactory.lg;

import abstractFactory.templates.products.PC;

public class PCLG implements PC{

	@Override
	public int getPrice() {
		return 250000;
	}

}
