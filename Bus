//Gladys Adjei and CS2336.003

/*This is Bus class for the vehicle Bus. contains attributes of bus such as the size of lanes it can park and the number of lanes
 available to be parked for a bus*/

public class Bus extends Vehicle implements Level {
	private int numberToPark = 1;// default parks one bus as a time
	private int capacity = 5; // there are only 5 accomodations in the entire lot for a bus. one on each level.
	
	//constructor for bus
	public Bus() {
	}

	/*parks a bus in the respective lane.it checks if the next 4 consec. spaces are valid spots to park since bus needs 5 spots
	 *  error message will display if space runs out. no parameters and no return values*/
	@Override
	public void assignVehicleToLane() {
		System.out.println("Parking a Bus");
		if (capacityOfParkingLot() == 0){
					System.out.println("There isn't enough space for your vehicle. \nParking Failed. Final State: ");
				}
		else{
		for (int i = 0; i < getParkLot().length; i++) {
			for (int j = 0; j < getParkLot()[i].length; j++) {
				if (numberToPark!=0 && !isOccupied(getParkLot()[i][j])
						&& !isOccupied(getParkLot()[i][j + 1])
						&& !isOccupied(getParkLot()[i][j + 2])
						&& !isOccupied(getParkLot()[i][j + 3])
						&& !isOccupied(getParkLot()[i][j + 4])) {
					getParkLot()[i][j] = 'B';
					getParkLot()[i][j + 1] = 'B';
					getParkLot()[i][j + 2] = 'B';
					getParkLot()[i][j + 3] = 'B';
					getParkLot()[i][j + 4] = 'B';
					numberToPark--;
				}
			}
		}
		}

	}

	//prints the parked vehicles in the parking lot and displays in the required formats. no parameters or return value
	//this method has the assignVehicle method in it so that you don't have to call every method in the class. The ultimate
	//goal is to park a car, so it is efficient when this method can park and print at the same time.
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

	//specifically for bus, checks if a lane is occupied or not. 
	//this also says a bus can only be parked in large spot. if a spot is not large then it is occupied hence bus can't park
	//The parameter is a parking spot. returns true if spot is occupied, false if it's not
	@Override
	boolean isOccupied(char spot) {
		if (spot == 'l') {
			return false;
		}
		return true;
	}

	/*method keeps tabs on the number of space available where a Bus can park. adjusts capacity as necessary after each park
	no parameters, however, returns the current number of space availabe where bus can park. This way when capacity is zero, the 
	assign vehicletolane method will display an error message that parking is full*/
	@Override
	int capacityOfParkingLot() {
		int count = 0;
		int capacity = 5;
		for (int i = 0; i < getParkLot().length; i++) {
			for (int j = 0; j < getParkLot()[i].length; j++) {
				if (getParkLot()[i][j] == 'l') {
					count++;
				}
			}
			if(capacity == 0){
				capacity = 0;
			}
			else if((count/5)<1){
			capacity--;
			}
			count = 0;
			this.capacity = capacity;
		}
		return this.capacity;
	}

}
