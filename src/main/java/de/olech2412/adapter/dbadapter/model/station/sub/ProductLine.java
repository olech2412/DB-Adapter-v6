package de.olech2412.adapter.dbadapter.model.station.sub;

import de.olech2412.adapter.dbadapter.model.station.Station;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class ProductLine {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String productLine;

    private String segment;

    @OneToMany(mappedBy = "productLine", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Station> stations;


    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}