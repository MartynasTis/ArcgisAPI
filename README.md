# ArcGIS API Project
A Spring Boot REST API to fetch and process ArcGIS MapServer data.

## Features
- Accepts a MapServer URL via POST request.
- Returns mapName, description, and layers in JSON format.

## Setup
1. Install Java 17 and Maven.
2. Run `mvn spring-boot:run`.
3. Test with: `curl -X POST -H "Content-Type: application/json" -d '{"url":"https://www.geoportal.lt/mapproxy/gisc_pagrindinis/MapServer"}' http://localhost:8080/api/arcgis`
