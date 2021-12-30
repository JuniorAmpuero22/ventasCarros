package com.ventas.repository;

import com.ventas.Model.Descuentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescuentosRepository extends JpaRepository<Descuentos, Integer> {
}
