package dev.java10x.CadastroDeNinjas.missoes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> { // ORM esta escaneando a Entidade (Long precisa colocar, é o tipo do ID que está no missoes Model)
}
