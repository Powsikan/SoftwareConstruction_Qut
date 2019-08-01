package operation;

public class VariableOperation implements  Operation {
    int duration;
    int rate;
    int numberOfAllocationResources;

    public VariableOperation(int duration, int rate, int numberOfAllocationResources) {
        this.duration = duration;
        this.rate = rate;
        this.numberOfAllocationResources = numberOfAllocationResources;
    }

    @Override
    public int calculateBill() {

        return duration*rate*numberOfAllocationResources;
    }
}
