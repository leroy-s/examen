/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.oracle.dao;
import java.util.List;
import pe.edu.upeu.oracle.entity.Privilegio;
/**
 *
 * @author lenovo
 */
public interface PrivilegioDao {
    public int createPrivilegio(Privilegio privilegio);
    public int updatePrivilegio(Privilegio privilegio);
    public int deletePrivilegio(int idPrivilegio);
    public Privilegio readPrivilegio(int idPrivilegio);
    public List<Privilegio> readAllPrivilegios();
    public boolean buscarPrivilegio(String nombre);
}
