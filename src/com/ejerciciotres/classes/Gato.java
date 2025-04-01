package com.ejerciciotres.classes;

import com.ejerciciotres.interfaces.Animal;
import com.ejerciciotres.interfaces.ICarnivoros;

public class Gato extends Animal implements ICarnivoros {
    @Override
    public void emitirSonido() {
        System.out.println("Miau miau");
    }

    @Override
    public void comer() {
        comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("Gato carnivoro");
    }
}
