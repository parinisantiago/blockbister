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

import model.Renta;
import service.ServiceLocator;

@ControllerAdvice
@RequestMapping("/renta")
@ResponseBody
@EnableWebMvc
public class RentaController extends Controller{
	
	@RequestMapping(value = "/example", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String prueba() {
		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "funciona");
		return new Gson().toJson(aMap);
	}
	
	@RequestMapping(value = "/renta", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String renta(@RequestParam("id") String id) {
		
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Renta", ServiceLocator.getInstance().getRentaService().getRenta(id));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(NoSuchElementException e){
			this.aMap = new HashMap<String,Object>();
			this.aMap.put("error", "No existe una renta registrada con ese id");
			return this.getGson().toJson(this.aMap);
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
	@RequestMapping(value = "/rentar", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String rentar(@RequestBody Renta renta) {
		
		try {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("Renta", ServiceLocator.getInstance().getRentaService().nuevo(renta));
			this.json =  this.getGson().toJson(this.aMap);	
		}catch(Exception e) {
			this.aMap = new HashMap<String, Object>();
			this.aMap.put("error", e.getMessage());
			return this.getGson().toJson(this.aMap);
		}
		
		return this.json;
	}
	
}
