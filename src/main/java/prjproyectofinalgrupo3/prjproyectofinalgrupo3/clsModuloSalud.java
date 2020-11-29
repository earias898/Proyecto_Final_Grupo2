/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjproyectofinalgrupo3.prjproyectofinalgrupo3;

/**
 *
 * @author esteb
 */
public class clsModuloSalud {
    private int cedulaJuridica;
    private String tipoCentro;
    private String descripcion;
    private int telefono;
    private String direccion;
    private String correo;
    private String paginaWeb;
    
    public clsModuloSalud(){
        
    }
     public clsModuloSalud (int cedulaJuridica){
        this.cedulaJuridica = cedulaJuridica;
    }

    public clsModuloSalud(int cedulaJuridica, String tipoCentro, String descripcion, int telefono, String direccion, String correo, String paginaWeb) {
        this.cedulaJuridica = cedulaJuridica;
        this.tipoCentro = tipoCentro;
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
    public String getTipodeCentroMedico() {
        return tipoCentro;
    }
    public void setTipodeCentroMedico(String tipoCentro) {
        this.tipoCentro = tipoCentro;
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