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
//@Table(name = "contato") anotação serve para renomear a tabela

public class Contato {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //usar sempre
    private Long id;

    @Column(nullable = false) //mesma coisa que not null
    private String ddd;

    @Column(nullable = false) //mesma coisa que not null
    private String numero;

    @Column(nullable = false) //mesma coisa que not null
    private String email;

    @ManyToOne
    @JoinColumn (name = "cliente_id") //anotação cria da chave estrangeira e coloca o nome
    private Cliente cliente;
}
