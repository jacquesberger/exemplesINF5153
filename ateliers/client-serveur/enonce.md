Application client-serveur
==========================

Le projet de session implique le développement d'une application client-serveur.
L'architecture client-serveur est l'architecture la plus élémentaire pour la
programmation d'applications distribuées. Tous les autres modèles de
communication découlent de celui-ci.

Objectif
--------

* Manipuler une librairie de communication réseau.

Exercice
--------

Il existe plusieurs façons d'échanger de l'information entre 2 applications. En
voici 2 exemples :
* [XML-RPC](https://github.com/jacquesberger/exemplesINF5153/tree/master/XmlRpcExample)
* [ServerSocket](https://github.com/jacquesberger/exemplesINF5153/tree/master/FileTransferExample)

Choisissez une méthode et implémentez une application permettant à 2 personnes
inconnues de discuter par un chat.

Un client s'enregistre auprès du serveur. Le serveur le garde en mémoire.
Lorsque le deuxième client s'enregistre auprès du serveur, le serveur va jumeler
les deux clients. À partir de ce moment, le serveur doit démarrer une
conversation entre les deux clients.

Lorsqu'un client envoie un texte, le serveur le conserve avec un timestamp et
l'identifiant de l'auteur. À intervalle régulier, les deux clients doivent
demander au serveur de lui donner les derniers messages publiés depuis un
moment. Par exemple, à chaque 10 secondes, le client demande au serveur de lui
donner tous les messages qui ont été publiés depuis un moment X, le moment X
étant le timestamp de sa dernière lecture des messages auprès du serveur.

Le serveur va donc offrir 3 services :
* s'enregistrer auprès du serveur;
* envoyer un texte;
* lire tous les textes publiés dans la conversation depuis un moment en
  particulier.
