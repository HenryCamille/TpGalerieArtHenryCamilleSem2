package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.ExpositionRepository;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest

public class ExpositionRepositoryTest {

    @Autowired
    private ExpositionRepository expositionDAO;

   
    @Test
    @Sql("test-data.sql")
    public void CA () {
        float CADansLeJeuDeTest = 0; 
        Exposition e = expositionDAO.getOne(1);
        float CA = e.CA() ; 
        assertEquals(CADansLeJeuDeTest, CA , "On n'a pas un CA Annuel de 0€");
    }

}