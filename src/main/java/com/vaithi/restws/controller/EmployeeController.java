package com.vaithi.restws.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vaithi.restws.model.ChildList;
import com.vaithi.restws.model.Employee;
import com.vaithi.restws.model.Families;
import com.vaithi.restws.model.Family;
import com.vaithi.restws.model.House;
import com.vaithi.restws.model.RemainingChildList;
import com.vaithi.restws.model.hobbies;

@RestController
public class EmployeeController {
	
	private static final Logger LOGGER = LoggerFactory
			.getLogger(EmployeeController.class);
	

	@RequestMapping("/getEmployee")
	public List<Employee> getEmployee(@ModelAttribute Employee empObj){
		

/*		List<hobbies> hobbiesList=new ArrayList<hobbies>();
		hobbiesList.add(new hobbies(1,"cricket"));
		hobbiesList.add(new hobbies(2,"hockey"));
		
		List<hobbies> hobbiesList1=new ArrayList<hobbies>();
		hobbiesList1.add(new hobbies(3,"football"));*/
		
		hobbies h=new hobbies(1,"cricket"); 
		
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(empObj.getId(),empObj.getName(),empObj.getEmail(),h));
        employeesList.add(new Employee(101,"lokesh","howtodoinjava@gmail.com",h));       
        employeesList.add(new Employee(102,"vaidy","vaidy@gmail.com",h));
		//System.out.println("Values from login  are :: "+ empObj.toString());
		//LOGGER.info("Values from login  are :: "+ empObj.toString());	        
        
/*        RestTemplate restTemplate = new RestTemplate();
        House house = restTemplate.getForObject("http://localhost:8080/getHouse", House.class);
        System.out.println("Values:: "+ house.toString());*/
        
        try {

        	URL url = new URL("http://localhost:8080/getHouse");
        	HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        	conn.setDoOutput(true);
        	conn.setRequestMethod("GET");
        	conn.setRequestProperty("Content-Type", "application/json");
        	int statusCode = conn.getResponseCode();
        	System.out.println("code :;" + statusCode);
        	BufferedReader in;

        	in = new BufferedReader(new InputStreamReader(
        	conn.getInputStream()));

        	ObjectMapper mapper = new ObjectMapper();
        	String output;
        	while ((output = in.readLine()) != null) {
        	System.out.println(output);
        	House ho=new House();
        	ho=mapper.readValue(output,House.class);
        	
        	System.out.println("house values:: " + ho.toString());
        	}
        	} catch (IOException e) {
        	e.printStackTrace();
        	}  catch(Exception e) {
        		e.printStackTrace();
        	}
        
        return employeesList;	
	}
	
	@RequestMapping("/getHouse")
	public House getHouse(){
		
		List childIdListRavi=new ArrayList();
		childIdListRavi.add("Harish");
		childIdListRavi.add("Akshara");
		ChildList childListRavi=new ChildList();
		childListRavi.setChildID(childIdListRavi);
		
		List childIdListVaithi=new ArrayList();
		childIdListVaithi.add("Varsha");
		ChildList childListVaithi=new ChildList();
		childListVaithi.setChildID(childIdListVaithi);		
		
		Family RaviFamily=new Family(101,childListRavi);
		Family VaithiFamily=new Family(102,childListVaithi);
		
		List<Family> familyList=new ArrayList<Family>();
		familyList.add(RaviFamily);
		familyList.add(VaithiFamily);
		
		Families families=new Families(familyList);
		
		List childIdListRemain=new ArrayList();
		childIdListRemain.add("Revathi");
		childIdListRemain.add("Aishu");
		RemainingChildList remainChildList=new RemainingChildList();
		remainChildList.setChildID(childIdListRemain);	
		
		House house=new House("Sri Ram Krupa","Chennai",families,remainChildList);
		return house;	
	}
	

}
