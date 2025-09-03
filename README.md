# Exercise 1.
1. Crea una interfaz Motor con dos implementaciones (MotorGasolina y
MotorElectrico). Una vez tengas las clases, intenta inyectarlas en otras dos
clases diferentes (CocheGasolina y CocheElectrico). Haz que CocheGasolina
inyecte a MotorGasolina y CocheElectrico a MotorElectrico. Para este ejercicio,
inyéctalas utilizando sus clases concretas y no su interfaz. ¿Utilizarás
inyección por constructor o inyección por campo? ¿Por qué?
2. Modifica las clases CocheGasolina y CocheElectrico para que reciban las
instancias como la interfaz Motor en lugar de sus clases concretas. ¿Lanza
alguna excepción? ¿Cómo puedes solucionarlo?
3. Haz lo mismo que en el ejercicio anterior, pero en lugar de utilizar una interfaz
Motor con dos implementaciones, esta vez hazlo creando dos beans de la misma
clase (puedes llamar a esta clase NuevoMotor). ¿Supone alguna diferencia
respecto al ejercicio anterior? ¿De cuántas formas puedes crear dos beans de
NuevoMotor? ¿Y los beans de MotorGasolina y MotorElectrico?
4. Ahora inyecta, en una nueva clase, todas las instancias de la interfaz Motor, o
todas las instancias de NuevoMotor, como prefieras.
5. Intenta modificar el ejercicio anterior para acceder a todos los beans de Motor o
NuevoMotor ordenados alfabéticamente por nombre. ¿Eres capaz de invertir el
orden?
6. Por último, crea un nuevo bean (Puerta) e inyéctalo en dos clases distintas.
Puedes ver la referencia de la instancia de Puerta inyectada utilizando el
depurador, o imprimiendo lo que nos devuelve el método toString() por defecto.
Debería ser algo como Puerta@294. ¿Son la misma instancia en las dos clases
donde inyectas Puerta? ¿Y si cambias su scope a prototype?
