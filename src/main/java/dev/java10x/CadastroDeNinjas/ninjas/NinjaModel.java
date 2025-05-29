package dev.java10x.CadastroDeNinjas.ninjas;

import dev.java10x.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//ENTITY transforma uma classe em uma entidade do banco de dados
@Entity //essa anotacao cria uma tabela com todos os atributos dessa classe
@Table (name = "tb_cadastro")
@Data //annotation do LOMBOK, cria getters and setters
@NoArgsConstructor //annotation da biblioteca LOMBOK (cria contrutor automatico sem argumentos)
@AllArgsConstructor //annotation da biblioteca LOMBOK (cria contrutor automatico com argumentos)


public class NinjaModel {

    @Id //essa anotacao indica que o proximo atributo (private long id) é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // essa anotacao indica que o id seguira uma numeracao sequencial
    private long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne //@ManyToOne = um ninja so pode ser atribuido a uma unica missao
    @JoinColumn(name = "missoes_id") //Foreign Key/Chave Estrangeira, JoinColumn é a fusao da tabela cadastro de missoes com cadastro de ninja
    private MissoesModel missoes;


}
