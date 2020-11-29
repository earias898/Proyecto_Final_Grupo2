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
public class clsModuloComida {
    private int cedulaJuridica;
    private String tipoComercio;
    private String descripcion;
    private int telefono;
    private String direccion;
    private String correo;
    private String paginaWeb;
    private String platilloEstrella;
    
    public clsModuloComida(){
        
    }
     public clsModuloComida (int cedulaJuridica){
        this.cedulaJuridica = cedulaJuridica;
    }

    public clsModuloComida(int cedulaJuridica, String tipoComercio, String descripcion, int telefono, String direccion, String correo, String paginaWeb, String platilloEstrella) {
        this.cedulaJuridica = cedulaJuridica;
        this.tipoComercio = tipoComercio;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.paginaWeb = paginaWeb;
        this.platilloEstrella = platilloEstrella;
    }
    public void setCedulaJuridica (int cedulaJuridica){
        if(cedulaJuridica > 0)
            this.cedulaJuridica = cedulaJuridica;
    }
    public int getCedulaJuridica (){
        return cedulaJuridica;
    }
    public String getTipoComercio() {
        return tipoComercio;
    }
    public void setTipodeComercio(String tipoComercio) {
        this.tipoComercio = tipoComercio;
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
    public String getPlatilloEstrella() {
        return platilloEstrella;
    }
    public void setPlatilloEstrella(String platilloEstrella) {
        this.platilloEstrella = platilloEstrella;
    }
}
