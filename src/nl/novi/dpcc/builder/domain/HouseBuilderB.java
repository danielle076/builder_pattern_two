package nl.novi.dpcc.builder.domain;

public class HouseBuilderB {

    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;

    public HouseBuilderB(String streetName, int housenumber, String houseNumberAddition, String postalCode) {
        this.streetName = streetName;
        this.housenumber = housenumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
    }

    public HouseBuilderB province(String province) {
        this.province = province;
        return this;
    }

    public HouseBuilderB hasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }
}
