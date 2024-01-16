package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * Office of the station.
 */
@Data
@Embeddable
public class TimeTableOffice {
    @Column(name = "timetableoffice_email", nullable = true)
    private String email;
    @Column(name = "timetableoffice_name", nullable = true)
    private String name;

    @Override
    public String toString() {
        return "TimeTableOffice{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}