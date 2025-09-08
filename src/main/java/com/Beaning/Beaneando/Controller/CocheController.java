package com.Beaning.Beaneando.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Beaning.Beaneando.coche.coche.CocheElectrico;
import com.Beaning.Beaneando.coche.coche.CocheGasolina;

@RestController
public class CocheController {

    private final CocheGasolina cocheGasolina;
    private final CocheElectrico cocheElectrico;

    public CocheController(CocheGasolina cocheGasolina, CocheElectrico cocheElectrico) {
        this.cocheGasolina = cocheGasolina;
        this.cocheElectrico = cocheElectrico;
    }

    @GetMapping("/gasolina")
    public String arrancarCocheGasolina() {
        return cocheGasolina.arranca();
    }

    @GetMapping("/electrico")
    public String arrancarCocheElectrico() {
        return cocheElectrico.arranca();
    }

    

}
