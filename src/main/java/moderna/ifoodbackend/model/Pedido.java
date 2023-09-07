package moderna.ifoodbackend.model;

import jakarta.persistence.*;
import lombok.Data;
import moderna.ifoodbackend.model.empresa.Restaurante;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @OneToOne
    private Restaurante restaurante;

    @OneToOne
    private Cliente cliente;

    private String metodoPagamento;

}
