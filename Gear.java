public class Gear {
 private int chainring, cog;
 private Round wheel;
 public static final int STANDARD_CHAINRING = 20;
 public static final int STANDARD_COG = 20;


 public Gear(int chainring, int cog, Round wheel) {
 	this.chainring = chainring;
 	this.cog = cog;
 	this.wheel = wheel;
 }

 
 public int getChainring() {
 	return chainring;
 }

 public void setChainring(int chainring) {
  this.chainring = chainring;
 }

 public int getCog() {
 return cog;
 }

 public void setCog(int cog) {
 	this.cog = cog;
 }

 double calculateRatio() {
  return this.chainring/((double) this.cog);
 }

 public String toString() {
  return chainring + " " + cog + " " + calculateRatio();
 }

 double calculateGearInches() {
 	return  wheel.calculateWheelDiameter()* calculateRatio();
 }

 


}




