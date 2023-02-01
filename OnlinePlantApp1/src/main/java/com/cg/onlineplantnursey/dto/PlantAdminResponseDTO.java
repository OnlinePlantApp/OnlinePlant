package com.cg.onlineplantnursey.dto;



import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlantAdminResponseDTO {
	private int plantId;
	private int plantHeight;
	private String plantSpread; 
	private String commonName; 
	private String bloomTime;
	private String medicinal;
	private int minTemparature;
	private int maxTemperature;
	private String typeOfPlant;
	private String plantDescription;
	private int plantsStock;
	private double plantCost;
	 private String msg;
}
