package com.ejerciciotres.classes;

import com.ejerciciotres.interfaces.Animal;
import com.ejerciciotres.interfaces.IHerviboros;

public class Vaca extends Animal implements IHerviboros {
    @Override
    public void emitirSonido() {
        System.out.println("Muuuu");
    }

    @Override
    public void comer() {
        comerHierba();
    }

    @Override
    public void comerHierba() {
        System.out.println("Vaca herviboro");
    }
}
