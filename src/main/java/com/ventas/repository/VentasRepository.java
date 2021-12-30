package com.ventas.repository;

import com.ventas.Model.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentasRepository extends JpaRepository <Ventas, Integer> {
}
