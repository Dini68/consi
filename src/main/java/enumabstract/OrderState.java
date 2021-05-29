package enumabstract;

public enum OrderState implements Deletable{

    NEW, CONFIRMED, PREPARED,
    ONBOARD, DELIVERED, RETURNED, DELETED;



    @Override
    public boolean canDelete() {
        return this == NEW || this == CONFIRMED || this == PREPARED;
    }
}
