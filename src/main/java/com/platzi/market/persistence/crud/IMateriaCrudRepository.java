package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Materia;
import org.springframework.data.repository.CrudRepository;

public interface IMateriaCrudRepository extends CrudRepository<Materia,Integer> {
}
