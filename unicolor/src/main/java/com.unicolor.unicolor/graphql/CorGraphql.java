package com.unicolor.unicolor.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.unicolor.unicolor.domain.Cor;
import com.unicolor.unicolor.domain.CorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CorGraphql implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private CorService corService;

    public Cor cor(Long id){
        return corService.findById(id);
    }

    public List<Cor> cores(){
        return corService.findAll();
    }

    public Cor saveCor(
            Long id,
            String classeCor,
            String descCor,
            String ano,
            Long lazzurilCode,
            Long uniCode,
            String montadora){

        Cor cor = new Cor(id, classeCor, descCor, ano, lazzurilCode, uniCode, montadora);
        return corService.save(cor);
    }

    public Boolean deleteCor(Long id){
        return corService.deleteById(id);
    }
}
