package com.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.solicitudes;
import com.crud.repository.solicitudesRepository;

@Service
public class solicitudesService {
	
	@Autowired
    private solicitudesRepository repository;
	
	
	
	public List<solicitud> list() {
        Iterable<solicitud> solicitud = repository.findAll();
        List< solicitud> list = new ArrayList< solicitud>();
        solicitud.forEach(list::add);
        return list;
    }
	
	 public solicitud create(solicitud solicitud) {
	        return repository.save(solicitud);
	    }

}
