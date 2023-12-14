package com.generation.gamestore.repository;

import com.generation.gamestore.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);

    public List<Categoria> findAllByMarcaContainingIgnoreCase(@Param("marca") String marca);

}
