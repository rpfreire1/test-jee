package web;

import vehicle.wa.model.VehicleRegistry;
import vehicle.wa.service.VehicleRegistryService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/vehicles")
public class VehicleRegistryServlet extends HttpServlet {
    @Inject
    VehicleRegistryService vehicleRegistryService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<VehicleRegistry> vehicleRegistries=vehicleRegistryService.listVehiclesRegistry();
        System.out.println(vehicleRegistries);
        request.setAttribute("vehicleRegistries", vehicleRegistries);
        request.getRequestDispatcher("/listadovehiculos.jsp").forward(request,response);
    }
}
