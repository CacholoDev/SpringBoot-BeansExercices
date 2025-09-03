package com.Beaning.Beaneando.motor.motor;

import org.springframework.stereotype.Component;

@Component
public class MotorElectrico implements MotorInterface {
    
    @Override
    public String getMotorType() {
        return "Motor Eléctrico";
    }

}
