package home_works.HW20201207.tractor;

public class TractorMain {


    public static Tractor getMostExpensiveTractor(Tractor[] tractors) {
        Tractor mostExpensive = tractors[0];

        for (Tractor t : tractors) {
            if (t.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = t;
            }
        }
        return mostExpensive;
    }

    public static Tractor getNewestTractor(Tractor[] tractors) {
        Tractor newest = tractors[0];

        for (Tractor t : tractors) {
            if (t.getMake().isAfter(newest.getMake())) {
                newest = t;
            }
        }
        return newest;
    }

    public static int getNumberOfTractorsWhichTankSizeIsMoreThan(Tractor[] tractors, int expectedTankSize) {
        int counter = 0;

        for (Tractor t : tractors) {
            if (t.getTankSize() > expectedTankSize) {
                counter++;
            }
        }
        return counter;
    }

    public static Tractor getTractorWhichModelStartsWith(Tractor[] tractors, String prefix) {
        Tractor tractor = null;

        for (Tractor t : tractors) {
            if (t.getModel().startsWith(prefix)) {
                tractor = t;
            }
        }
        return tractor;
    }
}
