package com.utn.ParcialEmilioAmin.Servicios;

import com.utn.ParcialEmilioAmin.Entidades.Localidad;
import com.utn.ParcialEmilioAmin.Repositorios.BaseRepository;
import com.utn.ParcialEmilioAmin.Repositorios.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService{
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}

