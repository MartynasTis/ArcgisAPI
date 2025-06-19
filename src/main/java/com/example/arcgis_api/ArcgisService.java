package com.example.arcgis_api;

import com.example.arcgis_api.model.ArcgisResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;

@Service
public class ArcgisService {

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public ArcgisService() {
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
    }

    /**
     * Fetches map information from the given URL.
     * @param url The ArcGIS MapServer URL
     * @return ArcgisResponseDTO containing map data
     * @throws Exception if the request fails
     */
    
    public ArcgisResponseDTO fetchMapInfo(String url) throws Exception {
        String requestUrl = url.endsWith("?f=json") ? url : url + "?f=json";
        String jsonResponse = restTemplate.getForObject(requestUrl, String.class);
        ArcgisResponseDTO response = objectMapper.readValue(jsonResponse, ArcgisResponseDTO.class);
        
        if (response.getLayers() == null) {
            response.setLayers(new ArrayList<>());
        }
        return response;
    }
}