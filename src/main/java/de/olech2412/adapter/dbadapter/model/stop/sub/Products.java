package de.olech2412.adapter.dbadapter.model.stop.sub;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.ToString;

/**
 * Products which are available at this stop.
 */
@Data
@Embeddable
@ToString
public class Products {

    @Column(name = "stop_products_nationalExpress")
    private boolean nationalExpress;

    @Column(name = "stop_products_national")
    private boolean national;

    @Column(name = "stop_products_regionalExp")
    private boolean regionalExp;

    @Column(name = "stop_products_regional")
    private boolean regional;

    @Column(name = "stop_products_suburban")
    private boolean suburban;

    @Column(name = "stop_products_bus")
    private boolean bus;

    @Column(name = "stop_products_ferry")
    private boolean ferry;

    @Column(name = "stop_products_subway")
    private boolean subway;

    @Column(name = "stop_products_tram")
    private boolean tram;

    @Column(name = "stop_products_taxi")
    private boolean taxi;
}