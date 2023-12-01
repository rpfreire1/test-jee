package vehicle.wa.service;

import vehicle.wa.dao.VehicleRegistryDao;
import vehicle.wa.model.VehicleRegistry;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class VehicleRegistryServiceImpl implements VehicleRegistryService{

    @Inject
    private VehicleRegistryDao vehicleRegistryDao;
    @Override
    public List<VehicleRegistry> listVehiclesRegistry() {
        return vehicleRegistryDao.findAllVehiclesRegistries();
    }

    @Override
    public VehicleRegistry createVehicleRegistry(VehicleRegistry vehicleRegistry) {
        return vehicleRegistryDao.insertVehicleRegistry(vehicleRegistry);
    }
}
