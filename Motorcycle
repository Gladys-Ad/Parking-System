//Gladys Adjei and CS2336.003

/*This is Motorcycle class for the vehicle motorcycle. contains attributes of motorcycle such as the size of lanes it can park and the number of lanes
 available to be parked for a motorcycle*/

public class Motorcycle extends Vehicle implements Level {
	
	private int numberToPark = 1; //default parks one motorcycle at a time
	private int capacity = parkLot.length * parkLot[0].length;/*the number of space(capacity) available for a motorcycle to park is the the length of the lot because motorcycles can park anywhere*/

	//constructor for motorcycle
	public Motorcycle() {
	}

	//prints the parked vehicles in the parking lot and displays in the required formats. no parameters or return value
	@Override
	public void printParking() {
		assignVehicleToLane();
		for (int i = 0; i < parkLot.length; i++) {
			System.out.print("Level " + (i + 1) + ": ");
			for (int j = 0; j < parkLot[i].length; j++) {
				if (j % 10 == 1 && j != 1) {
					System.out.print(" ");
				}
				System.out.print(parkLot[i][j]);
			}
			System.out.println();

		}
		System.out.println("------------------------------------------");

	}

	
	//specifically for motorcycle, checks if a lane is occupied or not. The parameter is a parking spot. returns true if spot is occupied, false if it's not
	//this shows that motorcyle can park in any lane size.
	@Override
	boolean isOccupied(char spot) {
		if (spot == 'l' || spot == 'c' || spot == 'm') {
			return false;
		}
		return true;
	}

	/*parks a motorcycle in the respective lane. error message will display if space runs out. no parameters and no return values*/
	@Override
	public void assignVehicleToLane() {
		System.out.println("Parking a Motorcycle");
		if (numberToPark > capacityOfParkingLot()) {
			System.out.println("There isn't enough space for your vehicle. \nParking Failed. Final State: ");
			System.exit(1);
		} else
			for (int i = 0; i < getParkLot().length; i++) {
				for (int j = 0; j < getParkLot()[i].length; j++) {
					if (!isOccupied(getParkLot()[i][j]) && numberToPark != 0) {
						getParkLot()[i][j] = 'M';
						numberToPark--;
					}
				}
			}
	}

	
	/*method keeps tabs on the number of space available where a motorcycle can park. adjusts capacity as necessary after each park
	no parameters, however, returns the current number of space availabe where motorcyle can park.*/
	@Override
	int capacityOfParkingLot() {
		for (int i = 0; i < getParkLot().length; i++) {
			for (int j = 0; j < getParkLot()[i].length; j++) {
				if (isOccupied(getParkLot()[i][j])) {
					capacity--;
				}
			}
		}
		if (capacity < 0) {
			capacity = 0;
			return capacity;
		} else
			return capacity;
	}
}
