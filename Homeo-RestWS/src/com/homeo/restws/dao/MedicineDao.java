package com.homeo.restws.dao;

import java.util.Map;

import com.homeo.restws.model.Medicine;

public interface MedicineDao {
	
	Map addMedicine(Medicine medicine);

	Map retrieveMedicineByCode(String medcode);

	Map retrieveMedicinesByComp(String medcompname);

	Map updateMedicine(Medicine medicine);

	Map retrieveAllMedicines();

	Map retrieveMedicinesByDifferentParameters(Medicine medicine);
	
	Map retrieveMedicineByMedName(String medname);

	Map deleteMedicine(String medcode);

}
