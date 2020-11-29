/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjproyectofinalgrupo3.prjproyectofinalgrupo3;

/**
 *
 * @author orak
 */
public class clsModuloCultura {
    
    private int cedulaJuridica;
    private String tipoDanzas;
    private String descripcion;
    private int telefono;
    private String direccion;
    private String correo;
    private String paginaWeb;
    


public clsModuloCultura(){
    
 }
    
    public clsModuloCultura(int cedulaJuridica, String tipoDanzas, String descripcion, int telefono, String direccion, String correo, String paginaWeb) {
        this.cedulaJuridica = cedulaJuridica;
        this.tipoDanzas = tipoDanzas;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.paginaWeb = paginaWeb;
    }
    public void setCedulaJuridica (int cedulaJuridica){
        if(cedulaJuridica > 0)
            this.cedulaJuridica = cedulaJuridica;
    }
    public int getCedulaJuridica (){
        return cedulaJuridica;
    }
    public String getTipodeDanzas() {
        return tipoDanzas;
    }
    public void setTipoDeDanzas(String tipoDanzas) {
        this.tipoDanzas = tipoDanzas;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
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

}
