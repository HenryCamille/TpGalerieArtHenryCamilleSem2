package galerie.entity;
import javax.persistence.*;
import lombok.*;
import java.util.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Tableau {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String titre;

    @Column(unique=true)
    @NonNull
    private String support;
    
    @Column(unique=true)
    @NonNull
    private int largeur;
    
    @Column(unique=true)
    @NonNull
    private int hauteur;
    
    
    @ManyToMany(mappedBy = "oeuvres")
    List<Exposition> accrochages = new LinkedList<>();

    @OneToOne(mappedBy = "oeuvre")
    private Transaction vendu; 
    
    
    @ManyToOne
    private Artiste auteur;
        
        
    
    // TODO : Mettre en oeuvre la relation oneToMany vers Exposition
}
