package com.Beaning.Beaneando.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Beaning.Beaneando.coche.coche.CocheElectrico;
import com.Beaning.Beaneando.coche.coche.CocheGasolina;
import com.Beaning.Beaneando.motor.motor.ListNuevoMotor;
import com.Beaning.Beaneando.motor.motor.NuevoMotor;

@RestController
public class CocheController {

    private final CocheGasolina cocheGasolina;
    private final CocheElectrico cocheElectrico;
    private final ListNuevoMotor motores;

    public CocheController(CocheGasolina cocheGasolina, CocheElectrico cocheElectrico, ListNuevoMotor motores) {
        this.cocheGasolina = cocheGasolina;
        this.cocheElectrico = cocheElectrico;
        this.motores = motores;    
    }
    
    @GetMapping("/gasolina")
    public String arrancarCocheGasolina() {
        return cocheGasolina.arranca();
    }

    @GetMapping("/electrico")
    public String arrancarCocheElectrico() {
        return cocheElectrico.arranca();
    }

    @GetMapping("/motores")
    public List<NuevoMotor> getMotores() {
        return motores.getMotores();
    }

}
