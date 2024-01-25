package de.olech2412.adapter.dbadapter.model.stop;

import de.olech2412.adapter.dbadapter.model.stop.sub.Location;
import de.olech2412.adapter.dbadapter.model.stop.sub.Products;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * A stop represents a public transport station.
 */
@Data
@Entity
@Table(name = "stops")
public class Stop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "stop_type", nullable = true)
    private String type;

    @Column(name = "stop_id", nullable = true)
    private String stopId;

    @Column(name = "stop_name", nullable = true)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Location location;

    @Embedded
    private Products products;

    private LocalDateTime createdAt = LocalDateTime.now();

    @Override
    public String toString() {
        return "Stop{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", id='" + stopId + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", products=" + products +
                ", createdAt=" + createdAt +
                '}';
    }
}