Maven
=====

Maven est un outil de _build_ très connu dans l'univers du développement Java.
Il propose une structure de projet et une gestion des dépendances plutôt
intéressantes. Aucune solution ne sera fournie pour les exercices mais les
manipulations nécessaires à leur réalisation seront présentées par la
monitrice durant l'atelier.

Objectifs
---------

* Créer un projet Maven.
* Manipuler les dépendances d'un projet avec le fichier `POM.xml`.

Exercices
---------

1. Créez un projet Maven dans NetBeans. Placez-y des classes que vous avez déjà
   fait dans un autre projet/TP/atelier avec des tests unitaires.

2. Ajoutez une dépendance vers la librairie `json-lib` dans le fichier `POM`.

   Voici le code à placer dans le `POM` :
   ```
   <dependency>
     <groupId>net.sf.json-lib</groupId>
     <artifactId>json-lib</artifactId>
     <version>2.4</version>
     <classifier>jdk15</classifier>
   </dependency>
   ```

3. Ajoutez le code nécessaire au `POM` afin de télécharger et installer un
   plugin pour calculer la couverture de tests unitaires, nommé Jacoco.

   Voici le code à placer dans le `POM` :
   ```
    <build>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.7.0.201403182114</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>prepare-package</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
    ```

    Explorez un peu l'outil. En cas de problème, consultez ce [screencast](http://accueil.labunix.uqam.ca/~berger_j/Jacoco.mov).
