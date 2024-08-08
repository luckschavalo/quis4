package quis4;

import javax.swing.JOptionPane;

public class preguntar {
private final alamacenar preguntas [] = new alamacenar[10];
    private int x;
public void agregar (){
int ask;
    for (int i = 0; i < 10; i++) {
        alamacenar nota = new alamacenar();
          nota.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre:"));
          nota.setCurso(JOptionPane.showInputDialog(null, "Digite el nombre del curso:"));
          nota.setProfesor(JOptionPane.showInputDialog(null, "Digite el nombre del profesor:"));
          nota.setCalificacion(JOptionPane.showInputDialog(null, "Digite la calificacion:"));
          preguntas[x]=nota;     //se usa un for para preguntarle a 10 veces
    }
}
public void mostrar(){
 alamacenar note [] = new alamacenar();
}    
}
