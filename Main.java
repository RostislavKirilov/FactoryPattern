package bg.tu_varna.sit.а1.f21621571;

public class Main {
    public static void main(String args[]){

        SweetFactory factory = new SweetFactory();

        Sweet cake = factory.createSweet(SweetType.CAKE);
        System.out.println("Cake: " + cake.getDough() +
                " with " + cake.getFilling() +
                " filling, " + cake.getGlaze() +
                " glaze, " + cake.getSpongeCount() +
                " sponges and " + cake.getCream() + " cream.");

        Sweet doughnuts = factory.createSweet(SweetType.DOUGHNUTS);
        System.out.println("Doughnuts: "
                + doughnuts.getDough() + " with "
                + doughnuts.getFilling() + " filling, "
                + doughnuts.getGlaze() + " glaze, " + doughnuts.getSpongeCount() +
                " sponges and " + doughnuts.getCream() +
                " cream.");


        Sweet eclairs = factory.createSweet(SweetType.ECLAIRS);
        System.out.println("Eclairs: "
                + doughnuts.getDough() + " with "
                + doughnuts.getFilling() + " filling, "
                + doughnuts.getGlaze() + " glaze, " + doughnuts.getSpongeCount() +
                " sponges and " + doughnuts.getCream() +
                " cream.");

        Sweet gingerbread = factory.createSweet(SweetType.GINGERBREAD);
        System.out.println("Gingerbread: "
                + doughnuts.getDough() + " with "
                + doughnuts.getFilling() + " filling, "
                + doughnuts.getGlaze() + " glaze, " + doughnuts.getSpongeCount() +
                " sponges and " + doughnuts.getCream() +
                " cream.");

    }
}
