package org.afpa.dal.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUD<T> {
    public void delete(int id) throws SQLException;
    public T find(int id) throws SQLException;
    public void insert(T object) throws SQLException;
    public ArrayList<T> list() throws SQLException;
    public void update(T object) throws SQLException;
}

