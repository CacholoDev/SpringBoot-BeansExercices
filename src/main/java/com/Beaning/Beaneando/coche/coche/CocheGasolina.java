package com.Beaning.Beaneando.coche.coche;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.Beaning.Beaneando.Utilities.BeanNames;
import com.Beaning.Beaneando.motor.motor.NuevoMotor;

@Component
public class CocheGasolina {

   private final NuevoMotor nuevoMotor;

    public CocheGasolina(@Qualifier(BeanNames.MOTOR_GASOLINA) NuevoMotor nuevoMotor) {
        this.nuevoMotor = nuevoMotor;
    }

    public String arranca() {
        return "Coche con " + nuevoMotor.getMotorType();
    }
}
