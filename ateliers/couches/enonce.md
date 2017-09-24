Modèle en couches
=================

Le modèle en couches est une façon commune de regrouper les classes d'un
logiciel. Dans cet atelier, vous étudierez le code d'un projet existant pour y
appliquer le modèle en couches.

Le projet à étudier se nomme [PerGen](https://github.com/jacquesberger/Pergen).

Objectifs
---------

* Réfléchir sur la conception architecturale en appliquant le modèle en couches.
* S'habituer à travailler dans du code écrit par quelqu'un d'autre.

Exercice
--------

Pour chaque classe du logiciel :
1. tentez d'identifier la responsabilité de la classe;
2. identifiez la couche qui devrait contenir la classe étudiée;
3. placez la classe (juste son nom) dans un diagramme de classes UML et
   regroupez les classes selon leur couche respective.

Prenez le modèle en couches à 5 couches :
* Présentation
* Application
* Domaine
* Services techniques
* Fondation

Les packages `generated.*` peuvent être omis de votre analyse car il s'agit
de code généré par [SableCC](http://www.sablecc.org/).
