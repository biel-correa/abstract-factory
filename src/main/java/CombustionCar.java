public class CombustionCar implements Car {
    @Override
    public String start() {
        return "Starting combustion car";
    }

    @Override
    public String stop() {
        return "Stopping combustion car";
    }
}