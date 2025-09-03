package com.Beaning.Beaneando.coche.coche;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Beaning.Beaneando.motor.motor.MotorInterface;

@Component
public class CocheElectrico {

    private final MotorInterface motorInterface;

    public CocheElectrico(@Qualifier(MotorInterface.MOTOR_ELECTRICO) MotorInterface motorInterface) {
        this.motorInterface = motorInterface;
    }

    public String arranca() {
        return motorInterface.getMotorType();
    }

}
