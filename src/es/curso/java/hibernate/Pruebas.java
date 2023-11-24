package es.curso.java.hibernate;

import es.curso.java.hibernate.basics.daos.AlumnoHibernateDAO;

public class Pruebas {
public static void main(String[] args) {
	AlumnoHibernateDAO.cargaInicial();
	AlumnoHibernateDAO.listarAlumnos();
	AlumnoHibernateDAO.buscarPorDni("DNI2");
}
}
