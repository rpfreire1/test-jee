/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle.wa.web;

/**
 *
 * @author Bobby
 */
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.apache.logging.log4j.*;
import org.primefaces.event.RowEditEvent;
import vehicle.wa.model.VehicleRegistry;
import vehicle.wa.service.VehicleRegistryService;

@Named("VehicleRegistryBean")
@RequestScoped
public class VehicleRegistryBean {
    Logger log = LogManager.getRootLogger();
    @Inject
    private VehicleRegistryService vehicleRegistryService;
    
    private VehicleRegistry  vehicleRegistrySelected;
    List<VehicleRegistry> vehiclesRegistrys;
    public VehicleRegistryBean(){
        log.debug("Starting bean");
    }
    @PostConstruct
    public void startBean(){
        this.vehiclesRegistrys=vehicleRegistryService.listVehiclesRegistry();
        log.debug(" "+this.vehiclesRegistrys);
        this.vehicleRegistrySelected=new VehicleRegistry();
    }
    public List<VehicleRegistry> getVehicles(){
        return vehiclesRegistrys;
    }
    public void reiniciarPersonaSeleccionada(){
        this.vehicleRegistrySelected = new VehicleRegistry();
    }
    
    
    
}
