public class alamacenar {    
private String nombre;
private String curso;
private String profesor;
private String calificacion; 
//se crean las clases 
    public alamacenar(String nombre, String curso, String profesor, String calificacion) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = calificacion;
    }
//constructores 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
}
//set and get 