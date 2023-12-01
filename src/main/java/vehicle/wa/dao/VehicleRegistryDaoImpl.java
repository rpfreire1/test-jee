package vehicle.wa.dao;

import vehicle.wa.model.VehicleRegistry;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class VehicleRegistryDaoImpl implements VehicleRegistryDao{
    @PersistenceContext(unitName = "VehiclePU")

    EntityManager em;
    @Override
    public List<VehicleRegistry> findAllVehiclesRegistries() {
        return em.createNamedQuery("VehicleRegistry.findAll").getResultList();
    }
    @Override
    public VehicleRegistry insertVehicleRegistry(VehicleRegistry vehicleRegistry) {
        em.persist(vehicleRegistry);
        return vehicleRegistry;
    }
}
