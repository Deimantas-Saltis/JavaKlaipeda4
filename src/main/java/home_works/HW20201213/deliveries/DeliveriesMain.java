package home_works.HW20201213.deliveries;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class DeliveriesMain {

    public static void main(String[] args) {
        List<Person> persons = buildPersonList();
        List<Company> companies = buildCompanyList();

        Company company = findCompanyWithMostExpensiveGadget(companies);
        System.out.println(company.toString());

        willPeopleGetDeliveries(persons, companies);
        printAllPeopleDeliveries(persons);
    }

    private static Company findCompanyWithMostExpensiveGadget(List<Company> companies) {
        Company companyWithExpensiveGadget = companies.get(0);

        for (Company company : companies) {
            if (companyWithExpensiveGadget.getGadget().getPrice() < company.getGadget().getPrice()) {
                companyWithExpensiveGadget = company;
            }
        }
        return companyWithExpensiveGadget;
    }

    private static void willPeopleGetDeliveries(List<Person> persons, List<Company> companies) {
        for (Person person : persons) {
            for (GadgetType gadgetType : person.getGadgetTypes()) {
                for (Company company : companies) {
                    if (gadgetType.equals(company.getGadget().getGadgetType())) {
                        if (person.getDeliverUntil().isAfter(company.getGadget().getCourier().getDeliveryDate())) {
                            person.setWillGetDeliveries(true);
                        } else {
                            person.setWillGetDeliveries(false);
                            break;
                        }

                    }
                }
            }
        }
    }

    private static void printAllPeopleDeliveries(List<Person> persons) {
        for (Person person : persons) {
            if (person.isWillGetDeliveries()) {
                System.out.println(person.toString());
            }
        }
    }

    private static List<Person> buildPersonList() {
        return Arrays.asList(
                new Person("Antanas", "Seskines g. 12", Arrays.asList(GadgetType.TV), LocalDate.parse("2020-02-20")),
                new Person("Gediminas", "Geliu g. 1", Arrays.asList(GadgetType.PERSONAL_COMPUTER, GadgetType.TV), LocalDate.parse("2020-02-10")),
                new Person("Juozapas", "Geliu g. 64", Arrays.asList(GadgetType.MICRO_CONTROLLER, GadgetType.PHONE, GadgetType.TV), LocalDate.parse("2020-03-30"))
        );
    }

    private static List<Company> buildCompanyList() {
        return Arrays.asList(
                new Company("Kilobaitas", "Varliu g. 121", new Gadget(1202, GadgetType.TV, new Courier("DPD", "Oro uosto g. 64", LocalDate.parse("2020-03-01")))),
                new Company("Varle", "Tigru g. 4", new Gadget(946, GadgetType.PHONE, new Courier("LP", "Express,Giliu g. 101", LocalDate.parse("2020-02-01")))),
                new Company("Pigu", "Pakabu g. 11", new Gadget(4021, GadgetType.PERSONAL_COMPUTER, new Courier("DPD", "Vilniaus g. 14", LocalDate.parse("2020-01-12")))),
                new Company("Brangu", "Driezu g. 16", new Gadget(760, GadgetType.LAPTOP, new Courier("Greitos siuntos", "Kauno g. 94", LocalDate.parse("2020-01-01")))),
                new Company("1a", "Pieniu g. 953", new Gadget(98, GadgetType.MICRO_CONTROLLER, new Courier("Letos siuntos", "Stabdziu g. 50", LocalDate.parse("2020-02-17"))))
        );
    }
}
