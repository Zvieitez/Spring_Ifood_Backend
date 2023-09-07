package moderna.ifoodbackend.repository;

import moderna.ifoodbackend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface ClienteRepository extends JpaRepository<Cliente, Long>{

       Optional<Cliente> findByEmail(String email);

    //"findBy" palavra reservada do JPA > crie um select * from...
       //Optional<String> findByEmail(String email);

    @Modifying
    @Query(nativeQuery = true,
            value = " update db_cliente set nome = ?2 ," +
                    " email = ?3 , " +
                    " documento = ?4 , " +
                    " data_de_nascimento = ?5 " +
                    " where id = ?1 ")
    int updateCliente(Long id, String nome, String email, String documento, String data_de_nascimento);
    }



