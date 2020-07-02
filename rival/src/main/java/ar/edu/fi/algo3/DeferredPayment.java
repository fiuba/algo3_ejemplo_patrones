package ar.edu.fi.algo3;

public class DeferredPayment implements Rival {
    private final Integer amount;

    public DeferredPayment(Integer amount) {
        this.amount = amount;
    }


    @Override
    public Rival oust(Rival another) {
        return this;
    }

    @Override
    public void doIt(Object param) {
        Notification notif = (Notification)param;
        notif.send("Your product will be shipped as son as you pay ticket Nro.: NNNNNN");

    }
}
