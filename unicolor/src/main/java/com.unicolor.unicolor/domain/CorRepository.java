package com.unicolor.unicolor.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorRepository extends JpaRepository<Cor, Long> {
}
