package ar.edu.fi.algo3;

public class OnlinePayment implements Rival {
    private final Integer amount;

    public OnlinePayment(Integer amount) {
        this.amount = amount;
    }

    @Override
    public Rival oust(Rival another) {
        return another;
    }

    public void doIt(Object notif) {
        // do nothing at all
    }
}
