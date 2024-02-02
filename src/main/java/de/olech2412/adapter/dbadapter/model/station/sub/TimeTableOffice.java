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
 * Office of the station.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class TimeTableOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "timetableoffice_email")
    private String email;

    @Column(name = "timetableoffice_name")
    private String name;

    @OneToMany(mappedBy = "timeTableOffice", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Station> stations;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeTableOffice that = (TimeTableOffice) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}