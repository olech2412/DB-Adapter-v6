package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * The address is the address of the station.
 */
@Data
@Embeddable
public class Address {
    @Column(name = "address_city", nullable = true)
    private String city;
    @Column(name = "address_zipcode", nullable = true)
    private String zipcode;
    @Column(name = "address_street", nullable = true)
    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}