package vehicle.wa.dao;

import vehicle.wa.model.VehicleRegistry;

import java.util.Date;
import java.util.List;

public interface VehicleRegistryDao {
    public VehicleRegistry insertVehicleRegistry(VehicleRegistry vehicleRegistry);
    public List<VehicleRegistry>findAllVehiclesRegistries();
    public List<VehicleRegistry>findVehiclesByLastMaintenanceDate(Date lastMaintenanceDate);

}
