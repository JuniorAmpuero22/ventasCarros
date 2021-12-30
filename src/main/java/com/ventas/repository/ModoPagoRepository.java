package com.ventas.repository;

import com.ventas.Model.ModoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModoPagoRepository extends JpaRepository<ModoPago, Integer> {
}
