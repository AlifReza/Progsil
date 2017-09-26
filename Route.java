package com.smk.bi.ticketing.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * // TODO Comment
 */
// Nama M.Alif Reza.R
// NIS 16101072
@Entity
@Table(name = "Route")
public class Route {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long routedId;
    private String routeName;
    private String isValid;

    public Long getRoutedId() {
        return routedId;
    }

    public void setRoutedId(Long routedId) {
        this.routedId = routedId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}
