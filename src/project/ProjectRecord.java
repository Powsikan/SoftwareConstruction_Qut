package project;

import repository.DatabaseRepository;
import repository.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjectRecord {
    public String projId;
    public  String title;
    public String clientId;
    public int duration;
    public int rate;
    public int numberOfAllocationResources;
    public String type;

}
