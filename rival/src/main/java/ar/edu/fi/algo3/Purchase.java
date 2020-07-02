package ar.edu.fi.algo3;

public class Purchase {
    private final Shipment shipment;

    public Purchase(Shipment shipment) {

        this.shipment = shipment;
    }

    public Notification pay(Rival payment) {
        Notification notification = new Notification();

        Rival winner = payment.oust(this.shipment);
        winner.doIt( notification );

        return notification;
    }
}
