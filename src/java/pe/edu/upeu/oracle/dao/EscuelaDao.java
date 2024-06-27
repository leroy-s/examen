/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.oracle.dao;
import java.util.List;
import pe.edu.upeu.oracle.entity.Escuela;
/**
 *
 * @author lenovo
 */
public interface EscuelaDao {
    public int createEscuela(Escuela escuela);
    public int updateEscuela(Escuela escuela);
    public int deleteEscuela(int idEscuela);
    public Escuela readEscuela(int idEscuela);
    public List<Escuela> readAllEscuelas();
    public boolean buscarEscuela(String nombre);
}
