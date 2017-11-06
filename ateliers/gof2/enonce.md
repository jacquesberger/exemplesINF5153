Memento et Observer
===================

Dans cet atelier, nous allons appliquer 2 patrons de conception Gang of Four :
Memento et Observer.

Objectifs
---------

* Appliquer des patrons de conception.
* Approfondir la compréhension de ses patrons.

Exercices
---------

1. Vous devez mettre en place le patron Memento. Créez une classe représentant
   une personne avec au moins 6 attributs. Mettez en place le patron Memento sur
   cette classe.

2. Vous devez mettre en place le patron Observer. Créez une classe d'historique
   de modification sur une personne. Vous utiliserez la classe créée lors de
   l'exercice précédent. Une instance de la classe d'historique aura la
   responsabilité de conserver une historique des modifications apportées à une
   instance de l'objet personne. Concrètement, la personne est la cible et
   l'historique est l'observateur. Dès qu'une propriété de la cible change,
   l'observateur doit être avisé et conserver en mémoire un Memento de l'objet
   modifié. Ainsi, l'historique serait en mesure de reconstruire n'importe
   quel ancien état de l'instance de personne.
