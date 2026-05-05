package tema9.escuelasMadrid.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import tema9.escuelasMadrid.model.Escuela;
 
import java.util.List;

public interface EscuelaRepository extends MongoRepository<Escuela, String> {
    // Ejemplo: Buscar por nombre
    List<Escuela> findByNombreContainingIgnoreCase(String nombre);
}