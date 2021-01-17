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
@Inheritance (strategy = InheritanceType.JOINED)


public class Personne {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String nom;

    @Column(unique=true)
    @NonNull
    private String adresse;
    
    
    @OneToMany (mappedBy = "client")
    private List<Transaction> achats = new LinkedList<>();
    
    
    
     public float budgetArt (int annee) {
        float budgetArtAnnuel = 0 ; 
        for (Transaction t : achats) {
            if (t.getVenduLe().getYear() == annee) {
                budgetArtAnnuel += t.getPrixVente() ; 
            }
        }
        return budgetArtAnnuel ; 
    }
    

    
    
}