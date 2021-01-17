package galerie.entity;
import javax.persistence.*;
import lombok.*;
import java.util.*;
import java.time.LocalDate;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Transaction {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private LocalDate venduLe;

    @Column(unique=true)
    @NonNull
    private float prixVente;
    
    
    @OneToOne
    private Transaction oeuvre; 
    
    
    @ManyToOne 
    private Exposition lieuDeVentes;
    
    
    @ManyToOne
    private Personne client;

    
    
}