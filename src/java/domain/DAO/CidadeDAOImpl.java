/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import com.expoapp.entity.Cidade;
import java.util.List;

/**
 *
 * @author edson
 */

public class CidadeDAOImpl extends GenericDAOImpl<Cidade> implements CidadeDAO{

    @Override
    public Cidade getById(int id) {
        return entityManager.find(Cidade.class, id);
    }
    
    }
