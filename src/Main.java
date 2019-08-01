import input.CMDLineInput;
import input.Inputs;
import operation.Operation;
import operation.OperationFactory;
import project.ProjectRecord;
import repository.DatabaseRepository;
import repository.Repository;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
         Inputs input=new CMDLineInput(args);



        Repository repository=new DatabaseRepository();
        ProjectRecord projectRecord = repository.read(input.read());
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.getInstance(projectRecord.type,projectRecord.duration,projectRecord.rate,projectRecord.numberOfAllocationResources);
        int cost = operation.calculateBill();
        System.out.println("cost is:"+cost);
    }
}
