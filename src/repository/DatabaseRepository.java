package repository;

import project.ProjectRecord;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseRepository implements Repository {

    @Override
    public ProjectRecord read(String id) throws SQLException {
        DbConnection connection=new DbConnection();
        Connection con=connection.getConnection();
        ResultSet rs;
        Statement s=con.createStatement();
        String query = "select * from project where projectId='"+id+"'";
        rs= s.executeQuery(query);
        ProjectRecord pr = new ProjectRecord();
            while (rs.next()){
                pr.projId=rs.getString("ProjectId");
                pr.title=rs.getString("title");
                pr.clientId=rs.getString("clientId");
                pr.duration=rs.getInt("duration");
                pr.rate=rs.getInt("rate");
                pr.numberOfAllocationResources=rs.getInt("numberOfAllocationResource");
                pr.type=rs.getString("type");

            }
            return pr;
    }
}
