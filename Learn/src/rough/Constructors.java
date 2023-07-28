package rough;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//car honda=new car();
		//car benz=new car(3000000,"red","desiel");
		
		car audi=new car("car","tn009",4,3500000,"black","cng");
		
		//System.out.println("price:"+benz.price+"\t color:"+benz.color+"\t engine:"+benz.engine);
		
		System.out.println("vehicleType:"+audi.vehicleType+"\t regNo:"+audi.regNo+"\t noofTyres:"+audi.noOftyres+"\t price:"+audi.price+"\t color:"+audi.color+"\t engine:"+audi.engine);
	
		car jeep=new car("car","Ap37cd9999",6,9500000,"grey","petrol","compass");
		
		printing(jeep);
		printing(audi);
		
		bike bajaj=new bike("bike","Ka98nh5678",2,9889897,"blue","petrol","ct100");
		
		printing(bajaj);
		
	}

	public static void printing(car jeep) {
		// TODO Auto-generated method stub
		System.out.println("vehicleType:"+jeep.vehicleType+"\t regNo:"+jeep.regNo+"\t noofTyres:"+jeep.noOftyres+"\t price:"+jeep.price+"\t color:"+jeep.color+"\t engine:"+jeep.engine+"\t model:"+jeep.model);

	}
	
	


}

class vehicle
{
	String vehicleType;
	String regNo;
	int noOftyres;
	
	public vehicle() {
		System.out.println("NO details provided for vehicle..");
	}
	
	public vehicle(String vehicleType, String regNo, int noOftyres) {
		this.vehicleType = vehicleType;
		this.regNo = regNo;
		this.noOftyres = noOftyres;
	}
	
	
}

class car extends vehicle{
	int price;
	String color;
	String engine;
	String model;
	
	public car() {
		System.out.println("NO details provided..");
	}

	public car(int price, String color, String engine) {
		
		this.price = price;
		this.color = color;
		this.engine = engine;
	}

	public car(String vehicleType, String regNo, int noOftyres,int price, String color, String engine) {
		super(vehicleType,regNo,noOftyres);
		this.price = price;
		this.color = color;
		this.engine = engine;
	}
	
	public car(String vehicleType, String regNo, int noOftyres,int price, String color, String engine,String model) {
		this(vehicleType,regNo,noOftyres,price,color,engine);
		this.model = model;
	}
	
}

class bike extends car{
	public bike(String vehicleType, String regNo, int noOftyres,int price, String color, String engine,String model) {
		super(vehicleType,regNo,noOftyres,price,color,engine,model);
	}
	
	void print()
	{
		System.out.println(vehicleType+"\t"+regNo+"\t"+noOftyres+"\t"+price+"\t"+color+"\t"+engine+"\t"+model);
	}
}
