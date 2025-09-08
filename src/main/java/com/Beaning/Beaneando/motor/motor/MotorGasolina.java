package com.Beaning.Beaneando.motor.motor;

import org.springframework.stereotype.Component;

@Component
public class MotorGasolina implements MotorInterface {

    @Override
    public String getMotorType() {
        return "Motor de Gasolina";
    }   

}
