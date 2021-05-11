package mx.uam.is.practicadiseno.negocio;

import mx.uam.is.practicadiseno.vista.Ventana;

public interface Manejador {

	/**
	 * Recupera los datos
	 *
	 * @return la lista de datos
	 */
	public String[] dameDatos();

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 *
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato);

	/**
	 * Borra un dato de la list
	 *
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	public boolean borra(String dato);

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza(Observador o);

  // agregar un observador a la lista de observadores
  public boolean agregaObservador(Observador o);

  // quitar un observador de la lista de observadores
  public boolean quitaObservador(Observador o);

  // llamar actualiza() sobre todos los observadores
  public void notifica();
}
