package moderna.ifoodbackend.model.empresa;

import jakarta.persistence.*;
import lombok.Data;
import moderna.ifoodbackend.model.Cliente;

@Entity
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;
}
