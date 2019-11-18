package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

import java.sql.*;


public class TrainQuery {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:\\Users\\Lars\\Documents\\SQLtest\\train.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public ObservableList cityNamesLIST (){
        String sql = "SELECT id, city name FROM city;";
        ObservableList<String> listOfCities = FXCollections.observableArrayList();

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            while (rs.next()) {
            listOfCities.add(rs.getString("name"));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(listOfCities);

        return listOfCities;
    }

    public static void main(String[] args) {
        TrainQuery app = new TrainQuery();
       // app.selectAll();
    }

}