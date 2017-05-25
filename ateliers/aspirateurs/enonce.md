Aspirateurs robotisés
=====================

Cet atelier est une synthèse sur la conception architecturale appliquée à un cas
précis.

Objectifs
---------

* Élaborer une conception architecturale.
* Appliquer ces notions à un cas.

Description du logiciel
-----------------------

Le logiciel doit gérer 4 aspirateurs robotisés, liés ensembles grâce à une unité
centrale. L'unité centrale et les 4 aspirateurs sont installés dans une grande
surface (comme un entrepôt ou un grand magasin) et ont la responsabilité de
nettoyer le plancher automatiquement.

L'unité centrale est une boîte contenant une poubelle et des connecteurs pour
charger les piles des 4 aspirateurs. L'unité centrale et les 4 aspirateurs sont
tous connectés à un wifi. Les aspirateurs ne communiquent pas ensemble, mais ils
communiquent continuellement avec l'unité centrale. L'unité centrale est le
cerveau de l'opération, c'est elle qui coordonne les efforts des 4 aspirateurs.

L'unité centrale va diriger les aspirateurs de façon à construire une
cartographie de la pièce à nettoyer. Lorsque sa carte est complétée, l'unité
centrale va calculer les routes pour chaque aspirateur.

Lorsqu'un aspirateur n'a presque plus de pile (moins de 10% de la charge), il
retourne automatiquement vers l'unité centrale pour se recharger.

Chaque aspirateur possède un compartiment pour y mettre les saletés aspirées.
Lorsque le compartiment est plein, l'aspirateur retourne automatiquement vers
l'unité centrale. L'unité centrale va récupérer les saletés de l'aspirateur et
les placer automatiquement dans sa poubelle. Lorsque la poubelle de l'unité
centrale est pleine, l'unité va émettre une lumière clignotante et envoyer un
SMS à un responsable de l'entretien. Tant que la poubelle n'est pas vidée, les
aspirateurs ne seront pas vidées par l'unité centrale.

Lorsque le responsable de l'entretien reçoit le SMS, il vide la poubelle de
l'unité centrale. À ce moment, le nettoyage de la pièce peut reprendre.

Si un aspirateur est bloqué et ne parvient plus à avancer ou à communiquer avec
l'unité centrale, alors l'unité centrale enverra un SMS au responsable de
l'entretien pour l'aviser de la situation.

Après chaque nettoyage complet de la pièce, des statistiques sont envoyées à une
application web du fabricant par Internet.

À intervalle régulier, l'unité centrale va tenter de télécharger une mise à jour
de son logiciel. Les aspirateurs seront ensuite mis à jour par l'unité centrale
lorsqu'ils se rechargent.

Exercice
--------

Vous devez faire la conception architecturale du logiciel gérant l'unité
centrale et les aspirateurs. Vous devez produire :
* un diagramme de composants;
* un diagramme de déploiement;
* un diagramme de packages.

Si le temps le permet, vous pouvez aussi faire :
* un modèle du domaine;
* un diagramme de cas d'utilisation.
