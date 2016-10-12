//Gladys Adjei and CS2336.003

/*This is Parking Lot class. its where everything happens. The vehicles will be made and
 * parked here.*/

//in the main method, all you have to do is create an instance of ParkingLot  
//then to park and print, call setVehicle("vehicle") to instantiate and park.
//Example: setVehicle("Motorcycle") or setVehicle("Car") or setVehicle("Bus")
// the input is case sensitive has to be the exact name of the classes.
public class ParkingLot implements Level {
	
	private char[][] level;//2D array to contain the parking lanes(l,c,m) of each level
	private Vehicle vehicle;// use aggregation since a parking lot has vehicle(s) - has-a relationship

	// default constructor for parkinglot
	public ParkingLot() {
	}
	
//retrieved vehicle information
	Vehicle getVehicle() {
		return vehicle;
	}
	

	/*sets what type of vehicle into parkinglot. moto,car, or bus. you will take an input, then if there's a class with the same name as the input
	 and if it is an instance of a vehicle, then an instance of the appropriate vehicle(input) would be created. 
	  this method prevents too much code in the main method as it instantiates, parks, and prints. 
	  does not return any value, hence void. Exceptions are put in place to display error messages.*/
	void setVehicle(String input) {
		Object object;
		try {
			object = Class.forName(input).newInstance();
			this.vehicle = (Vehicle) object;
			vehicle.printParking();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			System.out.println("Vehicle type invalid");
		}
	}

	
	// this will print an empty parking lot with the five levels. There are no parameters or return value.
	//It goes through the array and prints, separating at the appropriate place to display the preffered format of the lot.
	public void printParking() {
		
		System.out.println("Empty parkingLot");
		this.level = Level.tempLevel;
		for (int i = 0; i < level.length; i++) {
			System.out.print("Level " + (i + 1) + ": ");
			for (int j = 0; j < level[i].length; j++) {
				if (j % 10 == 1 && j != 1) {
					System.out.print(" ");
				}
				System.out.print(level[i][j]);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
	}
	
	
}
