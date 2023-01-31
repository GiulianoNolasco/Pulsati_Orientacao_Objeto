
package com.mycompany.exercicioanimalheranca;

public class ExercicioAnimalHeranca {

    public static void main(String[] args) {
    cachorro cao1 = new cachorro();
    cao1.setNome("Toby");
    cao1.setRaca("Labrador");
    
    cao1.late();
    cao1.caminha();
    
    
    gato felino1 = new gato();
    felino1.setNome("Mimi");
    felino1.setRaca("Siamês");
    
    felino1.miar();
    felino1.caminha();
    }
}
