package nl.novi.dpcc.builder.domain;

public class HouseBuilderC {

    private String streetName;
    private int housenumber;
    private String houseNumberAddition;
    private String postalCode;

    //Niet verplicht
    private String province;
    private boolean hasGarden;

    public HouseBuilderC streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public HouseBuilderC housenumber(int housenumber) {
        this.housenumber = housenumber;
        return this;
    }

    public HouseBuilderC houseNumberAddition(String houseNumberAddition) {
        this.houseNumberAddition = houseNumberAddition;
        return this;
    }

    public HouseBuilderC postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public HouseBuilderC province(String province) {
        this.province = province;
        return this;
    }

    public HouseBuilderC hasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public House build() {
        if (streetName == null || streetName.equals("") || housenumber == 0 || houseNumberAddition == null || houseNumberAddition.equals("") || postalCode == null || postalCode.equals("") ) {
            throw new IllegalStateException("streetName, housenumber, houseNumberAddition and postalCode must be set");
        }
        return new House(streetName, housenumber, houseNumberAddition, postalCode, province, hasGarden);
    }
}
