package adapter;

public class TestOutput {
	public static void main(String[] args) {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImp(bugattiVeyron);
		System.out.println("Speed in KMPH :"+bugattiVeyronAdapter.getSpeed());
		System.out.println("Price in EURO :"+bugattiVeyronAdapter.getPrice());

	}

}
