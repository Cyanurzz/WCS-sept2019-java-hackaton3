/* INSERT INTO table (nom_colonne_1, nom_colonne_2, ...
 VALUES ('valeur 1', 'valeur 2', ...)
 
 text,type,multiplicateur,
*/

INSERT INTO user(name, picture, xp, lvl, t_car, t_bus, t_tram, t_bicycle, t_foot) VALUES('Jean Novice','https://images.askmen.com/1080x540/2016/01/25-021526-facebook_profile_picture_affects_chances_of_getting_hired.jpg',150, 1, 970, 7, 5, 2, 8);
INSERT INTO user(name, picture, xp, lvl, t_car, t_bus, t_tram, t_bicycle, t_foot) VALUES('Michel Expert','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeGPb6m7HXPWrx5-w9vNsmbs9XeJlh9_17N4Zi8o16A8MzOhsD&s',249030497,42, 7, 780, 460, 179, 666);
INSERT INTO reward(code, montant,titre, user_id) VALUES('#52A6752B','10%', 'musée de truc',1);
INSERT INTO reward(code, montant,titre, user_id) VALUES('#52A6752B','10%', 'musée de truc',2);
INSERT INTO reward(code, montant,titre, user_id) VALUES('#1234FG54','33%', '3 produits achetés 1 offert',2);
INSERT INTO reward(code, montant,titre, user_id) VALUES('#FHG13234','10%', 'cinéma de machin',2);

INSERT INTO stats(transport, prix, CO2, times) VALUES('Voiture', 505.0, 206, false),('Tramway', 75.0,3.1,true),('Bus',75.0,95.5,true),('Vélo ',0.0,3.5,false), ('Vélo', 0.0, 19.5, false),('Navette Spatial', 185000000.0, 7153.97,true);

