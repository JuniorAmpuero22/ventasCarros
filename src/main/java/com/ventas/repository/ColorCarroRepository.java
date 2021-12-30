package com.ventas.repository;

import com.ventas.Model.ColorCarro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorCarroRepository extends JpaRepository<ColorCarro, Integer> {
}
