/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.impl.EjercicioDao;
import dao.impl.EspecialistaDao;
import dao.impl.GrupoDeportivoDao;
import dao.impl.ParteCuerpoDao;
import dao.impl.RegistroDao;
import dao.impl.RutinaDao;
import dao.impl.TipoEjercicioDao;
import java.util.List;
import java.util.Optional;
import modelo.Ejercicio;
import modelo.Especialista;
import modelo.GrupoDeportivo;
import modelo.ParteCuerpo;
import modelo.Registro;
import modelo.Rutina;
import modelo.RutinaId;
import modelo.TipoEjercicio;

/**
 *
 * @author migue
 */
public class RutinasController {
    
    private EspecialistaDao especialistaDao;
    private RegistroDao registroDao;
    private TipoEjercicioDao tipoEjercicioDao;
    private EjercicioDao ejercicioDao;
    private GrupoDeportivoDao grupoDeportivoDao;
    private ParteCuerpoDao parteCuerpoDao;
    private RutinaDao rutinaDao;

    public RutinasController() {
        especialistaDao = new EspecialistaDao();
        registroDao = new RegistroDao();
        tipoEjercicioDao = new TipoEjercicioDao();
        ejercicioDao = new EjercicioDao();
        grupoDeportivoDao = new GrupoDeportivoDao();
        parteCuerpoDao = new ParteCuerpoDao();
        rutinaDao = new RutinaDao();
    }
    
    public void guardarEspecialista(Especialista  especialista){
        especialistaDao.guardarEspecialista(especialista);
    }
    public Especialista obtenerEspecilalista(Integer id){
        return especialistaDao.obtenerEspecialista(id);
    }
    public void actualizarEspecilalista(Especialista especialista){
        especialistaDao.actualizarEspecialista(especialista);
    }
    public void eliminarEspecilalista(Especialista especialista){
        especialistaDao.eliminarEspecialista(especialista);
    }
    public List<Especialista> obtenerEspecialistas(){
        return  especialistaDao.obtenerEspecialistas();
    }
    
    
    //Registro
    
     public void guardarRegistro(Registro  registro){
        registroDao.guardarRegistro(registro);
    }
    public Registro obtenerRegistro(Integer id){
        return registroDao.obtenerRegistro(id);
    }
    public void actualizarRegistro(Registro registro){
        registroDao.actualizarRegistro(registro);
    }
    public void eliminarResgistro(Registro registro){
        registroDao.eliminarRegistro(registro);
    }
    public List<Registro> obtenerRegistro(){
        return registroDao.obtenerRegistro();
    }
    
    
     //Tipo Ejercicio
    
     public void guardarTipoEjercicio(TipoEjercicio  tipoEjercicio){
        tipoEjercicioDao.guardarTipoEjercicio(tipoEjercicio);
    }
    public TipoEjercicio obtenerTipoEjercicio(short id){
        return tipoEjercicioDao.ObtenerTipoEjercicio(id);
    }
    public void actualizarTipoEjercicio(TipoEjercicio tipoEjercicio){
        tipoEjercicioDao.actualizarTipoEjercicio(tipoEjercicio);
    }
    public void eliminarTipoEjercicio(TipoEjercicio tipoEjercicio){
        tipoEjercicioDao.eliminarTipoEjercicio(tipoEjercicio);
    }
    public List<TipoEjercicio> listarTiposEjercicio(){
        return tipoEjercicioDao.listarTiposEjercicio();
    }
    
     // Ejercicio
    
     public void guardarEjercicio(Ejercicio  ejercicio){
        ejercicioDao.guardarEjercicio(ejercicio);
    }
    public Ejercicio obtenerEjercicio(Integer id){
        return ejercicioDao.obtenerEjercicio(id);
    }
    public void actualizarEjercicio(Ejercicio ejercicio){
        ejercicioDao.actualizarEjercicio(ejercicio);
    }
    public void eliminarEjercicio(Ejercicio ejercicio){
        ejercicioDao.eliminarEjercicio(ejercicio);
    }
    public List<Ejercicio> obtenerEjercicios(){
        return ejercicioDao.obtenerEjercicios();
    }
    
    //Grupo deportivo
    
    public void guardarGrupoDeportivo(GrupoDeportivo grupoDeportivo){
        grupoDeportivoDao.guardarGrupoDeportivo(grupoDeportivo);
    }
    public GrupoDeportivo obtenerGrupoDeportivo(Integer id){
        return grupoDeportivoDao.obtenerGrupoDeportivo(id);
    }
    public void actualizarGrupoDeportivo(GrupoDeportivo grupoDeportivo){
        grupoDeportivoDao.actualizarGrupoDeportivo(grupoDeportivo);
    }
    public void eliminarGrupoDeportivo(GrupoDeportivo grupoDeportivo){
        grupoDeportivoDao.eliminarGrupoDeportivo(grupoDeportivo);
    }
    public List<GrupoDeportivo> obtenerGrupoDeportivos(){
        return grupoDeportivoDao.obtenerGrupoDeportivos();
    }
    
    // Parte cuerpo
    
    public void guardarParteCuerpo(ParteCuerpo parteCuerpo){
        parteCuerpoDao.guardarParteCuerpo(parteCuerpo);
    }
    public ParteCuerpo obtenerParteCuerpo(Integer id){
        return parteCuerpoDao.obtenerParteCuerpo(id);
    }
    public void actualizarParteCuerpo(ParteCuerpo parteCuerpo){
        parteCuerpoDao.actualizarParteCuerpo(parteCuerpo);
    }
    public void eliminarParteCuerpo(ParteCuerpo parteCuerpo){
        parteCuerpoDao.eliminarParteCuerpo(parteCuerpo);
    }
    public List<ParteCuerpo> obtenerParteCuerpo(){
        return parteCuerpoDao.obtenerParteCuerpo();
    }
    
    //Rutina
    public void guardarRutina(Rutina rutina){
        rutinaDao.guardarRutina(rutina);
    }
    public Rutina ObtenerRutina(RutinaId  id){
        return rutinaDao.ObtenerRutina(id);
    }
    public void actualizarRutina(Rutina rutina){
        rutinaDao.actualizarRutina(rutina);
    }
    public void eliminarRutina(Rutina rutina){
        rutinaDao.eliminarRutina(rutina);
    }
    public List<Rutina> listarRutinas(){
        return rutinaDao.listarRutinas();
    }
    
}
