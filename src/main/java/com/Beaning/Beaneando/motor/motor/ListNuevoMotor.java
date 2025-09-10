package com.Beaning.Beaneando.motor.motor;

import java.util.List;

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
}
