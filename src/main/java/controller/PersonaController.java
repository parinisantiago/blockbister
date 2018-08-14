package controller;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.gson.Gson;

import model.Persona;
import service.ServiceLocator;

@ControllerAdvice
@RequestMapping("/persona")
@ResponseBody
@EnableWebMvc
public class PersonaController extends Controller{
	
	@RequestMapping(value = "/example", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String prueba() {
		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "funciona");
		return new Gson().toJson(aMap);
	}
	
	@RequestMapping(value = "/persona", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String persona(@RequestParam("dni") String dni) {
		
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Persona", ServiceLocator.getInstance().getPersonaService().getPersona(dni));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(NoSuchElementException e){
			this.aMap = new HashMap<String,Object>();
			this.aMap.put("error", "No existe una persona registrada con ese dni");
			return this.getGson().toJson(this.aMap);
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	
	}
	
	@RequestMapping(value = "/nuevo", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String nueva(@RequestBody Persona persona) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Persona", ServiceLocator.getInstance().getPersonaService().crearPersona(persona));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT, produces = "application/json", headers = "Accept=application/json")
	public String cambiar(@RequestBody Persona persona) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Persona", ServiceLocator.getInstance().getPersonaService().modificarPersona(persona));
			this.json =  this.getGson().toJson(this.aMap);
		}catch(NoSuchElementException e){
			this.aMap = new HashMap<String,Object>();
			this.aMap.put("error", "No existe una persona registrada con ese dni");
			return this.getGson().toJson(this.aMap);
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/personas", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String personas() {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Personas", ServiceLocator.getInstance().getPersonaService().getPersonas());
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/borrar", method = RequestMethod.DELETE, produces = "application/json", headers = "Accept=application/json")
	public String borrar(@RequestBody Persona persona) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Personas", ServiceLocator.getInstance().getPersonaService().borrarPersona(persona.getDni()));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
}
