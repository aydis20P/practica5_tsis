package mx.uam.is.practicadiseno.negocio;

import java.util.ArrayList;
import java.util.List;
import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;

public class ManejadorImpl implements Manejador {

	// La instancia de MapeadorDatosImpl
	private MapeadorDatosImpl mapeador;

	/**
	 *
	 */
	public ManejadorImpl(MapeadorDatosImpl mapeador) {
    this.mapeador = mapeador;
	}

	/**
	 * Recupera los datos
	 *
	 * @return la lista de datos
	 */
	public String[] dameDatos() {
		return mapeador.dameDatos();
	}

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 *
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato) {
    return mapeador.agrega(dato);
	}

	/**
	 * Borra un dato de la list
	 *
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	public boolean borra(String dato) {
		return mapeador.borra(dato);
	}

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza() {
		System.exit(0);
	}
}
