package modelo.jpa;

import modelo.dao.DAOFactory;
import modelo.dao.MascotaDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public MascotaDAO getMascotaDAO() {
		return new JPAMascotaDAO();
	}
	
}
