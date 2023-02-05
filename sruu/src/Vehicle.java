public class Vehicle {
    private String model;
    private String year;
    public Vehicle(String model, String year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() { // [1]
        return this.model; // [2]
    } // [3]
    public String getYear() { // [4]
        return this.year; // [5]
    } // [6]

}
