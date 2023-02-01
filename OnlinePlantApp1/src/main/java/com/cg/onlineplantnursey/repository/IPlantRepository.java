package com.cg.onlineplantnursey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.cg.onlineplantnursey.entity.Plant;
@Repository
public interface IPlantRepository extends JpaRepositoryImplementation<Plant,Integer> {

	List<Plant> getAllPlantsByTypeOfPlants(String typeOfPlants);

	List<Plant> getPlantByCommonName(String commonName);
	
}