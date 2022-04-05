package com.crud.empleados.entidad;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false,length = 50)
    private String nombre;

    @Column(name = "apellido", nullable = false,length = 50)
    private String apellido;

    @Column(name = "ocupacion", nullable = false, length = 50)
    private String ocupacion;

    @Column(name = "edad", nullable = false, length = 50)
    private int edad;

    @Column(name = "correo", nullable = false, length = 50)
    private String correo;

    @Column(name = "ciudad", nullable = false, length = 50)
    private String ciudad;

    public Empleado(Long id, String nombre, String apellido, String ocupacion, int edad, String correo, String ciudad) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.correo = correo;
        this.ciudad = ciudad;
    }

    public Empleado() {

    }

    public Empleado(String nombre, String apellido, String ocupacion, int edad, String correo, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.correo = correo;
        this.ciudad = ciudad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

}
