package HW20201207.houses;

import fundamentals_testing.HW20201207.house.House;
import fundamentals_testing.HW20201207.house.HouseMain;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/*
    Susikurti objektą `House`, su laukais: `houseArea`, `district`, `builtYear`, `condition`
        * Inicializuoti 3 `House` objektus;
        * Rasti ir atspausdinti naujausio namo objektą;
        * Rasti visus įrengtus namus - fitted;
        * Rasti ir atspausdinti mažiausią pagal plotą namo objektą.
        P.S. `condition` kintamasis gali turėti reikšmes: `fitted`, `partially finished`, `not finished`
* */
public class HouseMainTest {

    static House[] houses;

    @BeforeAll
    static void setUp(){
        // given
        houses = buildHouses();
    }

    @Test
    public void shouldReturnNewestHouse() {
        // when
        House result = HouseMain.getNewestHouse(houses);

        // then
        Assertions.assertThat(result.getBuiltYear()).isEqualTo(2020);
    }

    @Test
    public void shouldReturnNumberOfFittedHouses() {
        // when
        int result = HouseMain.getNumberOfFittedHouses(houses);

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldReturnSmallestHouse() {
        // when
        House result = HouseMain.getSmallestHouses(houses);

        // then
        Assertions.assertThat(result.getHouseArea()).isEqualTo(200.2);
    }

    private static House[] buildHouses() {
        return new House[]{
                new House(200.2, "Antakalnis", 2012, "fitted"),
                new House(400.1, "Seskine", 2008, "fitted"),
                new House(320.9, "Zverynas", 2019, "not finished"),
                new House(840.5, "Senamiestis", 2020, "partially finished")
        };
    }
}
