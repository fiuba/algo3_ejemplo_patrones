package ar.edu.fi.algo3;

public class Notification {
    private String msg;

    public Notification(String msg) {
        this.msg = msg;
    }

    public Notification() {
        this.msg = "<blank>";
    }

    public void send(String s) {
        this.msg = s;
    }

    @Override
    public boolean equals(Object another) {
        if ( !another.getClass().equals(this.getClass())) {
            return false;
        }

        Notification notif = (Notification) another;

        return notif.msg.equals(this.msg);
    }
}
