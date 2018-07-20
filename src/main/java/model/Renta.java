package model;

import java.util.Date;

public class Renta {

	private long id;
	private Persona persona;
	private Catalogo catalogo;
	private Date alquiler;
	private Date devolucion;
	private float ganancia;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Persona getPersona() {
		return persona;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public Catalogo getCatalogo() {
		return catalogo;
	}
	
	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}
	
	public Date getAlquiler() {
		return alquiler;
	}
	
	public void setAlquiler(Date alquiler) {
		this.alquiler = alquiler;
	}
	
	public Date getDevolucion() {
		return devolucion;
	}
	
	public void setDevolucion(Date devolucion) {
		this.devolucion = devolucion;
	}
	
	public float getGanancia() {
		return ganancia;
	}
	
	public void setGanancia(float ganancia) {
		this.ganancia = ganancia;
	}
	
}
