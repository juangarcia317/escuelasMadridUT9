package tema9.escuelasMadrid.model;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor //genera el constructor vacío, que MongoDB necesita para deserializar documentos.
@AllArgsConstructor   //genera un constructor con todos los campos, útil para crear objetos en los tests.
@Document(collection = "escuelas_madrid") //nombre de la colección en mongo
@Data
public class Escuela {
    @Id
    private String mongoId; // ID interno de MongoDB

    @Field("id")
    private String idEntidad;

    @Field("title")
    private String nombre;

    private Address address; // Clase anidada
    private Location location; // Clase anidada
    
    // Si quieres el campo con @
    @Field("@id")
    private String uriReferencia;
}

@Data
class Address {
    @Field("postal-code")
    private String codigoPostal;
    @Field("street-address")
    private String direccion;
    private String locality;
}

@Data
class Location {
    private Double latitude;
    private Double longitude;
}
