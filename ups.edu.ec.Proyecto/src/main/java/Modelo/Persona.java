package Modelo;

public abstract class Persona {
	private String nombre;
    private int identificacion;

    public Persona(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getIdentificacion() {
		return identificacion;
	}



	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}



	public abstract void mostrarInformacion();

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", identificacion=" + identificacion + "]";
	}
	
	
}
