//Gladys Adjei and CS2336.003

/*This is the Vehicle class. it is the base class for all the types of vehicles. it includes a copy of the parking lot where
 * the vehicles will park. it contains abstract methods that each would be defined in the sub classes. the concept of polymorphism 
 * would be implemented*/

//implement interface called level which contains the array of empty parking lot
public abstract class Vehicle implements Level{

protected char parkLot [][] = Level.tempLevel ;// This is the base parking lot in which the vehicles will park

//default constructor for vehicle
protected Vehicle (){
}
//method checks if a lane is occupied or not. parameter is the type of spot, l,c,or m. it returns true or false
abstract boolean isOccupied(char spot);

//method parks the vehicle in the lane. no parameter and no return value.
abstract void assignVehicleToLane();

//create a method that tracks the capacity of the parking lot. no parameter. returns how much space is left that can be parked at for the respective vehicle
abstract int capacityOfParkingLot();

//gets the current status of the parking lot
char [][] getParkLot (){
	return this.parkLot;
}


}
