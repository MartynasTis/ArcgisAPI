package com.example.arcgis_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.arcgis_api.model.ArcgisResponseDTO;

@RestController
@RequestMapping("/api/arcgis")
public class ArcgisController {
	
    @Autowired
    private ArcgisService arcgisService;

    @GetMapping
    public ResponseEntity<?> getMapInfo(@RequestParam String url) throws Exception {
    	ArcgisResponseDTO mapInfo = arcgisService.fetchMapInfo(url);
        return ResponseEntity.ok(mapInfo);
    }

}
