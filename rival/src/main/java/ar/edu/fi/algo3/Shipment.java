package ar.edu.fi.algo3;

public class Shipment implements Rival {
    private final String msg;

    public Shipment(String msg) {
        this.msg = msg;
    }

    @Override
    public Rival oust(Rival another) {

        return this;
    }

    @Override
    public void doIt(Object param) {
        Notification notif = (Notification)param;
        notif.send(this.msg);
    }
}
