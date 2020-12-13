package advanced.enumerators;

public enum AutoMakers {
    BMW(2, "Beemer", true),
    AUDI(4, "Audi", true),
    VW(2, "Volkswagen", false),
    VOLVO(3, "Volvo", false);

    private final int engineSize;
    private final String carName;
    private final boolean runAndDrive;

    AutoMakers(int engineSize, String carName, boolean runAndDrive) {
        this.engineSize = engineSize;
        this.carName = carName;
        this.runAndDrive = runAndDrive;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getCarName() {
        return carName;
    }

    public boolean isRunAndDrive() {
        return runAndDrive;
    }
}
