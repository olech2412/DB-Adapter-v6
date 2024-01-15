package de.olech2412.adapter.dbadapter.model.stop;

import de.olech2412.adapter.dbadapter.model.stop.sub.Line;
import de.olech2412.adapter.dbadapter.model.stop.sub.Location;
import de.olech2412.adapter.dbadapter.model.stop.sub.Products;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "stops")
public class Stop {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;
    @Column(name = "stop_type", nullable = true)
    private String type;
    @Column(name = "stop_id", nullable = true)
    private String id;
    @Column(name = "stop_name", nullable = true)
    private String name;
    @Embedded
    private Location location;
    @Embedded
    private Products products;
    @ElementCollection
    @AttributeOverrides({
            @AttributeOverride(name = "type", column = @Column(name = "entrance_location_type")),
            @AttributeOverride(name = "id", column = @Column(name = "entrance_location_id", insertable = false, updatable = false)),
            @AttributeOverride(name = "latitude", column = @Column(name = "entrance_location_latitude")),
            @AttributeOverride(name = "longitude", column = @Column(name = "entrance_location_longitude"))
    })
    private List<Location> entrances = new ArrayList<>();
    @ElementCollection
    private List<Line> lines = new ArrayList<>();

    private LocalDateTime createdAt = LocalDateTime.now();

    @Override
    public String toString() {
        return "Stop{" +
                "uuid=" + uuid +
                ", type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", products=" + products +
                ", entrances=" + entrances +
                ", lines=" + lines +
                ", createdAt=" + createdAt +
                '}';
    }
}