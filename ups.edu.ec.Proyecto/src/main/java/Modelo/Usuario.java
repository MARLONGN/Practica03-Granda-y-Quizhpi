package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Usuario extends Persona {
	private String correo;
    private ArrayList<Prestamo> listaPrestamos;

    public Usuario(String nombre, int identificacion, String correo) {
        super(nombre, identificacion);
        this.correo = correo;
        this.listaPrestamos = new ArrayList<>();
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Identificación: " + this.getIdentificacion());
        System.out.println("Correo: " + correo);
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", listaPrestamos=" + listaPrestamos + "]";
	}
    
}
