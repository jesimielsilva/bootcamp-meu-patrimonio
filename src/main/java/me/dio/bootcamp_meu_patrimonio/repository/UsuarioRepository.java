package me.dio.bootcamp_meu_patrimonio.repository;

import me.dio.bootcamp_meu_patrimonio.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
