package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * The Szentrale is an organisational unit of Deutsche Bahn that is responsible for the coordination and control of railway operations.
 * The control center is divided into different areas, each with different tasks, such as the operations center, the timetable center, the emergency center, the security center or customer communication.
 */
@Data
@Embeddable
public class Szentrale {
    @Column(name = "szentrale_number", nullable = true)
    private int number;
    @Column(name = "szentrale_public_phone_number", nullable = true)
    private String publicPhoneNumber;
    @Column(name = "szentrale_name", nullable = true)
    private String name;

    @Override
    public String toString() {
        return "Szentrale{" +
                "number=" + number +
                ", publicPhoneNumber='" + publicPhoneNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}