package aplica.upn.edu.app.model;

public class Libro {
	
	private String titulo;
	private String ISBN;
	private String fechaEdicion;
	private String autor;
	private String editorial;
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + ", fechaEdicion=" + fechaEdicion + ", autor=" + autor
				+ ", editorial=" + editorial + "]";
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public String getFechaEdicion() {
		return fechaEdicion;
	}
	public void setFechaEdicion(String fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
}
