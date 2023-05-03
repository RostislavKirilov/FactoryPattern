package bg.tu_varna.sit.а1.f21621571;

public class Doughnuts implements Sweet {
    @Override
    public String getDough() {
        return "Five";
    }

    @Override
    public String getFilling() {
        return "Nice";
    }

    @Override
    public String getGlaze() {
        return "Orange";
    }

    @Override
    public String getCream() {
        return "Pineapple";
    }

    @Override
    public int getSpongeCount() {
        return 7;
    }
}
