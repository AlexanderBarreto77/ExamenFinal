package espe.edu.ec.arquitectura.optimizacion.controller;

import espe.edu.ec.arquitectura.optimizacion.model.RespuestaOptimizacion;
import espe.edu.ec.arquitectura.optimizacion.model.SolicitudOptimizacion;
import espe.edu.ec.arquitectura.optimizacion.service.OptimizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Permite CORS para el frontend
public class OptimizacionController {

    @Autowired
    private OptimizacionService optimizacionService;

    @PostMapping("/optimizar")
    public ResponseEntity<?> optimizar(@RequestBody SolicitudOptimizacion solicitud) {
        try {
            if (solicitud.getCapacidad() < 0) {
                return ResponseEntity.badRequest().body("La capacidad no puede ser negativa");
            }

            if (solicitud.getObjetos() == null || solicitud.getObjetos().isEmpty()) {
                return ResponseEntity.badRequest().body("Debe proporcionar al menos un proyecto");
            }

            RespuestaOptimizacion respuesta = optimizacionService.optimizarPortafolio(
                    solicitud.getCapacidad(),
                    solicitud.getObjetos()
            );

            return ResponseEntity.ok(respuesta);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Error interno: " + e.getMessage());
        }
    }
}
