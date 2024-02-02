package de.olech2412.adapter.dbadapter.model.station.sub;

import de.olech2412.adapter.dbadapter.model.station.Station;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;

/**
 * The address is the address of the station.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "address_city")
    private String city;

    @Column(name = "address_zipcode")
    private String zipcode;

    @Column(name = "address_street")
    private String street;

    @OneToMany(mappedBy = "address", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Station> stations;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return getId() != null && Objects.equals(getId(), address.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}