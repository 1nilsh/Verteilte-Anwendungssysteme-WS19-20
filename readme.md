# What does it do?

This microservice manages the orders of our shop.

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

# How to make Requests

## Get list of Orders

```
GET /api/order
```

## Create new Order

```
POST /api/order
{
    "orderingCustomerId": "cfe7a4fe-71ba-11ea-bc55-0242ac130003",
    "orderItems": [
        {
            "containedArticleId":"ff440fa8-71ba-11ea-bc55-0242ac130003",
            "articleQuantity": 4
        },
        {
            "containedArticleId":"0b7476d6-71c6-11ea-bc55-0242ac130003",
            "articleQuantity": 1
        },
        ...
        ...
        ...
    ]
}
```

## Add OrderItem to existing Order

```
POST /api/order/0dbc2f61-35be-43a6-aebd-b23c041b4525 // <-- beliebige existierende OrderId
{
	"containedArticleId":"12fbf398-71c6-11ea-bc55-0242ac130003",
	"articleQuantity": 2
}
```
