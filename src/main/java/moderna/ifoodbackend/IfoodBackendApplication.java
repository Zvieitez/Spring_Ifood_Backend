package moderna.ifoodbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"moderna.ifoodbackend.*"})
public class IfoodBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfoodBackendApplication.class,args);
	}

}
