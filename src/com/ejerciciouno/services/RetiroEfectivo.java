package com.ejerciciouno.services;

import com.ejerciciouno.interfaces.IRetiroEfectivo;

public class RetiroEfectivo implements IRetiroEfectivo {
    @Override
    public void retirarEfectivo() {
        System.out.println("Retirando Efectivo");
    }

    @Override
    public void transaccionOk() {
        System.out.println("RetiroEfectivo Transaccion OK");
    }

    @Override
    public void transaccionNoOk() {
        System.out.println("RetiroEfectivo Transaccion No Ok");
    }
}
