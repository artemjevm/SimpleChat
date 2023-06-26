package com.example.clientdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

import java.sql.Connection;

public class Controller implements TCPConnectionListener  {

    @FXML
    private TableView tableView;



    @FXML
    private void initialize(){

    }

    private void setupTableColumn(){

    }
    @Override
    public void onConnectionReady(TCPConnection tcpConnection) {

    }

    @Override
    public void onReceiveString(TCPConnection tcpConnection, String value) {

    }

    @Override
    public void onDisconnect(TCPConnection tcpConnection) {

    }

    @Override
    public void onException(TCPConnection tcpConnection, Exception e) {

    }

    public void onAddGroup(ActionEvent actionEvent) {
    }

    public void onDeleteGroup(ActionEvent actionEvent) {
    }

    public void onUpdateTable(ActionEvent actionEvent) {
        DAO_MYSQL_Group dao_mysql_group = new DAO_MYSQL_Group();
        Connection connection = dao_mysql_group.getConnection();
        dao_mysql_group.closeConnection(connection);
    }
}