//Gladys Adjei and CS2336.003

/*This is Level interface, will be implemented by the classes. contains template of empty parking lot and printparking method signature.*/

public interface Level {
	char [][] tempLevel = {
			{'l','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m'},
			{'l','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m'},
			{'l','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m'},
			{'l','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m'},
			{'l','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m','m'}
			};
	
	//the method will print the state of the parking lot
	void printParking();

}
