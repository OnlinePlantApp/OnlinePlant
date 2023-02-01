package com.cg.onlineplantnursey.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.cg.onlineplantnursey.entity.Plant;
import com.cg.onlineplantnursey.exceptions.PlantIdNotFoundException;
@Service
public interface IPlantService {
	
	Plant addPlant(Plant plant)throws PlantIdNotFoundException;

	Plant updatePlant(int plantId)throws PlantIdNotFoundException;

	Plant deletePlant(Plant plant)throws PlantIdNotFoundException;

	Plant viewPlant(int plantId)throws PlantIdNotFoundException;

	List<Plant> viewPlant(String commonName)throws PlantIdNotFoundException;

	List<Plant> viewAllPlants()throws PlantIdNotFoundException;

	List<Plant> getAllPlantByTypeOfPlants(String typeOfPlant)throws PlantIdNotFoundException;
	 
	
//	 public Plant updatePlant(int plantId) throws PlantIdNotFoundException;
//	 public Plant deletePlant(Plant plant) throws PlantIdNotFoundException;
//	 public Plant viewPlant(int plantId) throws PlantIdNotFoundException;
//	 public List<Plant> viewAllPlants() throws PlantIdNotFoundException;
//     public List<Plant> getPlantByCommonName(String commonName) throws PlantIdNotFoundException;
//     public List<Plant> getAllPlantByTypeOfPlants(String typeOfPlants) throws PlantIdNotFoundException;
//     public Plant registerPlant(Plant plant);
}