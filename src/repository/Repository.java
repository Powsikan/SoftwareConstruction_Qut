package repository;

import project.ProjectRecord;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Repository {

    ProjectRecord read(String id) throws SQLException;
}
