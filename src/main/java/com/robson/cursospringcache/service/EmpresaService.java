package com.robson.cursospringcache.service;

import com.robson.cursospringcache.entity.Empresa;
import com.robson.cursospringcache.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    //FindAllComCache
    @Cacheable("empresas")
    public List<Empresa> findAllComCache() {
        return (List<Empresa>) empresaRepository.findAll();
    }

    public List<Empresa> findAll(){
        return (List<Empresa>) empresaRepository.findAll();
    }
}
