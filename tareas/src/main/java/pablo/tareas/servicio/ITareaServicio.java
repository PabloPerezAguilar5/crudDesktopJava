package pablo.tareas.servicio;

import java.util.List;

import pablo.tareas.modelo.Tarea;

public interface ITareaServicio {
    public List<Tarea> listarTareas();

    public Tarea buscarTareaPorId(Integer idTarea);

    public void guardarTarea(Tarea tarea);

    public void eliminarTarea(Tarea tarea);

}
