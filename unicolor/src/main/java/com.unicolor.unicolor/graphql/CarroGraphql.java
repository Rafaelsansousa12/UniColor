package com.unicolor.unicolor.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.unicolor.unicolor.domain.Carro;
import com.unicolor.unicolor.domain.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarroGraphql implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private CarroService carroService;

    public Carro carro(Long id){
        return carroService.findById(id);
    }

    public List<Carro> carros(){
        return carroService.findAll();
    }

    public Carro saveCarro(
            Long id,
            String modelo,
            String fabricante,
            String ano,
            Long codigo,
            Long corId){

        Carro carro = new Carro(id, modelo, fabricante, ano, codigo, corId);
        return carroService.save(carro);
    }

    public Boolean deleteCarro(Long id){
        return carroService.deleteById(id);
    }
}
