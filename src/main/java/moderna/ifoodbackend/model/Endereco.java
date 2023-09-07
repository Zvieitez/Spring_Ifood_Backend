package moderna.ifoodbackend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "endereco") anotação serve para renomear a tabela

public class Endereco  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //usar sempre
    private Long id;

    @Column(length = 100)
    private String rua;

    @Column
    private String numero;

    @Column
    private String cep;

    @Column
    private String bairro;

    @Column
    private String cidade;

    @Column
    private String estado;

    @ManyToOne
    @JoinColumn (name = "cliente_id") //anotação cria da chave estrangeira e coloca o nome
    private Cliente cliente;

}
