package recurso;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entidades.Mascota;
import modelo.dao.DAOFactory;

@Path("/mascotas")
public class RecursoMascota {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Mascota> getMascotas() {
		return DAOFactory.getFactory().getMascotaDAO().getAll();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Mascota getById(@PathParam("id") int id) {
		return DAOFactory.getFactory().getMascotaDAO().getById(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean crearMascota(Mascota m) {
		boolean flag = true;
		try {
			DAOFactory.getFactory().getMascotaDAO().create(m);
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/update")
	public boolean actualizarMascota(Mascota m) {
		boolean flag = true;
		try {
			DAOFactory.getFactory().getMascotaDAO().update(m);
		} catch (Exception e) {
			flag = false;
		}
		return flag;
	}
	
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/delete/{id}")
	public boolean eliminarMascota(@PathParam("id") int id) {
		boolean bandera = true;
		try {
			DAOFactory.getFactory().getMascotaDAO().deleteById(id);
		} catch (Exception e) {
			bandera = false;
		}
		return bandera;
	}
	
}
