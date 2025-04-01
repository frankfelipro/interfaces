package com.ejerciciouno;

import com.ejerciciouno.clases.Basico;
import com.ejerciciouno.clases.Cobrador;
import com.ejerciciouno.clases.Ejecutivo;
import com.ejerciciouno.interfaces.*;
import com.ejerciciouno.services.*;

public class Main {
    public static void main(String[] args) {
        IConsultaSaldo consultaSaldo = new ConsultaSaldo();
        IDeposito deposito = new Deposito();
        ITransferencia transferencia = new Transferencia();
        IPagoServicios pagoServicios = new PagoServicios();
        IRetiroEfectivo retiroEfectivo = new RetiroEfectivo();

        Ejecutivo ejecutivo = new Ejecutivo(deposito, transferencia);
        ejecutivo.realizarDeposito();
        ejecutivo.estadoDeposito();
        ejecutivo.realizarTransferencia();
        ejecutivo.estadoTransferencia();

        Basico basico = new Basico(consultaSaldo, pagoServicios, retiroEfectivo);
        basico.consultarSaldo();
        basico.estadoConsultarSaldo();
        basico.pagarServicios();
        basico.estadoPagarServicios();
        basico.retirarEfectivo();
        basico.estadoRetirarEfectivo();

        Cobrador cobrador = new Cobrador(retiroEfectivo, consultaSaldo);
        cobrador.retirarEfectivo();
        cobrador.estadoRetirarEfectivo();
        cobrador.consultarSaldo();
        cobrador.estadoConsultarSaldo();
    }
}