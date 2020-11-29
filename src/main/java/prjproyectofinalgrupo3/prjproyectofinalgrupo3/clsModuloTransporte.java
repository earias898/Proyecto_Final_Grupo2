/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjproyectofinalgrupo3.prjproyectofinalgrupo3;

/**
 *
 * @author DonnkanCervantes
 */
public class clsModuloTransporte {
    private String ruta, pago;
    private int telefono, tarifa;
    
    public ModuloTransporte(String ruta, String pago, int telefono, int tarifa) {
        this.ruta = ruta;
        this.pago = pago;
        this.telefono = telefono;
        this.tarifa = tarifa;
    }
    
    public boolean checkLength(int id, int length) {
    return Math.log10(id) < length;
  }
    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
      if (telefono >= 99999999 || telefono < 0) 
        this.telefono = telefono;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        if(tarifa > 0)
        this.tarifa = tarifa;
    }
}
