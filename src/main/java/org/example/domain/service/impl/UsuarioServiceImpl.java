package org.example.domain.service.impl;

import org.example.domain.model.Usuario;
import org.example.domain.repository.UsuarioRepository;
import org.example.domain.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuarioToCreate) {
        if(usuarioToCreate.getId() != null && usuarioRepository.existsById(usuarioToCreate.getId())){
            throw new IllegalArgumentException("Esse usuário já existe");
        }
        return usuarioRepository.save(usuarioToCreate);
    }
}
