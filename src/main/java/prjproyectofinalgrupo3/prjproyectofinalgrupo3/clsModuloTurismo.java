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
public class clsModuloTurismo {
    rivate String direccion, correo, paginaWeb, descripcion;
   private int telefono, precioNoche;

    public clsModuloTurismo(String direccion, String correo, String paginaWeb, String descripcion, int telefono, int precioNoche) {
        this.direccion = direccion;
        this.correo = correo;
        this.paginaWeb = paginaWeb;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.precioNoche = precioNoche;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if (telefono >= 99999999 || telefono < 0) 
            this.telefono = telefono;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
                if(precioNoche > 0)
        this.precioNoche = precioNoche;
    }
   
   
}
