package pe.edu.upeu.syspasteleriadulcesitofx.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syspasteleriadulcesitofx.modelo.Categoria;

@Repository
public interface
CategoriaRepository extends JpaRepository<Categoria, Long> {
}
