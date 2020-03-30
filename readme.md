# What does it do?

This microservice manages the articles in our shop

# Configuration / Setup

- Set a human readable name for the service in `application.properties`
- Set a port for the REST service in `application.properties`
- Configure a MySQL database connection in `application.properties`


Es wird [Docker](https://www.docker.com/) benötigt.

Die [Git-Bash](https://git-scm.com/) ist extrem hilfreich.

## Build .jar

In IntelliJ in der (rechten) Seitenleiste auf *Maven* klicken, *Lifecycle* auswählen und den *install* Build
laufen lassen.

In `target/` sollte nun die Datei `article-microservice.jar` liegen.

## Docker Container-Image bauen

Im Verzeichnis des discovery-server ein Git-Bash starten, bzw. in das Verzeichnis navigieren.

Dort folgenden Befehl ausführen, um den Container zu bauen.

```
docker build -f Dockerfile -t article-microservice .
```
(Der Punkt am Ende ist wichtig, er zeigt das Verzeichnis an!)

## Docker Container starten

Alle auf dem Rechner verfügbaren Container-Images lassen sich mit `docker images` auflisten.

Um aus dem eben gebauten Container-Image einen Container zu starten, folgenden Befehl ausführen:

```
docker run -p 8080:8080 article-microservice
```

Der Parameter `-p` legt den Port fest. Vor dem Doppelpunkt steht der Port der Java-Anwendung,
nach dem Doppelpunkt steht der externe Port, auf den Docker mappen soll. 

Laufende Container lassen sich mit `docker ps` auflisten.



# How to make Requests

## Get list of Articles

```
GET /api/article
```

## Add new article
   
   ```
   POST /api/article
   {
       "name": "iPhone 8",
       "manufacturer": "Apple Inc.",
       "price": "999.00"
   }
   ```

## Get single article

```
GET http://localhost:8080/api/article/d00eba10-abc7-4621-b637-5110ee90fc83      <- specific articleId

```