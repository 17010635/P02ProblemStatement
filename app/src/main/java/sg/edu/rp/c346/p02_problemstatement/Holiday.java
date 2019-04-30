package sg.edu.rp.c346.p02_problemstatement;

public class Holiday {
    private String holiday;
    private String date;
    private String icon;

    public Holiday(String holiday, String date, String image) {
        this.holiday = holiday;
        this.date = date;
        this.icon = image;
    }

    public String getHoliday() {
        return holiday;
    }

    public String getDate() {
        return date;
    }

    public String getIcon() {
        return icon;
    }
}
