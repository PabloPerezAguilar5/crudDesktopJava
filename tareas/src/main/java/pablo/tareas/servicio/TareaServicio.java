package pablo.tareas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pablo.tareas.modelo.Tarea;
import pablo.tareas.repositorio.TareasRepositorio;
@Service
public class TareaServicio implements ITareaServicio {

    @Autowired
    private TareasRepositorio tareasRepositorio;

    @Override
    public List<Tarea> listarTareas() {
        return tareasRepositorio.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
        Tarea tarea = tareasRepositorio.findById(idTarea).orElse(null);
        return tarea;
    }

    @Override
    public void guardarTarea(Tarea tarea) {
        tareasRepositorio.save(tarea);
    }

    @Override
    public void eliminarTarea(Tarea tarea) {
        tareasRepositorio.delete(tarea);
    }

}
