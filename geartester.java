class GearTester{
 public static void main(String[] args) {
 	Round wheel = new Wheel(25.0, 2.5);
 	Gear gear = new Gear(52,11, wheel);
 	System.out.println(wheel.calculateWheelDiameter());
 	
 }

}