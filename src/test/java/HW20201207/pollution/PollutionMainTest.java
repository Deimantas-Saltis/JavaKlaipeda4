package HW20201207.pollution;

import fundamentals_testing.HW20201207.pollution.Country;
import fundamentals_testing.HW20201207.pollution.PollutionMain;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/*
     Sukurti objektą `Country`, kuris turės laukus: `name`, `co2Emission`, `pollutionFactor`
       * Surasti mažiausiai užterštą šalį (kurios co2Emission yra mažiausias);
       * Apskaičiuoti visų šalių bendrą užterštumą;
       * Apskaičiuoti visų šalių vidutinį užterštumą;

       P.S. `pollutionFactor` galimos reikšmės: `animal husbandry`, `transportation`, `factories`
       P.P.S jei didžiausias užterštumo faktorius šalyje yra:
       * `animal husbandry`, tuomet šalies co2 kiekį dauginkite iš 1.2,
       * `transportation`, tuomet šalies co2 kiekį dauginkite iš 0.9,
       * `factories`, tuomet šalies co2 kiekį dauginkite iš 1.4
*
* */

public class PollutionMainTest {

    static Country[] countries;

    @BeforeAll
    static void setUp() {
        countries = buildCountries();
    }

    @Test
    public void findLeastPollutedCountry() {
        // when
        Country result = PollutionMain.getLeastPollutedCountry(countries);

        // then
        Assertions.assertThat(result.getName()).isEqualTo("Argentina");
    }

    @Test
    public void findAverageCo2EmissionOfAllCountries() {
        // when
        int result = (int) PollutionMain.getAverageEmissionOfAllCountries(countries);

        // then
        Assertions.assertThat(result).isEqualTo(5756);
    }

    @Test
    public void countTotalEmissionOfAllContinents() {
        // when
        int result = (int) PollutionMain.getTotalEmissionsOfAllCountries(countries);

        // then
        Assertions.assertThat(result).isEqualTo(51806);
    }


    public static Country[] buildCountries() {
        return new Country[]{
                new Country("Lithuania", 501, "transportation"),
                new Country("Germany", 4025, "factories"),
                new Country("Sweden", 2847, "transportation"),
                new Country("Brazil", 7536, "animal husbandry"),
                new Country("Colombia", 6001, "transportation"),
                new Country("Argentina", 171, "factories"),
                new Country("China", 9872, "animal husbandry"),
                new Country("India", 7561, "factories"),
                new Country("Russia", 6714, "transportation")
        };
    }
}
