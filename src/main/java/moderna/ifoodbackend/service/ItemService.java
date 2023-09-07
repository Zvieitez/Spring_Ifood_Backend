package moderna.ifoodbackend.service;

import lombok.AllArgsConstructor;
import moderna.ifoodbackend.model.empresa.Item;
import moderna.ifoodbackend.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ItemService {
    ItemRepository itemRepository;

    public Item salvar(Item item){
        return itemRepository.save(item);
    }
}
