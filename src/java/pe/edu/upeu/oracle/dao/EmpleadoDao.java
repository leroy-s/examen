/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.oracle.dao;
import java.util.List;
import pe.edu.upeu.oracle.entity.Empleado;
/**
 *
 * @author lenovo
 */

public interface EmpleadoDao {
    public int createEmpleado(Empleado empleado);
    public int updateEmpleado(Empleado empleado);
    public int deleteEmpleado(int idEmpleado);
    public Empleado readEmpleado(int idEmpleado);
    public List<Empleado> readAllEmpleados();
    public boolean buscarEmpleado(String nombre);
}
