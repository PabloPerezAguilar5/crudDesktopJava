package pablo.tareas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import pablo.tareas.modelo.Tarea;

public interface TareasRepositorio extends JpaRepository<Tarea, Integer>{

}
