-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, London');


INSERT INTO Exposition (id , debut, intitule ,duree, organisateur_id) VALUES (1, NULL, 'L Art Brut Contemporain', NULL, 1) ; 
INSERT INTO Exposition (id, debut, intitule, duree, organisateur_id) VALUES (2, TO_DATE ('2021/02/01','YYYY/MM/DD'), 'Art de la Renaissance', 20,1) ;
INSERT INTO Personne (id, nom, adresse) VALUES (1, 'M.Bastide', null);
INSERT INTO Personne (id, nom, adresse) VALUES (2, 'Léonard De Vinci', null);
INSERT INTO Artiste (id, biographie) VALUES (2,'...') ; 
INSERT INTO Tableau (id, titre, support, largeur, hauteur, auteur_id) VALUES (1, 'bacchus 1st Version IV','huile sur toile', 4, 4, 2) ; 
INSERT INTO Exposition_oeuvres (accrochages_id, oeuvres_id) VALUES (1,1) ; 
INSERT INTO Transactions (id, vendu_Le, prix_Vente, client_id, lieu_de_vente_id, oeuvre_id) VALUES (1, TO_DATE ('2010/01/01','YYYY/MM/DD') ,0, 1 , 1, 1);