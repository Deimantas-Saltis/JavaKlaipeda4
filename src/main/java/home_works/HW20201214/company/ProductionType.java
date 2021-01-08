package home_works.HW20201214.company;

public enum ProductionType {
    TECHNOLOGIES("technologies"),
    AUTOMOBILES("automobiles"),
    GARDEN_TOOLS("garden tools"),
    FOOD("food");

    private final String productionTypeDescription;

    ProductionType(String productionTypeDescription) {
        this.productionTypeDescription = productionTypeDescription;
    }

    public String getProductionTypeDescription() {
        return this.productionTypeDescription;
    }
}
