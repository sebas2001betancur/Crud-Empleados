package com.crud.empleados.servicio;

import com.crud.empleados.entidad.Empleado;
import com.crud.empleados.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio  {

    @Autowired
    private EmpleadoRepositorio repositorio;
    @Override
    public List<Empleado> listarTodosLosEmpleados() {
        return repositorio.findAll();
    }

    @Override
    public Empleado GuardarEmpleado(Empleado empleado) {
        return repositorio.save(empleado);
    }

    @Override
    public Empleado ObtenerEmpleadoPoId(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Empleado ActualizarEmpleado(Empleado empleado) {
        return repositorio.save(empleado);
    }

    @Override
    public void eliminarEstudiante(Long id) {
        repositorio.deleteById(id);
    }
}
