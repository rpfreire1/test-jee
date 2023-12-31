package vehicle.wa.service;

import vehicle.wa.model.VehicleRegistry;

import javax.ejb.Local;
import java.util.Date;
import java.util.List;

@Local
public interface VehicleRegistryService {
    public List<VehicleRegistry> listVehiclesRegistry();
    public VehicleRegistry createVehicleRegistry(VehicleRegistry vehicleRegistry);

    public List<VehicleRegistry> maintenanceVehicles(Date dateLastMaintenance);

}
