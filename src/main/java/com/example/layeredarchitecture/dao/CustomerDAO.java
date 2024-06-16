package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {

    public ArrayList<CustomerDTO> loadAllCostomers() throws SQLException, ClassNotFoundException ;

    public void save(String id, String name, String address) throws SQLException, ClassNotFoundException;

    public void delete(String id) throws SQLException, ClassNotFoundException;

    public void update(String name, String address, String id) throws SQLException, ClassNotFoundException;

    public boolean IsExist(String id) throws SQLException, ClassNotFoundException;

    public String getNextId() throws SQLException, ClassNotFoundException;
}
