import java.sql.*;

public class OrcamentoDao {


    public void insert(Orcamento orcamento) {
    try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/orcamento", "root", "Revolution1.0");
        Statement statement = connection.createStatement();
        statement.executeUpdate("insert into orcamento values (" + orcamento.getTotalHoras() + ", " + orcamento.getCustoFinal() + ");");
        connection.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    }
 }

