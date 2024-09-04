package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private String databaseName;
    private String connectionName;

    public BookDaoImpl(String databaseName, String connectionName) {
        this.databaseName = databaseName;
        this.connectionName = connectionName;
    }

    public void save() {
        System.out.println("bool dao save..." + this.databaseName + "," + this.connectionName);
    }
}
