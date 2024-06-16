package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException;

    public void save(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException;
    public void update(String description, BigDecimal unitPrice, int qtyOnHand, String code) throws SQLException, ClassNotFoundException ;

    public void delete(String code) throws SQLException, ClassNotFoundException;

    public  boolean getExitItemCode(String code) throws SQLException, ClassNotFoundException;

    public String getNextId() throws SQLException, ClassNotFoundException;
}
