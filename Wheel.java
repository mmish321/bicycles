public class Wheel implements Round {

 private double rimDiameter, tireDiameter;
 public static final double STANDARD_TIRE_DIAMETER = 60.0;
 public static final double STANDARD_RIM_DIAMETER = 40.0;

 public Wheel () {
 	this(STANDARD_TIRE_DIAMETER, STANDARD_RIM_DIAMETER);
 }

 public Wheel (double tireDiameter, double rimDiameter) {
  this.tireDiameter = tireDiameter;
 	this.rimDiameter = rimDiameter;
 }

 public double getrimDiameter() {
  return rimDiameter;
 }


 public double gettireDiameter() {
 	return tireDiameter;
 }


 public void settireDiameter(double tireDiameter) {
 	 this.tireDiameter = tireDiameter;
 }

 public void setrimDiameter(double rimDiameter) {
 	this.rimDiameter = rimDiameter;
 }

 public double calculateWheelDiameter() {
 	return this.rimDiameter + ( 2.0 * this.tireDiameter);
 }


}