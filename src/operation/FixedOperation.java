package operation;

public class FixedOperation implements Operation {
  int rate;
  int duration;

    public FixedOperation(int rate, int duration) {
        this.rate = rate;
        this.duration = duration;
    }

    @Override
    public int calculateBill() {

        return duration*rate;
    }
}
