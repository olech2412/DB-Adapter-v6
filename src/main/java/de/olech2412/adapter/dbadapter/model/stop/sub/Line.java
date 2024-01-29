package de.olech2412.adapter.dbadapter.model.stop.sub;

import com.google.gson.annotations.SerializedName;
import de.olech2412.adapter.dbadapter.model.station.sub.Operator;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Line of the stop.
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SerializedName("line_id") // for gson because clash with lineId
    private Long id;

    @Column(name = "stop_line_type")
    private String type;

    @Column(name = "stop_line_id", unique = true)
    @SerializedName("id") // for gson because clash with id
    private String lineId;

    @Column(name = "stop_line_fahrtNr")
    private String fahrtNr;

    @Column(name = "stop_line_name")
    private String name;

    @Column(name = "stop_line_public")
    private boolean linePublic;

    @Column(name = "stop_line_productName")
    private String productName;

    @Column(name = "stop_line_mode")
    private Mode mode;

    @Column(name = "stop_line_product")
    private String product;

    @OneToOne(cascade = CascadeType.ALL)
    private Operator operator;

    private LocalDateTime createdAt = LocalDateTime.now();

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return getId() != null && Objects.equals(getId(), line.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}