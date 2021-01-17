package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Galerie;
import org.springframework.data.jpa.repository.Query;


// This will be AUTO IMPLEMENTED by Spring 

public interface GalerieRepository extends JpaRepository<Galerie, Integer> {
    
    @Query (
            value = 
            "SELECT sum(prix_Vente)"
            + "FROM Transactions INNER JOIN Exposition ON (Transactions.lieu_de_vente_id = Exposition.id) "
            + "WHERE Exposition.id = :id",
            nativeQuery = true
    )
    float chiffreAffairePour(Integer id);

}