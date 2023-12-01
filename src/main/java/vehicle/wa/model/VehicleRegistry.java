/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle.wa.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "vehicle_register")
public class VehicleRegistry implements Serializable  {
     private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "VREG_CODE")
    private Integer id;
    
    private Date purchasedDate;
    private String comments;
    private Date lastMaintenanceDate;
    @ManyToOne(
            cascade = CascadeType.ALL, fetch = FetchType.LAZY
    )
    private Vehicle vehicle;

    public VehicleRegistry() {
    }

    public VehicleRegistry(Integer id, Date purchasedDate, String comments, Date lastMaintenanceDate, Vehicle vehicle) {
        this.id = id;
        this.purchasedDate = purchasedDate;
        this.comments = comments;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.vehicle = vehicle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Date purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "VehicleRegistry{" +
                "id=" + id +
                ", purchasedDate=" + purchasedDate +
                ", comments='" + comments + '\'' +
                ", lastMaintenanceDate=" + lastMaintenanceDate +
                ", vehicle=" + vehicle +
                '}';
    }
}
