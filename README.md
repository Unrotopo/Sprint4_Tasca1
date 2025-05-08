# Exercici Spring i Maven

Aquest projecte és un primer contacte amb **Spring Boot** i **Maven**, utilitzant Java per desenvolupar una API REST senzilla.

## 🛠️ Configuració inicial

Es genera el projecte Spring Boot a través de la pàgina [https://start.spring.io](https://start.spring.io), amb les següents característiques:

### PROJECT METADATA

- **Group:** `cat.itacademy.s04.t01.n01`  
- **Artifact:** `S04T01N01`  
- **Name:** `S04T01N01`  
- **Description:** `S04T01N01`  
- **Package name:** `cat.itacademy.s04.t01.n01`

### DEPENDÈNCIES

- Spring Boot DevTools  
- Spring Web

### ALTRES OPCIONS

- **Project:** Maven  
- **Language:** Java  
- **Spring Boot:** Última versió estable  
- **Packaging:** Jar  
- **Java:** Versió mínima 11  

## 📥 Importació a Eclipse

Un cop descarregat el projecte, s'importa a IntelliJ.

## ⚙️ Configuració de l'aplicació

S'edita l’arxiu `src/main/resources/application.properties` i s'afegeix la configuració següent:

```properties
server.port=9000


🌐 API REST
Dins el paquet principal cat.itacademy.s04.t01.n01, es crea un subpaquet anomenat controller.

S'afegeix una classe anomenada HelloWorldController amb dos mètodes:

1. saluda
Mètode GET

Rep un paràmetre nom com a RequestParam

Valor per defecte: "UNKNOWN"

Exemple de resposta:
Hola, UNKNOWN. Estàs executant un projecte Maven

Endpoints:
http://localhost:9000/HelloWorld

http://localhost:9000/HelloWorld?nom=ElMeuNom

2. saluda2
Mètode GET

Rep un paràmetre nom com a PathVariable

El paràmetre és opcional

Exemple de resposta:
Hola, elmeunom. Estàs executant un projecte Maven

Endpoints:
http://localhost:9000/HelloWorld2

http://localhost:9000/HelloWorld2/elmeunom

💡 Aquest exercici et permet familiaritzar-te amb la creació i execució d’una aplicació Spring Boot utilitzant Maven i l’IDE Eclipse.
