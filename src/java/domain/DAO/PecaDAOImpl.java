/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import com.expoapp.entity.Peca;

/**
 *
 * @author edson
 */
public class PecaDAOImpl extends GenericDAOImpl<Peca> implements PecaDAO{

    @Override
    public Peca getById(int id) {
        return entityManager.find(Peca.class, id);
    }

}
