package adapter;

public class MovableAdapterImp implements MovableAdapter {

	private Movable luxuryCar;

	public MovableAdapterImp(Movable luxuryCar) {
		super();
		this.luxuryCar = luxuryCar;
	}

	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCar.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {

		return mph * 1.60934;
	}

	@Override
	public double getPrice() {

		return convertUSDtoEURO(luxuryCar.getPrice());
	}

	private double convertUSDtoEURO(double price) {

		return price / 1.18;
	}

}
