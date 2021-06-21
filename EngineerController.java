package io.springboot;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EngineerController {
	
	List<Engineers> engineerList=new ArrayList<Engineers>();
	
	@RequestMapping("/engineer")
	public String added(){
		Engineers obj=new Engineers("Ashi", "Java developer", 30.000d);
		Engineers obj1=new Engineers("Abc", "Java developer", 30.000d);
		Engineers obj2=new Engineers("Bhanu", "Java developer", 30.000d);
		Engineers obj3=new Engineers("Hari", "Java developer", 30.000d);
		
		
		engineerList.add(obj);
		engineerList.add(obj1);
		engineerList.add(obj2);
		engineerList.add(obj3);
		return "2021 Engineers get List";
		
	}
	@RequestMapping("/engineer_list")
	public List<Engineers> getDetail(){
		return engineerList;
	}
	@RequestMapping("/get_last_engineer")
	public Engineers getLastAddedEngineer() {
		return engineerList.get(3);
	
	}

}
