public class ElectricCar implements Car {
    @Override
    public String start() {
        return "Starting electric car";
    }

    @Override
    public String stop() {
        return "Stopping electric car";
    }
}
