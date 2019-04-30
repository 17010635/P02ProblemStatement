package sg.edu.rp.c346.p02_problemstatement;

public class Holiday {
    private String holiday;
    private String date;
    private boolean icon;
    public Holiday(String holiday,String date, boolean image){
        this.holiday = holiday;
        this.icon = image;
    }
    public String getHoliday(){
        return holiday;
    }
    public boolean isImage(){
        return icon;
    }

    public String getDate() {
        return date;
    }

    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }
}
