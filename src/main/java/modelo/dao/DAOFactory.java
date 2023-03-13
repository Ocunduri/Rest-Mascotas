package modelo.dao;

import modelo.jpa.JPADAOFactory;

public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JPADAOFactory();
	
	
	
	public static DAOFactory getFactory() {
		return factory;
	}

	public abstract MascotaDAO getMascotaDAO();

	
}
