package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * The Szentrale is an organisational unit of Deutsche Bahn that is responsible for the coordination and control of railway operations.
 * The control center is divided into different areas, each with different tasks, such as the operations center, the timetable center, the emergency center, the security center or customer communication.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Szentrale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "szentrale_number")
    private int number;

    @Column(name = "szentrale_public_phone_number")
    private String publicPhoneNumber;

    @Column(name = "szentrale_name")
    private String name;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Szentrale szentrale = (Szentrale) o;
        return getId() != null && Objects.equals(getId(), szentrale.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}