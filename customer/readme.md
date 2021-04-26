# What does it do?

This microservice manages the customers of our shop.

# Configuration / Setup

## MySql
MySQL muss laufen. Es muss eine Tabelle `shop` geben und einen Nutzer `shopmysql` mit dem Passwort `shopmysql`

Dieser Datenbankserver lässt sich mit MySql mit folgendem Befehl starten:

```bash
docker run -p 3306:3306 --name mysql-standalone -e MYSQL_ROOT_PASSWORD=toor -e MYSQL_DATABASE=shop -e MYSQL_USER=shopmysql -e MYSQL_PASSWORD=shopmysql -d mysql:8
```

zum stoppen des Containers:

```bash
docker stop mysql-standalone
```

zum erneuten Starten, wenn der Container schon mal gelaufen ist:

```bash
docker start mysql-standalone
```

## service.config
In der `service.config` werden die Einstellungen des Containers festgelegt. Hier muss ein Discovery-Server eingetragen
werden. Außerdem die Konfiguration eines MySQL Servers.

## Docker
Es wird [Docker](https://www.docker.com/) benötigt.

Die [Git-Bash](https://git-scm.com/) ist extrem hilfreich.

## Build .jar

In IntelliJ in der (rechten) Seitenleiste auf *Maven* klicken, *Lifecycle* auswählen und den *install* Build
laufen lassen.

In `target/` sollte nun die Datei `customer-microservice.jar` liegen.

## Docker Container-Image bauen

Im Verzeichnis des customer-service ein Git-Bash starten, bzw. in das Verzeichnis navigieren.

Dort folgenden Befehl ausführen, um den Container zu bauen.

```
docker build -f Dockerfile -t customer-microservice .
```
(Der Punkt am Ende ist wichtig, er zeigt das Verzeichnis an!)

## Docker Container starten

Alle auf dem Rechner verfügbaren Container-Images lassen sich mit `docker images` auflisten.

Um aus dem eben gebauten Container-Image einen Container zu starten, folgenden Befehl ausführen:

```
docker run -p 8080:8082 customer-microservice
```

Der Parameter `-p` legt den Port fest. Vor dem Doppelpunkt steht der Port der Java-Anwendung,
nach dem Doppelpunkt steht der externe Port, auf den Docker mappen soll. 

Laufende Container lassen sich mit `docker ps` auflisten.
...