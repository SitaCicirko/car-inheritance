class Car extends Vehicle {
    private double engineCapacity;
    public Car(double engineCapacity, String model, String year) {
        super(model, year);
        this.engineCapacity = engineCapacity;
    }
    public void turnOnEngine() {
    }
    public void turnOffEngine() {
    }
}
