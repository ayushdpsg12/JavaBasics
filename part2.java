package basics;

public class part2 {

	public static void main(String[] args) {
		
		Truck t1 = new Truck();
		t1.speed = 100.54;
		t1.regularPrice = 1500000;
		t1.color ="orange";
		t1.weight = 3000;
		
		Truck t2 = new Truck();
		t2.speed = 110.84;
		t2.regularPrice = 1600000;
		t2.color ="yellow";
		t2.weight = 2000;
		
		System.out.println("Price of Truck T1 is: " + t1.getSalePrice());
		System.out.println("Price of Truck T2 is: " + t2.getSalePrice());
		
		
	}
}
 

 class car{
	double speed;
	float regularPrice;
	String color;
	
	float getSalePrice() {
		return regularPrice;
	}
	
	
}
 
 class Truck extends car{
	 float weight;
	 
	 float getSalePrice() {
		 if(weight>2300) 
			 {return (float) (0.9*regularPrice);}
		 else
		 { return (float) (0.8*regularPrice);}
		 
	 }
 }