package week_8.car_factory.enums;

public class Engine {
    private String engineModel;
    private int power;
    private EngineType engineType;

    public Engine() {
        this("", 0, EngineType.randomEngine());
    }
    public Engine(String model, int power, EngineType engineType) {
        this.engineModel = model;
        this.power = power;
        this.engineType = engineType;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
