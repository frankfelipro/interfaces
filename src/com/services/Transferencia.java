package com.services;

import com.interfaces.ITransferencia;

public class Transferencia implements ITransferencia {
    @Override
    public void realizarTransferencia() {
        System.out.println("Realizando Transferencia");
    }

    @Override
    public void transaccionOk() {
        System.out.println("Transferencia Transaccion Ok");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("Transferencia Transaccion no Ok");
    }
}
