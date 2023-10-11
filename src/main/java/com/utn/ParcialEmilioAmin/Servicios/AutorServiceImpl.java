package com.utn.ParcialEmilioAmin.Servicios;

import com.utn.ParcialEmilioAmin.Entidades.Autor;
import com.utn.ParcialEmilioAmin.Repositorios.AutorRepository;
import com.utn.ParcialEmilioAmin.Repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
