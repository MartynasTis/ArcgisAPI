# ArcGIS API Project
A Spring Boot REST API to fetch and process ArcGIS MapServer data.

## Features
- Accepts a MapServer URL via GET request.
- Returns mapName, description, and layers in JSON format.

## Setup
1. Install Java 17 and Maven.
2. Run `mvn spring-boot:run`.
3. Test with: `curl "http://localhost:8080/api/arcgis?url=https://www.geoportal.lt/mapproxy/gisc_pagrindinis/MapServer?f=json" | jq`
