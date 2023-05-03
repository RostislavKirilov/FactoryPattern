package bg.tu_varna.sit.а1.f21621571;

public class SweetFactory {
    public Sweet createSweet(SweetType type) {
        switch(type) {
            case CAKE:
                return new Cake();
            case DOUGHNUTS:
                return new Doughnuts();
            case ECLAIRS:
                return new Eclairs();
            case GINGERBREAD:
                return new Gingerbread();
            default:
                throw new IllegalArgumentException("Invalid sweet type: " + type);
        }
    }
}
