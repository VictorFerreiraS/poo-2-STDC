package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

import java.time.LocalDate;

public class CPFValidador implements ValidacaoUsuario {

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {
        if ("Brasil".equalsIgnoreCase(usuarioDTO.pais())) {
            String cpf = usuarioDTO.documento();
            if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                throw new DadosUsuarioInvalidosException("O CPF é inválido.");
            }
        }
    }
}
