package moderna.ifoodbackend.service;

import lombok.AllArgsConstructor;
import moderna.ifoodbackend.controller.EnderecoController;
import moderna.ifoodbackend.model.Cliente;
import moderna.ifoodbackend.model.Endereco;
import moderna.ifoodbackend.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    public Endereco salvarEndereco(Endereco endereco) {
        Optional<Endereco> rualExiste = enderecoRepository.findByRua(endereco.getRua());
        if (!rualExiste.isPresent()) {
            enderecoRepository.save(endereco);
        } else {
            System.out.println("Rua existente no banco de dados.");
            //ou mensagem de erro: houve um erro na base de dados, verifique.
        }
        return null;
    }
}