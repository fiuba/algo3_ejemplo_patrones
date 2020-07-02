package ar.edu.fi.algo3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class UseCases {
    @Test
    public void testUserBuysItemPayingWithOnlinePaymentAndItsShipped() {
        Purchase p = new Purchase( new Shipment( "Delivery date dd/mm/yyyy at hh:MM"));

        Notification actual = p.pay( new OnlinePayment(1000 /* payment amount */));
        Notification expected = new Notification("Delivery date dd/mm/yyyy at hh:MM");

        assertEquals(expected, actual);
    }

    @Test public void testUserBuysItemPayingWithDeferredPaymentAndItsShipped() {
        Purchase p = new Purchase( new Shipment( "Delivery date dd/mm/yyyy at hh:MM"));

        Notification actual = p.pay( new DeferredPayment(1000 /* payment amount */));
        Notification expected = new Notification("Your product will be shipped as son as you pay ticket Nro.: NNNNNN");

        assertEquals(expected, actual);
    }

    @Test public void testOnlinePaymentVsShipmentAndViceVersaAreEquivalents() {
        Rival shipment = new Shipment("not important");
        Rival visa = new OnlinePayment(1000);

        Rival expected = shipment;

        assertSame(expected, visa.oust(shipment));
        assertSame(expected, shipment.oust(visa));
    }
}
