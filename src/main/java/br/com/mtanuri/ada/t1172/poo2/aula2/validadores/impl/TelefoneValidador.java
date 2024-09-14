package br.com.mtanuri.ada.t1172.poo2.aula2.validadores.impl;

import br.com.mtanuri.ada.t1172.poo2.aula2.user.DadosUsuarioInvalidosException;
import br.com.mtanuri.ada.t1172.poo2.aula2.user.UsuarioDTO;
import br.com.mtanuri.ada.t1172.poo2.aula2.validadores.ValidacaoUsuario;

public class TelefoneValidador implements ValidacaoUsuario {

    @Override
    public void validar(UsuarioDTO usuarioDTO) throws DadosUsuarioInvalidosException {
        String telefoneString = usuarioDTO.telefone();
        if (usuarioDTO.pais().toUpperCase().equals("BRASIL")) {
            if (!telefoneString.matches("^\\+55\\s\\d{2}\\s9\\d{4}-\\d{4}$")) {
                throw new DadosUsuarioInvalidosException("O formato de telefone é inválido");
            }
        }
    }
}
