package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
public class WeatherController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/weather/get")
	public Weather weatherDetails(@RequestParam("city") String cityName )
	{
		
		String query = "SELECT cityId FROM City_Details WHERE city = ?";
		Object[] inputs = new Object[] {cityName};
		String ans = jdbcTemplate.queryForObject(query, inputs, String.class);
		int cityId = Integer.parseInt(ans);
		
		//Monday
		String mquery1 = "SELECT degree FROM Monday WHERE cityId = ?";
		String mquery2 = "SELECT celsius FROM Monday WHERE cityId = ?";
		String mquery3 = "SELECT image FROM Monday WHERE cityId = ?";
		Object[] minputs = new Object[] {cityId};
		String mans1 = jdbcTemplate.queryForObject(mquery1, minputs, String.class);
		String mans2 = jdbcTemplate.queryForObject(mquery2, minputs, String.class);
		String mans3 = jdbcTemplate.queryForObject(mquery3, minputs, String.class);
		
		Monday mon = new Monday(Integer.parseInt(mans1),Integer.parseInt(mans2),mans3);
		
		//Tuesday
		String tquery1 = "SELECT degree FROM Tuesday WHERE cityId = ?";
		String tquery2 = "SELECT celsius FROM Tuesday WHERE cityId = ?";
		String tquery3 = "SELECT image FROM Tuesday WHERE cityId = ?";
		Object[] tinputs = new Object[] {cityId};
		String tans1 = jdbcTemplate.queryForObject(tquery1, tinputs, String.class);
		String tans2 = jdbcTemplate.queryForObject(tquery2, tinputs, String.class);
		String tans3 = jdbcTemplate.queryForObject(tquery3, tinputs, String.class);
		
		Tuesday tue = new Tuesday(Integer.parseInt(tans1),Integer.parseInt(tans2),tans3);
		
		//Wednesday
		String wquery1 = "SELECT degree FROM Wednesday WHERE cityId = ?";
		String wquery2 = "SELECT celsius FROM Wednesday WHERE cityId = ?";
		String wquery3 = "SELECT image FROM Wednesday WHERE cityId = ?";
		Object[] winputs = new Object[] {cityId};
		String wans1 = jdbcTemplate.queryForObject(wquery1, winputs, String.class);
		String wans2 = jdbcTemplate.queryForObject(wquery2, winputs, String.class);
		String wans3 = jdbcTemplate.queryForObject(wquery3, winputs, String.class);
				
		Wednesday wed = new Wednesday(Integer.parseInt(wans1),Integer.parseInt(wans2),wans3);
				
		//Thursday
		String hquery1 = "SELECT degree FROM Thursday WHERE cityId = ?";
		String hquery2 = "SELECT celsius FROM Thursday WHERE cityId = ?";
		String hquery3 = "SELECT image FROM Thursday WHERE cityId = ?";
		Object[] hinputs = new Object[] {cityId};
		String hans1 = jdbcTemplate.queryForObject(hquery1, hinputs, String.class);
		String hans2 = jdbcTemplate.queryForObject(hquery2, hinputs, String.class);
		String hans3 = jdbcTemplate.queryForObject(hquery3, hinputs, String.class);
						
		Thursday thu = new Thursday(Integer.parseInt(hans1),Integer.parseInt(hans2),hans3);	
		
		
		//Friday
		String fquery1 = "SELECT degree FROM Friday WHERE cityId = ?";
		String fquery2 = "SELECT celsius FROM Friday WHERE cityId = ?";
		String fquery3 = "SELECT image FROM Friday WHERE cityId = ?";
		Object[] finputs = new Object[] {cityId};
		String fans1 = jdbcTemplate.queryForObject(fquery1, finputs, String.class);
		String fans2 = jdbcTemplate.queryForObject(fquery2, finputs, String.class);
		String fans3 = jdbcTemplate.queryForObject(fquery3, finputs, String.class);
								
	    Friday fri = new Friday(Integer.parseInt(fans1),Integer.parseInt(fans2),fans3);	
		
	    //Saturday
		String squery1 = "SELECT degree FROM Saturday WHERE cityId = ?";
		String squery2 = "SELECT celsius FROM Saturday WHERE cityId = ?";
		String squery3 = "SELECT image FROM Saturday WHERE cityId = ?";
		Object[] sinputs = new Object[] {cityId};
		String sans1 = jdbcTemplate.queryForObject(squery1, sinputs, String.class);
		String sans2 = jdbcTemplate.queryForObject(squery2, sinputs, String.class);
		String sans3 = jdbcTemplate.queryForObject(squery3, sinputs, String.class);
								
		Saturday sat = new Saturday(Integer.parseInt(sans1),Integer.parseInt(sans2),sans3);	
		
		//Sunday
		String suquery1 = "SELECT degree FROM Sunday WHERE cityId = ?";
		String suquery2 = "SELECT celsius FROM Sunday WHERE cityId = ?";
		String suquery3 = "SELECT image FROM Sunday WHERE cityId = ?";
		Object[] suinputs = new Object[] {cityId};
		String suans1 = jdbcTemplate.queryForObject(suquery1, suinputs, String.class);
		String suans2 = jdbcTemplate.queryForObject(suquery2, suinputs, String.class);
		String suans3 = jdbcTemplate.queryForObject(suquery3, suinputs, String.class);
								
		Sunday sun = new Sunday(Integer.parseInt(suans1),Integer.parseInt(suans2),suans3);	
				
		
	List<Object> cityWeather = jdbcTemplate.query("SELECT * FROM City_Details WHERE city = ?", new Object[] {cityName} ,
			(rs,rowNum)->
		          new Weather(
		        		  rs.getString("city"),
		        		  rs.getString("state"),
		        		  rs.getString("clim"),
		        		  rs.getInt("degh"),
		        		  rs.getInt("degl"),
		        		  rs.getString("img"),
		        		  mon,tue,wed,thu,
		        		  fri,sat,sun));
		
		return cityWeather.size()>0?(Weather) cityWeather.get(0):null;
	}
     
}
