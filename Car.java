package day1;
 
public class Car {

	public void applyBreak() {
		System.out.println("apply break");
	}
	
	public void applyGear() {
		System.out.println("apply gear");
	}
	
	public void switchOnAc() {
		System.out.println(" can we switch on Ac");
	}
	
	public void applyAccelerate() {
		System.out.println(" can we accelerate");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car audi = new Car();
        audi.applyBreak();
        audi.applyGear();
        audi.applyAccelerate();
        audi.switchOnAc();
	}

}