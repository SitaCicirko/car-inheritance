public class Main {
    public static void main(String[] args) { // [1]
        Car car = new Car(2.5, "JWT", "2001"); // [2]
        String model = car.getModel(); // [3]
        System.out.println(model); // [4]
}
}