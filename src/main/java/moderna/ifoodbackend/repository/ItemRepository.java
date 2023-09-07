package moderna.ifoodbackend.repository;

import moderna.ifoodbackend.model.empresa.Item;
import moderna.ifoodbackend.model.empresa.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface ItemRepository extends JpaRepository<Item, Long> {
    }

