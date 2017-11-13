Builder et Decorator
====================

Dans cet atelier, nous allons appliquer 2 patrons de conception Gang of Four :
Builder et Decorator.

Objectifs
---------

* Appliquer des patrons de conception.
* Approfondir la compréhension de ses patrons.

Exercices
---------

1. Construisez une classe représentant l'information de base d'un animal : son
   nom, sa race, son espère, sa date de naissance, le nom du propriétaire et le
   nom du vétérinaire. Faites en sorte que cette classe soit un objet immuable
   (c'est-à-dire qu'il est impossible à modifier après son instanciation).
   Déplacez la logique de construction de l'animal dans une classe implémentant
   le patron Builder. Faites en sorte que seulement le Builder puisse instancer
   l'animal.

2. Mettez en place le patron Decorator sur un objet ayant une masse. L'interface
   de départ doit avoir une méthode pour obtenir le poids de l'objet. Vous devez
   débuter par 2 implémentations de cette interface :
   * une classe représentant un cube de fer (le constructeur du cube doit
     prendre en paramètre la taille d'un côté du cube en cm);
   * une classe représentant une sphère de nickel (le constructeur de la sphère
     doit prendre en paramètre le rayon de la sphère en cm).
   Vous devez calculer le poids des objets selon leur masse volumique (Wikipedia
   vous donnera la masse volumique de ces métaux).

   Ensuite, créez des décorateurs pour les propriétés suivantes (il s'agit de
   valeurs arbitraires) :
   * le poids de l'objet sur la Lune (25% de son poids sur Terre);
   * le poids de l'objet dans l'eau (55% de son poids hors de l'eau);
   * son poids en déplacement (170% de son poids sans déplacement).
