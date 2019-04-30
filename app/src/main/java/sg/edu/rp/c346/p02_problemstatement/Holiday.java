package sg.edu.rp.c346.p02_problemstatement;

public class Holiday {
    private String holiday;
    private boolean icon;
    public Holiday(String holiday, boolean image){
        this.holiday = holiday;
        this.icon = image;
    }
    public String getHoliday(){
        return holiday;
    }
    public boolean isImage(){
        return icon;
    }
}
