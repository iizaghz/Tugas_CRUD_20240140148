package com.deploy.praktikum2.controller;

import com.deploy.praktikum2.model.dto.KtpAddRequest;
import com.deploy.praktikum2.model.dto.KtpDto;
import com.deploy.praktikum2.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;

@RestController
public class KtpController {

    @Autowired
    private KtpService ktpService;

    @PostMapping(
            path = "/ktp",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> addKtp(@RequestBody KtpAddRequest request) {
        try {
            KtpDto result = ktpService.addKtp(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                    "status", "success",
                    "data", result
            ));
        } catch (ResponseStatusException e) {
            return ResponseEntity.status(e.getStatusCode()).body(Map.of(
                    "status", "error",
                    "message", e.getReason()
            ));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of(
                    "status", "error",
                    "message", e.getMessage()
            ));
        }
    }

    @GetMapping(
            path = "/ktp",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getAllKtp() {
        List<KtpDto> result = ktpService.getAllKtp();
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "data", result
        ));
    }

    @GetMapping(
            path = "/ktp/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getKtpById(@PathVariable("id") Integer id) {
        try {
            KtpDto result = ktpService.getKtpById(id);
            return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                    "status", "success",
                    "data", result
            ));
        } catch (ResponseStatusException e) {
            return ResponseEntity.status(e.getStatusCode()).body(Map.of(
                    "status", "error",
                    "message", e.getReason()
            ));
        }
    }

    @PutMapping(
            path = "/ktp/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> updateKtp(
            @PathVariable("id") Integer id,
            @RequestBody KtpAddRequest request
    ) {
        try {
            KtpDto result = ktpService.updateKtp(id, request);
            return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                    "status", "success",
                    "data", result
            ));
        } catch (ResponseStatusException e) {
            return ResponseEntity.status(e.getStatusCode()).body(Map.of(
                    "status", "error",
                    "message", e.getReason()
            ));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of(
                    "status", "error",
                    "message", e.getMessage()
            ));
        }
    }

    @DeleteMapping(
            path = "/ktp/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> deleteKtp(@PathVariable("id") Integer id) {
        try {
            ktpService.deleteKtp(id);
            return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                    "status", "success",
                    "message", "Data KTP dengan ID " + id + " berhasil dihapus."
            ));
        } catch (ResponseStatusException e) {
            return ResponseEntity.status(e.getStatusCode()).body(Map.of(
                    "status", "error",
                    "message", e.getReason()
            ));
        }
    }
}
