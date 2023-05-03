package bg.tu_varna.sit.а1.f21621571;

public class Cake implements Sweet{
    @Override
    public String getDough() {
        return "Some cake";
    }

    @Override
    public String getFilling() {
        return "Choco cream";
    }

    @Override
    public String getGlaze() {
        return "Blue";
    }

    @Override
    public String getCream() {
        return "Whipped";
    }

    @Override
    public int getSpongeCount() {
        return 5;
    }
}
