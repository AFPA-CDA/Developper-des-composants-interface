package org.afpa.interfaces;

import org.afpa.dal.models.Client;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ClientCRUD {
    public void delete(int id) throws SQLException;
    public Client find(int id) throws SQLException;
    public void insert(Client client) throws SQLException;
    public ArrayList<Client> list() throws SQLException;
    public void update(Client client) throws SQLException;
}

