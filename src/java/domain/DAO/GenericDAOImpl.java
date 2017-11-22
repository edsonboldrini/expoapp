/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import domain.util.Conexao;
import javax.persistence.*;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author 20151bsi0223
 */
public abstract class GenericDAOImpl<T> implements GenericDAO<T> 
{
    private static GenericDAOImpl instance;
    protected EntityManager entityManager;
    

    public GenericDAOImpl(){
        entityManager = Conexao.getEntityManager();
    }
    public void inserir(T obj) throws Exception
    {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(obj);
            entityManager.getTransaction().commit();
        }
        catch (Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    public void alterar (T obj) throws Exception
    {
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(obj);
            entityManager.getTransaction().commit();
        }
        catch (Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
}
