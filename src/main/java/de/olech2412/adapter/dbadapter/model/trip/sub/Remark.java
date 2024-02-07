package de.olech2412.adapter.dbadapter.model.trip.sub;

import de.olech2412.adapter.dbadapter.model.trip.Trip;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "Remark", indexes = {
        @Index(name = "idx_remark_remark_text", columnList = "remark_text"),
        @Index(name = "idx_remark_id", columnList = "id"),
        @Index(name = "idx_remark_remark_type", columnList = "remark_type")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uc_remark_remark_text", columnNames = {"remark_text"})
})
public class Remark {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "remark_type", length = 2000)
    private String type;


    @Column(name = "remark_code", length = 2000)
    private String code;

    @Column(name = "remark_text", length = 2000, unique = true)
    private String text;

    @ManyToMany(mappedBy = "remarks")
    private List<Trip> trips = new ArrayList<>();

    private LocalDateTime createdAt = LocalDateTime.now();

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Remark remark = (Remark) o;
        return getId() != null && Objects.equals(getId(), remark.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}