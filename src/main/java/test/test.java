package test;

import java.util.List;

import entidades.Mascota;
import modelo.dao.DAOFactory;

public class test {

	public static void main(String[] args) {

		/*
		 * Mascota conan = new Mascota();
		 * 
		 * conan.setEdad(2); conan.setNombreMascota("Rosa");
		 * 
		 * DAOFactory.getFactory().getMascotaDAO().create(conan);
		 */
		
		
		List<Mascota> mascotas = DAOFactory.getFactory().getMascotaDAO().getAll();
		for (Mascota mascota : mascotas) {
			System.out.println(mascota);
		}

	}

}
