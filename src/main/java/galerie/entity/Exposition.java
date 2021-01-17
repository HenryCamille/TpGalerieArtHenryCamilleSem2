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
public class Exposition {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private LocalDate debut;

    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column(unique=true)
    @NonNull
    private int duree;
    
    
    @ManyToOne
    private Galerie organisateur;
    
    
    
    @ManyToMany
    List<Tableau> oeuvres = new LinkedList<>();
    
    
    @OneToMany (mappedBy = "lieuDeVente")
    private List<Transaction> ventes = new LinkedList<>();
    

    
    public float CA() {
        float ChiffreAffaire = 0 ; 
        for (Transaction t : ventes) {
            ChiffreAffaire += t.getPrixVente() ;
        }
        return ChiffreAffaire ; 
    }
    

    
    // TODO : Mettre en oeuvre la relation oneToMany vers Exposition
}

