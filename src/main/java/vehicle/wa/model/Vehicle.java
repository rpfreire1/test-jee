/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle.wa.model;


import java.io.Serializable;
import javax.persistence.*;


@Entity

public class Vehicle implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  ="VEHICLE_CODE")
    private Integer id;
    
    private String model;
    
    private Integer year;

    public Vehicle() {
    }

    public Vehicle(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", model=" + model + ", year=" + year + '}';
    }
    
    
    
}
