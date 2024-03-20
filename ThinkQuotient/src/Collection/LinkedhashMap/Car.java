package Collection.LinkedhashMap;
//WAP to create a Map with Integer as key and any other object as value. 
public class Car {
	private String make;
    private String model;
    
	
		// TODO Auto-generated method stub
		

	    public Car(String make, String model)
	    {
	        this.make = make;
	        this.model = model;
	    }

	    public String getMake() {
	        return make;
	    }

	    public String getModel() {
	        return model;
	    }

	    @Override
	    public String toString() {
	        return make + " " + model;
	    }
	}


