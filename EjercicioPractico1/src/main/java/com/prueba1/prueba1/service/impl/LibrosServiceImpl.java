
package com.prueba1.prueba1.service.impl;

import com.prueba1.prueba1.dao.LibrosDao;
import com.prueba1.prueba1.domain.Libros;
import com.prueba1.prueba1.service.LibrosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibrosServiceImpl implements LibrosService{
    
    
    @Autowired//se conecta durectamente con este de abajo
    private LibrosDao listaDao;

    @Override
    @Transactional(readOnly=true)//dimplemente se lee lo que hay en la base de datos
    public List<Libros> getLibros(boolean activos) {
        var lista=listaDao.findAll();//obtenemos todos los objetos de la categoria de la base de datos
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
