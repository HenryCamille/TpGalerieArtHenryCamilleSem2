package galerie.entity;
import javax.persistence.*;
import lombok.*;
import java.util.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
@PrimaryKeyJoinColumn(name ="id")


public class Artiste extends Personne {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    
    @Column(unique=true)
    @NonNull
    private String biographie;
    
    @ManyToMany (mappedBy = "auteur")
    private List<Tableau> oeuvres = new LinkedList<>();
    
    
    
    
    
    // TODO : Mettre en oeuvre la relation oneToMany vers Exposition
}
