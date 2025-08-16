package espe.edu.ec.arquitectura.optimizacion.service;

import espe.edu.ec.arquitectura.optimizacion.model.Proyecto;
import espe.edu.ec.arquitectura.optimizacion.model.RespuestaOptimizacion;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class OptimizacionService {

    public RespuestaOptimizacion optimizarPortafolio(int capacidad, List<Proyecto> proyectos) {
        int n = proyectos.size();
        int[][] dp = new int[n + 1][capacidad + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacidad; w++) {
                if (proyectos.get(i - 1).getPeso() <= w) {
                    dp[i][w] = Math.max(
                            dp[i - 1][w],
                            dp[i - 1][w - proyectos.get(i - 1).getPeso()] + proyectos.get(i - 1).getGanancia()
                    );
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        List<String> seleccionados = new ArrayList<>();
        int pesoTotal = 0;
        int w = capacidad;

        for (int i = n; i > 0 && dp[n][capacidad] > 0; i--) {
            if (dp[n][capacidad] != dp[i - 1][w]) {
                seleccionados.add(proyectos.get(i - 1).getNombre());
                w -= proyectos.get(i - 1).getPeso();
                pesoTotal += proyectos.get(i - 1).getPeso();
            }
        }

        Collections.reverse(seleccionados);
        return new RespuestaOptimizacion(seleccionados, dp[n][capacidad], pesoTotal);
    }
}
