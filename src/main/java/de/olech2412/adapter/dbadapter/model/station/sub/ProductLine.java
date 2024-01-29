package de.olech2412.adapter.dbadapter.model.station.sub;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class ProductLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String productLine;

    private String segment;

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}