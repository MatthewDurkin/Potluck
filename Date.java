public class Date {
    private int month;
    private int day;
    private int s_time;
    private int e_time;
    private boolean allday;

    public Date(int month, int day, int s_time, int e_time, boolean allday){

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if( day > 0 && day <= 31) {
                    this.month = month;
                    this.day = day;
                    break;
                }
                else {
                    System.out.println("Error in creating object Date: integer for day must be between 1 and 31 for month input.")
                    //throw exeption
                    break;
                }
            case 2:
                if( day > 0 && day <= 28) {
                    this.month = month;
                    this.day = day;
                    break;
                }
                else {
                    System.out.println("Error in creating object Date: integer for day must be between 1 and 28 for feb.")
                    //throw exeption
                    break;
                }
            case 4: case 6: case 9: case 11:
                if( day > 0 && day <= 30) {
                    this.month = month;
                    this.day = day;
                    break;
                }
                else {
                    System.out.println("Error in creating object Date: integer for day must be between 1 and 30 for month input.")
                    //throw exeption
                    break;
                }
            default:
                System.out.println("Error in creating object Date: integer for month must be between 1 and 12.")
                //throw exeption
                break;
        }
        if (allday){
            this.allday = allday;
        }
        else {
            if (s_time <= e_time) {
                this.s_time = s_time;
                this.e_time = e_time;
            }
        }
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getS_time() {
        return s_time;
    }

    public int getE_time() {
        return e_time;
    }

    public boolean isAllday() {
        return allday;
    }
}