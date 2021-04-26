# What does it do?

Dieser microservice ist unser service-discovery.

# Configuration / Setup

Es wird [Docker](https://www.docker.com/) benötigt.

Die [Git-Bash](https://git-scm.com/) ist extrem hilfreich.

## Build .jar

In IntelliJ in der (rechten) Seitenleiste auf *Maven* klicken, *Lifecycle* auswählen und den *install* Build
laufen lassen.

In `target/` sollte nun die Datei `eureka-discovery-server.jar` liegen.

## Docker Container-Image bauen

Im Verzeichnis des discovery-server ein Git-Bash starten, bzw. in das Verzeichnis navigieren.

Dort folgenden Befehl ausführen, um den Container zu bauen.

```
docker build -f Dockerfile -t eureka-discovery-server .
```
(Der Punkt am Ende ist wichtig, er zeigt das Verzeichnis an!)

## Docker Container starten

Alle auf dem Rechner verfügbaren Container-Images lassen sich mit `docker images` auflisten.

Um aus dem eben gebauten Container-Image einen Container zu starten, folgenden Befehl ausführen:

```
docker run -p 8761:8761 eureka-discovery-server
```

Der Parameter `-p` legt den Port fest. Vor dem Doppelpunkt steht der Port der Java-Anwendung,
nach dem Doppelpunkt steht der externe Port, auf den Docker mappen soll. Über diesen externen Port können wir auf
unsere Anwendung zugreifen. Er kann frei gewählt werden. Hier beim discovery-service macht es jedoch Sinn, ihn nicht
zu ändern.

Laufende Container lassen sich mit `docker ps` auflisten.