
package com.prueba1.prueba1.dao;

import com.prueba1.prueba1.domain.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LibrosDao extends JpaRepository <Libros,Long> {
    
}
