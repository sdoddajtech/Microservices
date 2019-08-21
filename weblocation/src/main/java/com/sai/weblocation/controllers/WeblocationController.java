package com.sai.weblocation.controllers;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sai.weblocation.entities.Weblocation;
import com.sai.weblocation.repos.WeblocationRepository;
import com.sai.weblocation.service.WeblocationService;

@Controller
public class WeblocationController {

	@Autowired
	WeblocationService service;

	@Autowired
	WeblocationRepository repository;

	@Autowired
	ServletContext sc;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createWeblocation";
	}
	
	@RequestMapping("/saveWebloc")
	public String saveWeblocation(@ModelAttribute("weblocation") Weblocation weblocation, ModelMap modelMap) {
		Weblocation weblocationSaved = service.saveWeblocation(weblocation);
		String msg = "Weblocation saved with id: " + weblocationSaved.getId();
		modelMap.addAttribute("msg", msg);
		//emailUtil.sendEmail("springxyzabc@gmail.com", "Location Saved",
				//"Location Saved Successfully and about to return a response");
		return "createWeblocation";
	}
	
	@RequestMapping("/displayWeblocations")
	public String displayWeblocations(ModelMap modelMap) {
		List<Weblocation> weblocations = service.getAllWeblocations();
		modelMap.addAttribute("weblocations", weblocations);
		return "displayWeblocations";
	}

	@RequestMapping("deleteWeblocation")
	public String deleteWeblocation(@RequestParam("id") int id, ModelMap modelMap) {
		// Location location = service.getLocationById(id);
		Weblocation weblocation = new Weblocation();
		weblocation.setId(id);
		service.deleteWeblocation(weblocation);
		List<Weblocation> weblocations = service.getAllWeblocations();
		modelMap.addAttribute("weblocations", weblocations);
		return "displayWeblocations";
	}

	/*@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Weblocation weblocation = service.getWeblocationById(id);
		modelMap.addAttribute("weblocation", weblocation);
		return "updateWeblocation";
	}*/

	@RequestMapping("/updateWebloc")
	public String updateWeblocation(@ModelAttribute("weblocation") Weblocation weblocation, ModelMap modelMap) {
		service.updateWeblocation(weblocation);
		List<Weblocation> weblocations = service.getAllWeblocations();
		modelMap.addAttribute("weblocations", weblocations);
		return "displayWeblocations";
	}

}
