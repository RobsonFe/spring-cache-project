package com.robson.cursospringcache.repository;

import com.robson.cursospringcache.entity.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
}
