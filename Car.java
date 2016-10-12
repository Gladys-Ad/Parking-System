//Gladys Adjei and CS2336.003

/*This is car class for the vehicle car. contains attributes of car such as the size of lanes it can park and the number of lanes
 available to be parked for a car*/

public class Car extends Vehicle implements Level{
	private int numberToPark = 1; //default parks one car at a time
	private int capacity = 120;//(0.8*parkLot.length * parkLot[0].length) 120 available spots to park because car can park in 80% or lot
	
	//constructor for car
	public Car(){
	}

	/*parks a car in the respective lane. error message will display if space runs out. no parameters and no return values*/
	@Override
	public void assignVehicleToLane() {
		System.out.println("Parking a Car");
		if (numberToPark > capacityOfParkingLot()) {
			System.out.println("There isn't enough space for your vehicles. \nParking Failed. Final State: ");
			System.exit(1);
		}else
		for (int i = 0; i < getParkLot().length; i++) {
			for (int j = 0; j < getParkLot()[i].length; j++) {
				if (!isOccupied(getParkLot()[i][j]) && numberToPark != 0) {
					getParkLot()[i][j] = 'C';
					numberToPark--;
				}
			}
		}
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

	//specifically for car, checks if a lane is occupied or not. The parameter is a parking spot. returns true if spot is occupied, false if it's not
	//Tells that car can only park in large or compact spots. any spot besides that will be seen as occupied and cannot park there
	@Override
	boolean isOccupied(char spot) {
		if(spot == 'l' || spot == 'c' ){
			return false;
}
		return true;
	}

	/*method keeps tabs on the number of space available where a car can park. adjusts capacity as necessary after each park
	no parameters, however, returns the current number of space availabe where car can park. when capacity is at 0, 
	assignvehicletolane will display error message that lot is full. We dont care to check for spot m or M because 
	the initialized value of capacity for car has already been adjusted to not include the spots of m hence 120.*/
	@Override
	int capacityOfParkingLot() {
		int capacity = 120;
		for (int i = 0; i < getParkLot().length; i++) {
			for (int j = 0; j < getParkLot()[i].length; j++) {
				if (getParkLot()[i][j] == 'C' || getParkLot()[i][j] == 'B') {
					capacity--;
				}
			}
		}
		this.capacity = capacity;
		if (this.capacity < 0) {
			this.capacity = 0;
			return this.capacity;
		} else
			return this.capacity;
	}
}
