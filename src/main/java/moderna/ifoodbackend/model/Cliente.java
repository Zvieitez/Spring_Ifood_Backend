package moderna.ifoodbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//@Data - substitui o @Getter e @Setter

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "cliente") anotação serve para renomear a tabela

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //usar sempre
    private Long id;

    @Column(length = 100)
    private String nome;

    @Column(nullable = false) //mesma coisa que not null
    private String email;

    @Column(nullable = false)
    private String documento;

    private String dataDeNascimento; //substitui string para LocalDate

    //Cliente possui uma lista de contatos
    @OneToMany (cascade = CascadeType.ALL)//One corresponde a classe de cliente e Many corresponde aos contatos - cascade atualiza todos os dados (colocar apenas na classe mãe)
    @JoinColumn (name = "cliente_id") //anotação cria da chave estrangeira e coloca o nome
    private List<Contato> contatos;

    @OneToMany (cascade = CascadeType.ALL)//One corresponde a classe de cliente e Many corresponde aos contatos - cascade atualiza todos os dados (colocar apenas na classe mãe)
    @JoinColumn (name = "cliente_id") //anotação cria da chave estrangeira e coloca o nome
    private List<Endereco> enderecos;
}
