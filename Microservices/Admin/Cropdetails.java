package com.casestudy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Cropdetails")
public class Cropdetails {
	
	@Id
	private int cropId;
	private String cropName;
	private String cropLocation;
	private int cropQty;
	private String cropType;
	
	public Cropdetails( int cropId, String cropName, String cropLocation, int cropQty,
			String cropType) {
		super();
		this.cropId = cropId;
		this.cropName = cropName;
		this.cropLocation = cropLocation;
		this.cropQty = cropQty;
		this.cropType = cropType;
	}
	
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getCropLocation() {
		return cropLocation;
	}
	public void setCropLocation(String cropLocation) {
		this.cropLocation = cropLocation;
	}
	public double getCropQty() {
		return cropQty;
	}
	public void setCropQty(int cropQty) {
		this.cropQty = cropQty;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	@Override
	public String toString() {
		return "Cropdetails [cropId=" + cropId + ", cropName=" + cropName + ", cropLocation=" + cropLocation +", cropQty="+cropQty+",cropType="+cropType+"]";
}
}

