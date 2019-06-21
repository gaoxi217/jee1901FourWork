package com.qphone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qphone.dao.ISolrDataDao;
import com.qphone.pojo.SolrData;

@Service
public class SolrServiceImpl implements ISolrService {
	
	
	@Autowired
	private ISolrDataDao solrDataDao;
	
	@Override
	public List<SolrData> getAllData() {
		
		return solrDataDao.getAllData();
	}

}
