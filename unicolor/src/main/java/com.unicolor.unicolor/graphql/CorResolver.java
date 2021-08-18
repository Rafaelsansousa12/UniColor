package com.unicolor.unicolor.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.unicolor.unicolor.domain.Cor;
import com.unicolor.unicolor.domain.CorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CorResolver implements GraphQLResolver<Cor>  {

    @Autowired
    private CorService service;

    public List<Cor> cores(){
        return service.findAll();
    }
}
