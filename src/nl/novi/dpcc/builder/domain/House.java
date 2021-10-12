package nl.novi.dpcc.builder.domain;

public class House {
    private final String streetName;
    private final int housenumber;
    private final String houseNumberAddition;
    private final String postalCode;

    //Niet verplicht
    private final String province;
    private final boolean hasGarden;

    public House(String streetName, int housenumber, String houseNumberAddition, String postalCode, String province, boolean hasGarden) {
        this.streetName = streetName;
        this.housenumber = housenumber;
        this.houseNumberAddition = houseNumberAddition;
        this.postalCode = postalCode;
        this.province = province;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "streetName='" + streetName + '\'' +
                ", housenumber=" + housenumber +
                ", houseNumberAddition='" + houseNumberAddition + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", province='" + province + '\'' +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
