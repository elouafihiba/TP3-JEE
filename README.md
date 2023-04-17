<h3>Compte Rendu Tp3</h3>
<p>
On considère le schéma suivant<br>
<center><img src="github/assets/"></center>

1-Afficher les patients:
Entity Patient:
<center><img src="assets/1.PNG"></center>

Patient Repository:
<center><img src="assets/2.PNG"></center>

Patient Controller:
<center><img src="assets/3.PNG"></center>

Application:
<center><img src="assets/4.PNG"></center>

Affichage des patients dans une template Thymeleaf:
<center><img src="assets/5.PNG"></center>

Resultat:
<center><img src="assets/6.PNG"></center>

2-Faire la pagination:
Affichage:
Ajouter 'size' et 'page' dans le Controlleur
<center><img src="assets/7.PNG"></center>
la barre de pagination dans htlm
<center><img src="assets/8.PNG"></center>
Resultat:
<center><img src="assets/9.PNG"></center>

3-Chercher les patients:
Ajouter le formulaire de recherche
<center><img src="assets/10.PNG"></center>

Ajouter la methode "findByNomContains" dans Patient Repository 
<center><img src="assets/11.PNG"></center>

Ajouter le mot keyword dans la barre de pagination
<center><img src="assets/12.PNG"></center>

Ajouter le parametre keyword dans Patient Controller
<center><img src="assets/13.PNG"></center>

Resultat:
<center><img src="assets/14.PNG"></center>

4-Supprimer un patient:
Ajouter un boutton delete dans "patients.html" avec une confirmation Onclick
<center><img src="assets/15.PNG"></center>

Creer la methode delete dans le controller et faire une redirection vers index
<center><img src="assets/16.PNG"></center>
Resultat:
<center><img src="assets/17.PNG"></center>
<center><img src="assets/18.PNG"></center>
<center><img src="assets/19.PNG"></center>









