 package aplica.upn.edu.app.model;

import java.sql.Date;

public class Desaparecido {
	
	private int id_desaparecido;
	private String nombres;
	private String dni;
	private String edad;
	private Date fechaNacimiento;
	private String nacionalidad;
	
	private String apellidos;
	@Override
	public String toString() {
		return "Desaparecido [apellidos=" + apellidos + ", nombres=" + nombres + ", dni=" + dni + ", edad=" + edad
				+ ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", id_desaparecido="
				+ id_desaparecido + "]";
	}
	
	public int getId_desaparecido() {
		return id_desaparecido;
	}
	public void setId_desaparecido(int id_desaparecido) {
		this.id_desaparecido = id_desaparecido;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}	
}