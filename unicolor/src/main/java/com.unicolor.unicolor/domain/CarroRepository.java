package com.unicolor.unicolor.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

    Optional<Carro> findByAno(String ano);

    List<Carro> findCarroByFabricanteAndModelo(String fabricante, String modelo);
}
