
package modelo;


public class Persona {
 int id;
 String nombre;
 String correo;
 String tel;
 
    
 public Persona (){

 }   
 public Persona(int id, String nombre,String correo, String tel){
 this.id=id;
 this.nombre=nombre;
 this.correo=correo;
 this.tel=tel;
 
 }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
