package org.soulcodeacademy.helpr.repositories;

import org.soulcodeacademy.helpr.domain.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que a interface é uma repositorio
public interface CargoRepository extends CrudRepository<Cargo, Integer> {

}

// Repository = é um recurso que permite manipular a entidade no banco de dados
// Adicionar entidades, atualizar entidades, remover entidades e listar (CRUD)
// Indicar qual a entidade vai ser gerenciada pelo repository e qual o tipo da PK.
// Obs: O Spring gera uma classe dinâmica com base em nossa interface CargoRepository
//CrudRepository = contem as operacoes basicas de um banco de dados
