package moderna.ifoodbackend.controller;

import lombok.AllArgsConstructor;
import moderna.ifoodbackend.model.Cliente;
import moderna.ifoodbackend.repository.ClienteRepository;
import moderna.ifoodbackend.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteRepository clienteRepository;
    private ClienteService clienteService;

    @GetMapping("/retorna-texto")
    public String retornaUmtexto() {
        return "Seja bem vindo ao serviço do cliente IfoodModerna";
    }

    @GetMapping("/retorna-cliente")
    public Cliente retornaCliente() {
        Cliente novo = new Cliente();
        novo.setId(1L);
        novo.setNome("Zandra");
        novo.setDocumento("5093608");
        novo.setDataDeNascimento("09/01/1979");
        novo.setEmail("zvieitez@homail.com");
        return novo;
    }

    @PostMapping("/salvar-cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return clienteService.salvarCliente(cliente);

    }

    @GetMapping("listar-clientes")
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    @GetMapping("buscar-cliente/{id}")
    public Optional<Cliente> buscarClientePorId(@PathVariable("id") Long id) {
        //metodo do JPA para buscar um cliente por id
        //o JPA não lê código JAVA qdo usar {} colocar @PathVariable
        //Optional trata o erro qdo o dado não exite, para não vir "nullpoiterexecept"
        return clienteRepository.findById(id);
    }

    @DeleteMapping("/deletar-cliente/{id}")
    public void deletarClientePorId(@PathVariable("id") Long id) {
        clienteService.deletarPorId(id);
    }

    @DeleteMapping("/deletar-todos")
    public void deletarTudo() {
        clienteService.deletarTodos();
    }

    //put e patch
    //put editar uma entidade completa ou mais de um atributo{
    //nome, email, documento, data de nascimento
    //}
    //patch editar um atributo específico

    @PutMapping("/editar/{id}")
    public void editarCliente(@RequestBody Cliente cliente, @PathVariable("id") Long id) {
        clienteService.editarClientePorId(cliente, id);
    }
}

