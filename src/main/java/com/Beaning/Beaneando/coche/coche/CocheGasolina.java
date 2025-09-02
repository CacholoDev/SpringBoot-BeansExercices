package com.Beaning.Beaneando.coche.coche;

import org.springframework.stereotype.Component;

import com.Beaning.Beaneando.motor.motor.MotorGasolina;

@Component
public class CocheGasolina {

    private final MotorGasolina motorGasolina;

    public CocheGasolina(MotorGasolina motorGasolina) {
        this.motorGasolina = motorGasolina;
    }

    public String arranca() {
        return motorGasolina.getMotorType();
    }

}
