package fundamentals_testing.HW20201207.house;

public class HouseMain {

    public static void main(String[] args) {
       House[] houses = buildHouses();
        System.out.println(getNewestHouse(houses));
    }

    public static House[] buildHouses() {
        return new House[]{
                new House(200.2, "Antakalnis", 2012, "fitted"),
                new House(400.1, "Seskine", 2008, "fitted"),
                new House(320.9, "Zverynas", 2019, "not finished"),
                new House(840.5, "Senamiestis", 2020, "partially finished")
        };
    }

    public static House getNewestHouse(House[] houses) {
        House newestHouse = houses[0];

        for (int i = 0; i < houses.length; i++) {
            if (newestHouse.getBuiltYear() < houses[i].getBuiltYear()) {
                newestHouse = houses[i];
            }
        }
        return newestHouse;
    }

    public static int getNumberOfFittedHouses(House[] houses) {
        int fittedHousesCounter = 0;

        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getCondition().equals("fitted")) {
                fittedHousesCounter++;
            }
        }
        return fittedHousesCounter;
    }

    public static House getSmallestHouses(House[] houses) {
        House smallestHouse = houses[0];

        for (int i = 0; i < houses.length; i++) {
            if (smallestHouse.getHouseArea() > houses[i].getHouseArea()) {
                smallestHouse = houses[i];
            }
        }
        return smallestHouse;
    }
}
