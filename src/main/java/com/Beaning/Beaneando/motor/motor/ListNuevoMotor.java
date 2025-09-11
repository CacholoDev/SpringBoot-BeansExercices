package com.Beaning.Beaneando.motor.motor;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class ListNuevoMotor {

    private final List<NuevoMotor> motores;

    public ListNuevoMotor(List<NuevoMotor> motores) {
        this.motores = motores;
    }

    public List<NuevoMotor> getMotores() {
        // Aquí podrías aplicar lógica extra si quisieras (ordenar, filtrar…)
        return motores;
    }

    public List<NuevoMotor> getMotoresOrdenados() {
        return motores.stream()
                .sorted(Comparator.comparing(NuevoMotor::getMotorType, String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }

    public List<NuevoMotor> getMotoresInvertidos() {
        return motores.stream()
                .sorted(Comparator.comparing(NuevoMotor::getMotorType, String.CASE_INSENSITIVE_ORDER).reversed())
                .collect(Collectors.toList());
    }
}
