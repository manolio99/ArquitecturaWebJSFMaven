package com.arquitecturajava.aplicacion.dao.OLDfactoriasAbstractas;

public abstract class DAOAbstractFactory {
	public static DAOFactory getInstance() {
		String tipo = "JPA";
		if (tipo.equals("Hibernate")) {
			return new DAOHibernateFactory();
		} else {
			return new DAOJPAFactory();
		}
	}
}
