package com.Plash.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Plash.DAO.Dao;
import com.Plash.POJO.Pojo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	Dao dao;
	
	
	

	@RequestMapping(value = "/saveText",method=RequestMethod.POST)
	public @ResponseBody void saveText(HttpServletRequest request,@RequestBody String str) {

		
		System.out.println(str);
		
		Pojo pojoBean=new Pojo();
		System.out.println(str);
		pojoBean.setText(str);
		dao.insertData(pojoBean);

	}

	@RequestMapping(value="/getRecords",method=RequestMethod.GET)
	public @ResponseBody String getAllRecords() {
		Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation()
				.create();
		String json = gson.toJson(dao.getAllRecords());
		return json;
	}

}
