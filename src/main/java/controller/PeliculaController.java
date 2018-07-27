package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.gson.Gson;

import model.Pelicula;
import service.ServiceLocator;

@ControllerAdvice
@RequestMapping("/pelicula")
@ResponseBody
@EnableWebMvc
public class PeliculaController extends Controller{

	@RequestMapping(value = "/example", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String prueba() {
		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "funciona");
		return new Gson().toJson(aMap);
	}
	
	@RequestMapping(value = "/nuevo", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String nuevo(@RequestBody Pelicula pelicula) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Pelicula", ServiceLocator.getInstance().getPeliculaService().crearPelicula(pelicula));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/peliculas", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String peliculas() {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Peliculas", ServiceLocator.getInstance().getPeliculaService().getPeliculas());
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/pelicula", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String pelicula(@RequestParam("titulo") String titulo) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Pelicula", ServiceLocator.getInstance().getPeliculaService().getPelicula(titulo));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/modificar", method = RequestMethod.PUT, produces = "application/json", headers = "Accept=application/json")
	public String pelicula(@RequestBody Pelicula pelicula) {
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Pelicula", ServiceLocator.getInstance().getPeliculaService().modificarPelicula(pelicula));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
}
