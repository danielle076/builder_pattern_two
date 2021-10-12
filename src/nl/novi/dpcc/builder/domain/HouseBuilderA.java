package nl.novi.dpcc.builder.domain;

public class HouseBuilderA {

    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;

    public HouseBuilderA streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public HouseBuilderA housenumber(int housenumber) {
        this.housenumber = housenumber;
        return this;
    }

    public HouseBuilderA houseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilderA postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilderA province(String province) {
        this.province = province;
        return this;
    }

    public HouseBuilderA hasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }
}
