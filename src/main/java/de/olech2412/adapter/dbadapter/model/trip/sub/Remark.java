package de.olech2412.adapter.dbadapter.model.trip.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Remark {

    @Column(name = "remark_type", length = 2000)
    private String type;
    @Column(name = "remark_code", length = 2000)
    private String code;
    @Column(name = "remark_text", length = 2000)
    private String text;

    @Override
    public String toString() {
        return "Remark{" +
                "type='" + type + '\'' +
                ", code='" + code + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}