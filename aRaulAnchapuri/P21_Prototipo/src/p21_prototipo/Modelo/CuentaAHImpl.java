/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p21_prototipo.Modelo;

import p21_prototipo.Interface.ICuenta;

/**
 *
 * @author Anchapuri
 */
public class CuentaAHImpl implements ICuenta{
    private String tipo;
	private double monto;

	public CuentaAHImpl() {
		tipo = "AHORRO";
	}

	@Override
	public ICuenta clonar() {
		CuentaAHImpl cuenta = null;

		try {
			cuenta = (CuentaAHImpl) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return cuenta;
	}

	@Override
	public String toString() {
		return "CuentaAHImpl [tipo=" + tipo + ", monto=" + monto + "]";
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getMonto() {
		return monto;
	}
}
