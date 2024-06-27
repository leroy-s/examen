/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.oracle.dao;
import java.util.List;
import pe.edu.upeu.oracle.entity.Rol;
/**
 *
 * @author lenovo
 */
public interface RolDao {
    public int createRol(Rol rol);
    public int updateRol(Rol rol);
    public int deleteRol(int id);
    public Rol readRol(int id);
    public List<Rol> readAllRol();
}
