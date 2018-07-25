package model;


public class Persona {

	
	private long id;
	
	private int dni;
	
	private String nombre;
	
	private int telefono;
	
	private String mail;
	
	private String direccion;
	
	public Persona(int dni, String nombre, int telefono, String mail, String direccion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.mail = mail;
		this.direccion = direccion;
	}
	
	public Persona() {
		super();
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void modificar(String persona){
		this.nombe = persona.getNombre();
		this.mail = persona.getMail();
		this.telefono = persona.getTelefono();
		this.direccion = persona.getDireccion();
		this.dni = persona.getDni();
	}
}
