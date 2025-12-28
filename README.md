# Camel Intro - Tu primera ruta de integración

Proyecto de ejemplo del artículo [Camel Quarkus: tu primera ruta de integración](https://quarkiverso.io/placer-del-desarrollador/camel-quarkus-introduccion/).

## Ejecutar

```bash
quarkus dev
```

## Probar

```bash
curl -X POST http://localhost:8080/api/pedido \
  -H "Content-Type: application/json" \
  -d '{"id": "001", "producto": "Laptop", "monto": 1500, "procesado": false}'
```

Respuesta esperada:

```json
{"id":"001","producto":"Laptop","monto":1500.0,"procesado":true}
```

## Estructura

```
src/main/java/io/quarkiverso/
├── Pedido.java       # Modelo de datos
└── RutaPedido.java   # Ruta Camel (HTTP → transformar → HTTP)
```
