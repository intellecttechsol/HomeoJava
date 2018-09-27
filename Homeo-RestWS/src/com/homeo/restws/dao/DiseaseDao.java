package com.homeo.restws.dao;

import java.util.Map;

import com.homeo.restws.model.Disease;

public interface DiseaseDao {
	
	Map addDisease(Disease disease);

	Map updateDisease(Disease disease);

	Map retrieveAllDiseases();

	Map retrieveDiseasesByDifferentParameters(Disease disease);
	
	Map retrieveDiseaseByDiseaseName(String diseasename);

	Map deleteDisease(String diseasename);

	Map retrieveDiseasesByGender(String diseasegender);
}
