package dto;

import com.google.gson.annotations.Expose;
import model.Persona;

public class PersonaDTO {
	
	private long id;
	@Expose
	private int dni;
	@Expose
	private String nombre;
	@Expose
	private Long telefono;
	@Expose
	private String mail;
	@Expose
	private String direccion;
	
	public PersonaDTO(Persona persona) {
		super();
		this.id = persona.getId();
		this.dni = persona.getDni();
		this.nombre = persona.getNombre();
		this.telefono = persona.getTelefono();
		this.mail = persona.getMail();
		this.direccion = persona.getDireccion();
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public int getDni() {
		return dni;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Long getTelefono() {
		return telefono;
	}
	
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
