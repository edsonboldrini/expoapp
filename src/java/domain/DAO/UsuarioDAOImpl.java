/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import com.expoapp.entity.Usuario;

/**
 *
 * @author edson
 */
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements UsuarioDAO{

    @Override
    public Usuario getById(int id) {
        return entityManager.find(Usuario.class, id);
    }

}
