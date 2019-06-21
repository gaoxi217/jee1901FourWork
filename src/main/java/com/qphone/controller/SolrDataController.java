package com.qphone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qphone.pojo.SolrData;
import com.qphone.service.ISolrService;

@RestController
public class SolrDataController {
	
	@Autowired
	private ISolrService service;
	
	@GetMapping("/Datas")
	public List<SolrData> getAllDatas(){
		
		return service.getAllData();
	}
}
