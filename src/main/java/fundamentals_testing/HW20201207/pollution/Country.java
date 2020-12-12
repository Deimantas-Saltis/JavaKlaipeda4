package fundamentals_testing.HW20201207.pollution;

public class Country {

    private String name;
    private int co2Emission;
    private String pollutionFactor; // animal husbandry`, `transportation`, `factories`

    public Country(String name, int co2Emission, String pollutionFactor) {
        this.name = name;
        this.co2Emission = co2Emission;
        this.pollutionFactor = pollutionFactor;
    }

    public String getName() {
        return name;
    }

    public int getCo2Emission() {
        return co2Emission;
    }

    public String getPollutionFactor() {
        return pollutionFactor;
    }
}
