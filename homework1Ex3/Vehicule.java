package homework1Ex3;

public class Vehicule {

	// Attributes

	private double tankSize;

	private double fuelInTank;

	private double fuelEfficiency;

	// Default Constructor
	public Vehicule() {
		this(0, 0, 0);
	}

	// Constructor
	public Vehicule(double tankSize, double fuelInTank, double fuelEfficiency) {
		setTankSize(tankSize);
		setFuelInTank(fuelInTank);
		setFuelEfficiency(fuelEfficiency);
	}

	// Accessors
	// All of these methods are public because we want the user to have access to
	// them as they are getters and setters of the Attributes

	public double getTankSize() {
		return tankSize;
	}

	public double getFuelInTank() {
		return fuelInTank;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	// Mutators
	public void setTankSize(double tankSize) {
		this.tankSize = tankSize;
	}

	public void setFuelInTank(double fuelInTank) {
		this.fuelInTank = fuelInTank;
	}

	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}

	// Fuel filling limit
	public double fillLimit() {
		double fillLimit = getTankSize() - getFuelInTank();

		return fillLimit;
	}

	// Fuel estimator
	public double fuelEstimator(double distance) {
		// Assuming the distance is in Km
		double fuelNeeded = distance / getFuelEfficiency();

		return fuelNeeded;
	}

	// Possible Distance estimator
	public double distanceEstimator() {
		double possibleDistanceToBeTraveled = getFuelEfficiency() * getFuelInTank();

		return possibleDistanceToBeTraveled;
	}

	// Empty fuel tank checker
	public boolean isEmpty() {
		if (getFuelInTank() == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Print all Vehicule attributes
	public String toString() {
		return String.format("Tank Size: %.2f, Fuel in tank: %.2f, Fuel efficiency: %.2f", getTankSize(),
				getFuelInTank(), getFuelEfficiency());
	}

}
