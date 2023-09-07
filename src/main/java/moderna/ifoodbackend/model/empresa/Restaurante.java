package moderna.ifoodbackend.model.empresa;

import jakarta.persistence.*;
import lombok.Data;
import moderna.ifoodbackend.model.Contato;
import moderna.ifoodbackend.model.Endereco;

import java.util.List;

@Entity
@Data
public class Restaurante {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String documento;
    private String categoria;
    private double avaliacao;

    @OneToMany(cascade = CascadeType.ALL)//One corresponde a classe de cliente e Many corresponde aos contatos - cascade atualiza todos os dados (colocar apenas na classe mãe)
    @JoinColumn (name = "restaurante_id") //anotação cria da chave estrangeira e coloca o nome
    private List<Contato> contatos;

    @OneToMany (cascade = CascadeType.ALL)//One corresponde a classe de cliente e Many corresponde aos contatos - cascade atualiza todos os dados (colocar apenas na classe mãe)
    @JoinColumn (name = "restaurante_id") //anotação cria da chave estrangeira e coloca o nome
    private List<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL)//One corresponde a classe de cliente e Many corresponde aos contatos - cascade atualiza todos os dados (colocar apenas na classe mãe)
    @JoinColumn (name = "restaurante_id") //anotação cria da chave estrangeira e coloca o nome
    private List<Item> itens;

}
