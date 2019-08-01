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
        ProjectRecord projectRecord = new ProjectRecord();
            while (rs.next()){
                projectRecord.projId=rs.getString("ProjectId");
                projectRecord.title=rs.getString("title");
                projectRecord.clientId=rs.getString("clientId");
                projectRecord.duration=rs.getInt("duration");
                projectRecord.rate=rs.getInt("rate");
                projectRecord.numberOfAllocationResources=rs.getInt("numberOfAllocationResource");
                projectRecord.type=rs.getString("type");

            }
            return projectRecord;
    }
}
