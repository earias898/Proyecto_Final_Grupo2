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
public class clsModuloEducacion {
    
    private String cedulaJuridica;
    private String tipoEducacion;
    private String descripcion;
    private int telefono;
    private String direccion;
    private String correo;
    private String paginaWeb;
    
   public clsModuloEducacion(){
       
   }
    public clsModuloEducacion (int cedulaJuridica){
        this.cedulaJuridica = cedulaJuridica;
    }
    
    public clsModuloEducacion(int cedulaJuridica, String tipoEducacion, String despcripcion, int telefono, String direccion, String paginaWeb){
    
        this.cedulaJuridica = cedulaJuridica;
        this.tipoEducacion = tipoEducacion;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.paginaWeb = paginaWeb;
    }
    public voide setCedulaJuridica (int cedulaJuridica){
        if(cedulaJuridica > 0)
            this.cedulaJuridica = cedulaJuridica;
    }
    public int getCedulaJuridica (){
        return edulaJuridica;
    }
    public String getTipoDeEducacion (){
        return tipoEducacion;
    }
     public void setTipoDeEducacion(String tipoCentro){
         this.tipoEducacion = tipoEducacion;
     }
    public String getDescripcion(){
        return descripcion;
    }
    public float getTelefono(){
        return telefono
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getCorreo() {
        return correo;
        public void setCorreo(String correo) {
            this.correo = correo;
    }
        public String getPaginaWeb(){
            return paginaWeb;
    }
        public void setPaginaWeb(String paginaWeb) {
            this.paginaWeb = paginaWeb;
      }
  
   }
