package com.Beaning.Beaneando.motor.motor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MotorConfiguration {

    // Aquí podrías definir beans específicos si es necesario
    @Bean("nuevoMotorGasolina")
    public NuevoMotor nuevoMotorGasolina() {
        return new NuevoMotor("gasolina");
    }

    @Bean("nuevoMotorElectrico")
    public NuevoMotor nuevoMotorElectrico() {
        return new NuevoMotor("electrico");
    }
}
