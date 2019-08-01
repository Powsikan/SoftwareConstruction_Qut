package input;

public class CMDLineInput implements Inputs {
    private String arguments[];

    public CMDLineInput (String args[]){
        this.arguments = args;
    }
    @Override
    public String read() {
        return arguments[0];
    }
}
