public class test {
	
	public static void main(String[] args) {
		
		ParkingLot park = new ParkingLot();
	    park.printParking();
	    
	    park.setVehicle("bus");
	    park.setVehicle("car");
	    park.setVehicle("motorcycle");
	    park.setVehicle("bus");
	    park.setVehicle("car");
	    park.setVehicle("car");
	    park.setVehicle("car");
	    park.setVehicle("car");
	    park.setVehicle("bus");
	   
	   park.setVehicle("bic3i467ycle");
	   park.setVehicle("car");
	   park.setVehicle("bus");
	   System.out.println(park.getVehicle().capacityOfParkingLot());
	   park.setVehicle("bus");
	   System.out.println(park.getVehicle().capacityOfParkingLot());
	  //park.setVehicle("bus");
	   //System.out.println(park.getVehicle().capacityOfParkingLot());
	  
	   /* 
	    park.getVehicle().printParking();
	    
	    
	    park.getVehicle().printParking();
	    */
	    
		   
	    //
	    //park.getVehicle().printParking();
	   
	    
	}

}
