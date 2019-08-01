package operation;

public class OperationFactory {

    public Operation getInstance(String  type,int duration,int rate,int numberOfAllocationResource){

        Operation operation=null;
            if("Fixed".equals(type))
                operation=new FixedOperation(rate,duration);
             else if("variable".equals(type))
                operation=new VariableOperation(duration,rate,numberOfAllocationResource);

        return operation;
    }
}
