public class Car extends Automobile{
private int capacity;
private int numPassengers;

  public Car(String type, String model, String make, int mpg, int fuelCapacity, int capacity, int numPassengers) {
    super(type, model, make, mpg, fuelCapacity);
    this.capacity = capacity;
    this. numPassengers = numPassengers;
    this.toggleEngine();
  }
  public int getCapacity() {
    return this.capacity;
  }

  public int getNumPassengers() {
    return this.numPassengers;
  }

  public boolean addPassengers(int passengersToAdd) {
    if(this.numPassengers+passengersToAdd > this.capacity){
      return false;
    }
    numPassengers += passengersToAdd;
    return true;
  }

  public void exitPassengers(int passengersToExit){
    if(numPassengers-passengersToExit < 0 ){
      numPassengers = 0;
    }else {
      numPassengers -= passengersToExit;
    }
  }
}
