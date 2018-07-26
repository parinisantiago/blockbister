package dto;

import java.util.Date;

import com.google.gson.annotations.Expose;

import model.Renta;

public class RentaDTO {

	private long id;
	@Expose
	private PersonaDTO	 persona;
	@Expose
	private CatalogoDTO catalogo;
	@Expose
	private Date alquiler;
	@Expose
	private Date devolucion;
	@Expose
	private float ganancia;
	
	public RentaDTO(Renta renta) {
		this.id = renta.getId();
		this.persona = new PersonaDTO(renta.getPersona());
		this.catalogo = new CatalogoDTO(renta.getCatalogo());
		this.alquiler = renta.getAlquiler();
		this.devolucion = renta.getDevolucion();
		this.ganancia = renta.getGanancia();
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public PersonaDTO getPersona() {
		return persona;
	}
	
	public void setPersona(PersonaDTO persona) {
		this.persona = persona;
	}
	
	public CatalogoDTO getCatalogo() {
		return catalogo;
	}
	
	public void setCatalogo(CatalogoDTO catalogo) {
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
