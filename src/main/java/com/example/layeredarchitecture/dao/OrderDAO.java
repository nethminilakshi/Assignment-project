package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;

import java.sql.*;
import java.time.LocalDate;

public interface OrderDAO {
    public String getNewId() throws SQLException, ClassNotFoundException;


    public PreparedStatement saveOrders(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException ;

    public void getOrderId(String orderId) throws SQLException, ClassNotFoundException ;
}
