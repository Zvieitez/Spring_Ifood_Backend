package moderna.ifoodbackend.controller;

import lombok.AllArgsConstructor;
import moderna.ifoodbackend.model.Pedido;
import moderna.ifoodbackend.repository.PedidoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/pedidos")
@AllArgsConstructor

public class PedidoController {
    PedidoRepository pedidoRepository;

    @PostMapping("/criar")
    public Pedido criar(@RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }

}
