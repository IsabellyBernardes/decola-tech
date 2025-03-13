package org.example.domain.service;

import org.example.domain.model.Usuario;

public interface UsuarioService {
    Usuario findById(Long id);

    Usuario create(Usuario usuarioToCreate);
}
