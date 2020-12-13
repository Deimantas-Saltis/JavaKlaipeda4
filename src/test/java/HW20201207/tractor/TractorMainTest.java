package HW20201207.tractor;

import home_works.HW20201207.tractor.Tractor;
import home_works.HW20201207.tractor.TractorMain;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

/*
    Susikurti `Tractor` objektą, kuris turės laukus:
        * `tractorMaker`, `model`, `tankSize`, `make` (LocalDate), `price`;
        * Rasti brangiausią traktorių;
        * Rasti naujausią traktorių;
        * Rasti traktorius, kurių degalų bako dydis didesnis nei 300 litrų;
        * Rasti modelius, kurie prasideda raide M.
        P.S. `tractorMaker` kintamasis gali turėti reikšmes: `john-deer`, `fend`, `belarus`
* */

public class TractorMainTest {

    static Tractor[] tractors;

    @BeforeAll
    static void setUp() {
        tractors = buildTractors();
    }

    @Test
    public void getMostExpensiveTractor() {
        // when
        Tractor result = TractorMain.getMostExpensiveTractor(tractors);

        // then
        assertThat(result.getPrice()).isEqualTo(2000000);
        assertThat(result.getModel()).isEqualTo("B-150");
    }

    @Test
    public void getNewestTractor() {
        // when
        Tractor result = TractorMain.getNewestTractor(tractors);

        // then
        assertThat(result.getMake()).isEqualTo(LocalDate.parse("2015-09-17"));
        assertThat(result.getModel()).isEqualTo("JD-8825");
    }

    @Test
    public void getTractorsWhichTankSizeIsMoreThan300() {
        // given
        int expectedTankSize = 300;

        // when
        int result = TractorMain.getNumberOfTractorsWhichTankSizeIsMoreThan(tractors, expectedTankSize);

        // then
        assertThat(result).isEqualTo(2);
    }

    @Test
    public void getTractorsWhichModelStartsWithJ() {
        // given
        String expectedText = "M";

        // when
        Tractor result = TractorMain.getTractorWhichModelStartsWith(tractors, expectedText);

        // then
        assertThat(result.getModel()).isEqualTo("MMR-445");
    }

    @Test
    public void shouldReturnEmptyObjectWhenTractorModelStartsWithWildCard() {
        // given
        String expectedText = "*";

        // when
        Tractor result = TractorMain.getTractorWhichModelStartsWith(tractors, expectedText);

        // then
        assertThat(result).isNull();
    }

    private static Tractor[] buildTractors() {
        return new Tractor[]{
                new Tractor("BELARUS", "B-150", 290, LocalDate.of(2002, 5, 15), 2000000),
                new Tractor("FEND", "MF-550", 310, LocalDate.of(1998, 4, 17), 11258),
                new Tractor("JOHN_DEER", "JD-8825", 450, LocalDate.of(2015, 9, 17), 992664),
                new Tractor("FEND", "MMR-445", 300, LocalDate.of(2009, 9, 24), 999877)
        };
    }
}