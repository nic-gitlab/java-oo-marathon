public class Truck extends Automobile {
private int bedLengthFeet;
private int bedWidthFeet;
private int containerHeightFeet = 3;
private int currentLoadCubicFeet;

  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet,
      int bedWidthFeet) {
    super(type, model, make, mpg, fuelCapacity);
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.toggleEngine();
    currentLoadCubicFeet = 0;
  }
  public Truck(String type, String model, String make, int mpg, int fuelCapacity, int bedLengthFeet,
      int bedWidthFeet, int containerHeightFeet) {
    super(type, model, make, mpg, fuelCapacity);
    this.containerHeightFeet = containerHeightFeet;
    this.bedLengthFeet = bedLengthFeet;
    this.bedWidthFeet = bedWidthFeet;
    this.toggleEngine();
    currentLoadCubicFeet = 0;
  }
  public int getBedLengthFeet() {
    return bedLengthFeet;
  }

  public int getBedWidthFeet() {
    return bedWidthFeet;
  }

  public int getContainerHeightFeet() {
    return this.containerHeightFeet;
  }

  public int getCurrentLoadCubicFeet() {
    return this.currentLoadCubicFeet;
  }

  public int volumeCapacity() {
    return this.bedLengthFeet * this.bedWidthFeet * this.containerHeightFeet;
  }

  public boolean addCargo(int cargoToAdd) {
    if(cargoToAdd+currentLoadCubicFeet > this.volumeCapacity()){
      return false;
    }
    currentLoadCubicFeet += cargoToAdd;
    return true;
  }

  public void emptyCargo() {
    currentLoadCubicFeet = 0;
  }
}
