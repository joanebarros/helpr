package org.soulcodeacademy.helpr.services;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.soulcodeacademy.helpr.repositories.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Indica para o Spring que esta classe sera gerenciada por ele
public class PopulateService {
    @Autowired // Injeta o objeto direto da classe
    private CargoRepository CargoRepository;

    public void populate() {
        // Integer idCargo, String nome, String descriação, Double salario
        Cargo c1 = new Cargo(null,"Diretor Geral","Gerencia Empresa",30000.0);
        Cargo c2 = new Cargo(null,"Diretor do Setor","Gerencia Setor",18000.0);
        Cargo c3 = new Cargo(null,"Tecnico Geral","Resolve os chamados",12000.0);
        // vamos persistir as entidades = salvar no banco
        this.CargoRepository.save(c1);
        this.CargoRepository.save(c2);
        this.CargoRepository.save(c3);

    }
}

// O objetivo desta classe é inserir no banco, dados fictícios (de teste)
// IOC = Inversion of Control = Inversão de Controle = É ele quem manda nas instâncias
// Container = é o local onde o Spring guarda os objetos anotados
// @Service = indica que a classe é um serviço
// Injeção de Dependências = quando o Spring injeta os objetos na classe
