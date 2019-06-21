package com.qphone.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class SolrData implements Serializable{
	
	private String id;
	private String title;
	private long price;
	private String sellPoint;
	private String image;
	private String catName;
	private String itemDesc;
	
	private String test;

}
