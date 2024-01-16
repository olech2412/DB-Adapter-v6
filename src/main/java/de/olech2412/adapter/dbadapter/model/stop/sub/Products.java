package de.olech2412.adapter.dbadapter.model.stop.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

/**
 * Products which are available at this stop.
 */
@Data
@Embeddable
public class Products {
    @Column(name = "stop_products_nationalExpress", nullable = true)
    private boolean nationalExpress;
    @Column(name = "stop_products_national", nullable = true)
    private boolean national;
    @Column(name = "stop_products_regionalExp", nullable = true)
    private boolean regionalExp;
    @Column(name = "stop_products_regional", nullable = true)
    private boolean regional;
    @Column(name = "stop_products_suburban", nullable = true)
    private boolean suburban;
    @Column(name = "stop_products_bus", nullable = true)
    private boolean bus;
    @Column(name = "stop_products_ferry", nullable = true)
    private boolean ferry;
    @Column(name = "stop_products_subway", nullable = true)
    private boolean subway;
    @Column(name = "stop_products_tram", nullable = true)
    private boolean tram;
    @Column(name = "stop_products_taxi", nullable = true)
    private boolean taxi;

    @Override
    public String toString() {
        return "Products{" +
                "nationalExpress=" + nationalExpress +
                ", national=" + national +
                ", regionalExp=" + regionalExp +
                ", regional=" + regional +
                ", suburban=" + suburban +
                ", bus=" + bus +
                ", ferry=" + ferry +
                ", subway=" + subway +
                ", tram=" + tram +
                ", taxi=" + taxi +
                '}';
    }
}