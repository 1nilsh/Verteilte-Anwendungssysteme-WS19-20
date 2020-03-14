# What does it do?

This microservice manages the articles in our shop

# Configuration / Setup

- Set a human readable name for the service in `application.properties`
- Set a port for the REST service in `application.properties`
- Configure a MySQL database connection in `application.properties`

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