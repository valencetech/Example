package example_one;

public abstract class Vehicles {
	
	private String type = "Generic";
	private String[] vehicleType = {"Generic", "Car", "WaterCraft", "Aircraft", "Spacecraft"};
	
	public Vehicles (String type){
		this.type = this.vehicleType[0];
		System.out.println(this.type);
		
	}
	
	/**
	 * @return the vehicleType
	 */
	public String[] getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String[] vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Vehicles (){
		
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
