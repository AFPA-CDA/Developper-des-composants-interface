package org.afpa.dal.dao;

import org.afpa.dal.interfaces.CRUD;
import org.afpa.dal.models.Client;
import org.afpa.dal.shared.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * The Data Access Object for the Client model.
 *
 * @see org.afpa.dal.interfaces.CRUD<Client>
 * @see Client
 */
public final class ClientDAO implements CRUD<Client> {
    private final java.sql.Connection connection;

    /**
     * Primary constructor
     *
     * @throws SQLException If the connection cannot be established
     */
    public ClientDAO() throws SQLException {
        connection = new Connection().setUrl("jdbc:mysql://localhost:3306/hotel?serverTimezone=UTC").setPassword("10495").setUser("root").getConnection();
    }

    /**
     * Deletes a Client from the database
     *
     * @param id The id of the client to delete
     * @throws SQLException If the database encounters any errors
     */
    @Override
    public void delete(int id) throws SQLException {
        // Use a Prepared Statement to avoid SQL Injection
        PreparedStatement reservation = connection.prepareStatement("DELETE FROM reservation WHERE res_cli_id = ?");
        reservation.setInt(1, id);
        reservation.executeUpdate();
        reservation.close();

        // Use a Prepared Statement to avoid SQL Injection
        PreparedStatement client = connection.prepareStatement("DELETE from client WHERE id = ?");
        client.setInt(1, id);
        client.executeUpdate();
        client.close();
    }

    /**
     * Finds a Client from the database
     *
     * @param id The id of the client to find
     * @return The client if found else returns null
     * @throws SQLException If the database encounters any errors
     */
    @Override
    public Client find(int id) throws SQLException {
        // Creates a new empty Client object
        Client client = new Client();

        // Use a Prepared Statement to avoid SQL Injection
        PreparedStatement clientStatement = connection.prepareStatement("SELECT * FROM client WHERE cli_id = ?");
        clientStatement.setInt(1, id);

        // Executes the query and returns the result set
        ResultSet rs = clientStatement.executeQuery();

        // If there is a result
        if (rs.next()) {
            // Sets the data to the newly created client object
            client.setAddress(rs.getString("cli_adresse"));
            client.setCity(rs.getString("cli_ville"));
            client.setFirstName(rs.getString("cli_prenom"));
            client.setId(rs.getInt("cli_id"));
            client.setLastName(rs.getString("cli_nom"));
        }

        // Closes the connections to avoid memory leaks
        clientStatement.close();
        rs.close();

        // Returns the client or null
        return client;
    }

    /**
     * Inserts a client into the database
     *
     * @param client The client to insert into the database
     * @throws SQLException If the database encounters any errors
     */
    @Override
    public void insert(Client client) throws SQLException {
        // Use a Prepared Statement to avoid SQL Injection
        PreparedStatement ps = connection.prepareStatement("INSERT INTO client(cli_nom, cli_prenom, cli_adresse, cli_ville) VALUES (?,?,?,?)");
        ps.setString(1, client.getLastName());
        ps.setString(2, client.getFirstName());
        ps.setString(3, client.getAddress());
        ps.setString(4, client.getCity());

        // Inserts the record into the database
        ps.executeUpdate();

        // Closes the connection to prevent memory leaks
        ps.close();
    }

    /**
     * Returns the list of clients from the database
     *
     * @return The clients list
     * @throws SQLException If the database encounters any errors
     */
    @Override
    public ArrayList<Client> list() throws SQLException {
        // Initializes a new Client ArrayList
        ArrayList<Client> clients = new ArrayList<>();

        // Retrieves all the clients from the database
        ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM client");

        // While there is a result
        while (rs.next()) {
            // Sets the data to the newly created client object
            Client client = new Client();
            client.setAddress(rs.getString("cli_adresse"));
            client.setCity(rs.getString("cli_ville"));
            client.setFirstName(rs.getString("cli_prenom"));
            client.setId(rs.getInt("cli_id"));
            client.setLastName(rs.getString("cli_nom"));

            // Adds the client to the ArrayList of clients
            clients.add(client);
        }

        // Closes the connection to prevent memory leaks
        rs.close();

        // Returns the list of clients from the database
        return clients;
    }

    /**
     * Updates a client from the database
     *
     * @param client The client to update
     * @throws SQLException If the database encounters any errors
     */
    @Override
    public void update(Client client) throws SQLException {
        // Use a Prepared Statement to avoid SQL Injection
        PreparedStatement ps = connection.prepareStatement("UPDATE client SET cli_nom = ?, cli_prenom = ?, cli_adresse = ?, cli_ville = ? WHERE cli_id = ?");
        ps.setString(1, client.getLastName());
        ps.setString(2, client.getFirstName());
        ps.setString(3, client.getAddress());
        ps.setString(4, client.getCity());

        // Updates the record into the database
        ps.executeUpdate();

        // Closes the connection to prevent memory leaks
        ps.close();
    }
}
