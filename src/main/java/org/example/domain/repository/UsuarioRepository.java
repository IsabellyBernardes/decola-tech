package org.example.domain.repository;

import org.example.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {


    Usuario save(Usuario usuarioToCreate);
}
