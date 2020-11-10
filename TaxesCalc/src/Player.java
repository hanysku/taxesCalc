class Player {
    private int Ranga;
    private String Gracz;
    private String RangaGildi;
    private int Ilość;



    Player(int ranga, String gracz, String rangaGildi, int ilość) {
        this.Ranga = ranga;
        this.Gracz = gracz;
        this.RangaGildi = rangaGildi;
        this.Ilość = ilość;

    }

    public int getRanga() {
        return Ranga;
    }

    public void setRanga(int ranga) {
        Ranga = ranga;
    }

    public String getGracz() {
        return Gracz;
    }

    public void setGracz(String gracz) {
        Gracz = gracz;
    }

    public String getRangaGildi() {
        return RangaGildi;
    }

    public void setRangaGildi(String rangaGildi) {
        RangaGildi = rangaGildi;
    }

    public int getIlość() {
        return Ilość;
    }

    public void setIlość(int ilość) {
        Ilość = ilość;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Ranga='" + Ranga + '\'' +
                ", Gracz='" + Gracz + '\'' +
                ", RangaGildi='" + RangaGildi + '\'' +
                ", Ilość='" + Ilość + '\'' +
                '}';
    }
}
