/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.ParteCuerpo;

/**
 *
 * @author migue
 */
public interface IParteCuerpo {
    
    public void guardarParteCuerpo(ParteCuerpo parteCuerpo);
    public ParteCuerpo obtenerParteCuerpo(Integer id);
    public void actualizarParteCuerpo(ParteCuerpo parteCuerpo);
    public void eliminarParteCuerpo(ParteCuerpo parteCuerpo);
    public List<ParteCuerpo> obtenerParteCuerpo();
}
