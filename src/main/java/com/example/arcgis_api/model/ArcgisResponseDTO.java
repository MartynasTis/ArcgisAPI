package com.example.arcgis_api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) 
public class ArcgisResponseDTO {
    private String mapName;
    private String description;
    private List<ArcgisLayer> layers;

    public ArcgisResponseDTO() {
    }

    public ArcgisResponseDTO(String mapName, String description, List<ArcgisLayer> layers) {
        this.mapName = mapName;
        this.description = description;
        this.layers = layers;
    }

    // Getters and Setters
    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ArcgisLayer> getLayers() {
        return layers;
    }

    public void setLayers(List<ArcgisLayer> layers) {
        this.layers = layers;
    }
    
}