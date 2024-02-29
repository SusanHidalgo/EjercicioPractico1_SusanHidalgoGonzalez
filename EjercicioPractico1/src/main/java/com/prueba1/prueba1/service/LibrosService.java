
package com.prueba1.prueba1.service;

import com.prueba1.prueba1.domain.Libros;
import java.util.List;

public interface LibrosService {
    // Se obtiene un listado de categorias en un List
    public List<Libros> getLibros(boolean activos);
 
}
