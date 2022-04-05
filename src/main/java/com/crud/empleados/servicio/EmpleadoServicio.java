package com.crud.empleados.servicio;

import com.crud.empleados.entidad.Empleado;

import java.util.List;

public interface EmpleadoServicio {

    public List<Empleado> listarTodosLosEmpleados();

    public Empleado GuardarEmpleado(Empleado empleado);

    public Empleado ObtenerEmpleadoPoId(Long id);

    public Empleado ActualizarEmpleado(Empleado empleado);

    public void eliminarEstudiante(Long id);
}
