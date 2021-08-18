package com.unicolor.unicolor.graphql;

import com.unicolor.unicolor.domain.Carro;
import com.unicolor.unicolor.domain.CarroService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarroResolver {

    @Autowired
    private CarroService service;

    public List<Carro> carros(){
        return service.findAll();
    }
}
