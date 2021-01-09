package home_works.HW20201213.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompanyAndDeviceMain {

    public static void main(String[] args) {
        List<Company> companies = buildCompanyList();

        System.out.println("Brangiausia prekė: " + findMostExpensiveDevice(companies));
        findTechnologyCompanies(companies);
    }

    private static String findMostExpensiveDevice(List<Company> companies) {
        Device mostExpensiveDevice = companies.get(0).getDevices().get(0);
        for (Company company : companies) {
            for (Device device : company.getDevices()) {
                if (mostExpensiveDevice.getPrice() < device.getPrice()) {
                    mostExpensiveDevice = device;
                }
            }
        }
        return mostExpensiveDevice.toString();
    }

    private static void findTechnologyCompanies(List<Company> companies) {
        List<String> technologyCompanies = new ArrayList<>();
        for (Company company : companies) {
            if (company.getProductionType() == ProductionType.TECHNOLOGIES) {
                technologyCompanies.add(company.toString());
            }
        }
        printResults(technologyCompanies);
    }

    private static void printResults(List<String> techCompanies) {
        for (String company : techCompanies) {
            System.out.println(company);
        }
    }

    private static List<Company> buildCompanyList() {
        return Arrays.asList(
                new Company("Maxima", "Ukmerges g. 256, Vilnius", ProductionType.FOOD, Arrays.asList(
                        new Device("Varske", 2.43, 14, "pusriebe varske"),
                        new Device("Duona", 1.12, 31, "sviesi duona")
                )),
                new Company("Volkswagen", "Gatvagen g. 12, Germany", ProductionType.AUTOMOBILES, Arrays.asList(
                        new Device("Golf", 23543.00, 433112, "kompaktiskas automobilis"),
                        new Device("Arteon", 35553.31, 234132, "sportiskas automobilis"),
                        new Device("Tuareg", 55.889, 42342424, "visureigis")
                )),
                new Company("Logitech", "Laisves pr. 1, Kaunas", ProductionType.TECHNOLOGIES, Arrays.asList(
                        new Device("G07", 123, 412321, "zaidimu pele"),
                        new Device("MX15", 43.11, 3423212, "zaidimu pele")
                )),
                new Company("Senukai", "Zirmunu g. 54, Vilnius", ProductionType.GARDEN_TOOLS, Arrays.asList(
                        new Device("Bosh", 45.99, 4432, "kampinis slifuoklis"),
                        new Device("Makita", 283.41, 15512, "drele")
                )),
                new Company("Steelseries", "Street st. 9882, Stockholm", ProductionType.TECHNOLOGIES, Arrays.asList(
                        new Device("Xai", 250, 11321, "zaidimu pele"),
                        new Device("Sensei", 410.31, 2512, "zaidimu pele")
                ))
        );
    }
}
