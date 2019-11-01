package com.example.medicamentsBoot;



import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface MedicamentRepository extends CrudRepository<Medicament,Long> {

	List<Medicament> findByName(String name);
}
