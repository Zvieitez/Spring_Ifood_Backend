package moderna.ifoodbackend.controller;

import lombok.AllArgsConstructor;
import moderna.ifoodbackend.model.Cliente;
import moderna.ifoodbackend.model.Endereco;
import moderna.ifoodbackend.repository.EnderecoRepository;
import moderna.ifoodbackend.service.EnderecoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/endereco")
public class EnderecoController {

private EnderecoRepository enderecoRepository;
private EnderecoService enderecoService;

    @GetMapping("/retorna-endereco")
    public Endereco retornaEndereco() {
        Endereco novo = new Endereco();
        novo.setId(1L);
        novo.setRua("Dhalia");
        novo.setNumero("79");
        novo.setCep("51.020-290");
        novo.setBairro("Boa Viagem");
        novo.setEstado("PE");
        return novo;
    }

    @PostMapping ("/salvar-endereco")
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco salvarEndereco (@RequestBody Endereco endereco){
        return enderecoService.salvarEndereco(endereco);
    }

}

