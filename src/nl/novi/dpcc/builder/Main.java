package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.House;
import nl.novi.dpcc.builder.domain.HouseBuilderA;
import nl.novi.dpcc.builder.domain.HouseBuilderB;
import nl.novi.dpcc.builder.domain.HouseBuilderC;

public class Main {

    public static void main(String[] args) {
        House houseA = new HouseBuilderA()
                .streetName("Hoofdstraat")
                .housenumber(55)
                .houseNumberAddition("C")
                .postalCode("1234FF")
                .build();
        System.out.println(houseA);

        House houseB = new HouseBuilderB("Hoofdstraat", 55, "C", "1234FF")
                .province("Utrecht")
                .hasGarden(true)
                .build();
        System.out.println(houseB);

        House houseC = new HouseBuilderC()
                .streetName("Hoofdstraat")
                .housenumber(55)
                .houseNumberAddition("C")
                .postalCode("1234FF")
                .hasGarden(true)
                .build();
        System.out.println(houseC);
    }
}
