
package com.prueba1.prueba1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="libros")
public class Libros implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Libros")
    private String id;
    private Long titulo;
    private String autor;
    private String precio;
    private String categoria;
    private boolean activo;
    
     public Libros(){
}

    public Libros(String id, Long titulo, String autor, String precio, String categoria, boolean activo) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.categoria = categoria;
        this.activo = activo;
    }

    public boolean isActivo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
