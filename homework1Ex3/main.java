package homework1Ex3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicule Mercedes = new Vehicule(20, 10, 10);

		System.out.println(Mercedes.fuelEstimator(120));

		System.out.println(Mercedes.distanceEstimator());

		System.out.println(Mercedes.fillLimit());

		System.out.println(Mercedes.isEmpty());

		System.out.println(Mercedes.toString());
	}

}
