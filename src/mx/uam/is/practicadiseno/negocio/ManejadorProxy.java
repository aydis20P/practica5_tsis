package mx.uam.is.practicadiseno.negocio;

import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;
import mx.uam.is.practicadiseno.negocio.Observador;
import mx.uam.is.practicadiseno.negocio.ManejadorImpl;

public class ManejadorProxy implements Manejador {

  private MapeadorDatosImpl mapeador;
  private ManejadorImpl manejador;

  public ManejadorProxy(MapeadorDatosImpl mapeador, ManejadorImpl manejador) {
    this.mapeador = mapeador;
    this.manejador = manejador;
  }

  public String[] dameDatos() {
  	System.out.println("Se invocó el método dameDatos()");
  	return mapeador.dameDatos();
  }

  public boolean agrega(String dato) {
  	System.out.println("Se invocó el método agrega(String dato)");
    return manejador.agrega(dato);
  }

  public boolean borra(String dato) {
  	System.out.println("Se invocó el método borra(String dato)");
    return manejador.borra(dato);
  }

  public void finaliza(Observador o) {
    System.out.println("Se invocó el método finaliza(Observador o)");
    manejador.finaliza(o);
  }

  public boolean agregaObservador(Observador o) {
    System.out.println("Se invocó el método agregaObservador(Observador o)");
    return manejador.agregaObservador(o);
  }

  public boolean quitaObservador(Observador o) {
    System.out.println("Se invocó el método quitaObservador(Observador o)");
    return manejador.quitaObservador(o);
  }

  public void notifica() {
    System.out.println("Se invocó el método notifica()");
    manejador.notifica();
  }
}
