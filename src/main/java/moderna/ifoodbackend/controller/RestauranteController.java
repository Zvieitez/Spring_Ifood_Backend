package moderna.ifoodbackend.controller;

import lombok.AllArgsConstructor;
import moderna.ifoodbackend.model.empresa.Restaurante;
import moderna.ifoodbackend.repository.RestauranteRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/restaurantes")
public class RestauranteController {
    RestauranteRepository restauranteRepository;

    @PostMapping("/criar")
    public Restaurante novo (@RequestBody Restaurante restaurante){
        return restauranteRepository.save(restaurante);
    }
}
