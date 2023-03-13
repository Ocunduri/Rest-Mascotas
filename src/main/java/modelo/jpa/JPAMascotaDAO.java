package modelo.jpa;

import java.util.List;

import javax.persistence.Query;

import entidades.Mascota;
import modelo.dao.MascotaDAO;

public class JPAMascotaDAO extends JPAGenericDAO<Mascota, Integer> implements MascotaDAO {

	public JPAMascotaDAO() {
		super(Mascota.class);

	}

	@Override
	public List<Mascota> getAll() {
		String JPQL = "SELECT m FROM Mascota m";
		Query consulta = this.em.createQuery(JPQL);
		@SuppressWarnings("unchecked")
		List<Mascota> mascotas = consulta.getResultList();
		return mascotas;
	}
}
