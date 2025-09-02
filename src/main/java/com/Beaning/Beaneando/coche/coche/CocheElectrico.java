package com.Beaning.Beaneando.coche.coche;

import org.springframework.stereotype.Component;

import com.Beaning.Beaneando.motor.motor.MotorElectrico;

@Component
public class CocheElectrico {

    private final MotorElectrico motorElectrico;

    public CocheElectrico(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public String arranca() {
        return motorElectrico.getMotorType();
    }

}
