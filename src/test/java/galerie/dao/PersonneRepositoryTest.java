package galerie.dao;

import galerie.entity.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.PersonneRepository;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest


public class PersonneRepositoryTest {

    @Autowired
    private PersonneRepository personneDAO;

    
     @Test
    @Sql("test-data.sql")
    public void budgetArt () {
        float BudgetDansLeJeuDeTest = 0; 
        Personne p = personneDAO.getOne(1);
        float b = p.budgetArt(2010) ; 
        assertEquals(BudgetDansLeJeuDeTest, b , "Le budget art n'est pas de 0€");
    }

}