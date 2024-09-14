package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

import java.time.LocalDate;

public class IdadeValidator implements ValidacaoUsuario {

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {
        if (usuarioDTO.dataNascimento().getYear() - LocalDate.now().getYear() < 18) {
            return;
        }
        throw new DadosUsuarioInvalidosException("Deve ter pelo menos 1 nome e 1 sobrenome com pelo menos 1 letra em cada um.");
    }
}
