/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author phandungtri
 */
public interface DAO_Interface<T> {
    public ArrayList<T> getAll();
    public T get(String id);
    public void update(T object);
    public void delete(String id) throws SQLException, ClassNotFoundException ;
}
