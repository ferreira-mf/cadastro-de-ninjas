package dev.java10x.CadastroDeNinjas.ninjas;

import dev.java10x.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//ENTITY transforma uma classe em uma entidade do banco de dados
@Entity //essa anotacao cria uma tabela com todos os atributos dessa classe
@Table (name = "tb_cadastro")

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


    public NinjaModel(long id, String nome, String email, int idade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
