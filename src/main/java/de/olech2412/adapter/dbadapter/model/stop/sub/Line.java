package de.olech2412.adapter.dbadapter.model.stop.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * Line of the stop.
 */
@Data
@Embeddable
public class Line {
    @Column(name = "stop_line_type", nullable = true)
    private LineType type;
    @Column(name = "stop_line_id", nullable = true)
    private String id;
    @Column(name = "stop_line_fahrtNr", nullable = true)
    private String fahrtNr;
    @Column(name = "stop_line_name", nullable = true)
    private String name;
    @Column(name = "stop_line_public", nullable = true)
    private boolean linePublic;
    @Column(name = "stop_line_productName", nullable = true)
    private String productName;
    @Column(name = "stop_line_mode", nullable = true)
    private Mode mode;
    @Column(name = "stop_line_product", nullable = true)
    private String product;

    @Override
    public String toString() {
        return "Line{" +
                "type=" + type +
                ", id='" + id + '\'' +
                ", fahrtNr='" + fahrtNr + '\'' +
                ", name='" + name + '\'' +
                ", linePublic=" + linePublic +
                ", productName='" + productName + '\'' +
                ", mode=" + mode +
                ", product='" + product + '\'' +
                '}';
    }
}