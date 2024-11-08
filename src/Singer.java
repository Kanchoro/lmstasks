public class Singer extends Person {
    private String bandName;
    private String singing;
    private String playGitar;


    public Singer(String name, String designation, String learn, String walk, String eat, String bandName, String singing, String playGitar) {
        super(name, designation, learn, walk, eat);
        this.bandName = bandName;
        this.singing = singing;
        this.playGitar = playGitar;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getPlayGitar() {
        return playGitar;
    }

    public void setPlayGitar(String playGitar) {
        this.playGitar = playGitar;
    }

    public String getSinging() {
        return singing;
    }

    public void setSinging(String singing) {
        this.singing = singing;
    }

    @Override
    public String toString() {
        return String.format( super.toString()+"""
                Singer!       
                Band name      : %s
                Song           : %s
                Play gitar     : %s
                """,bandName,singing,playGitar);
    }
}
