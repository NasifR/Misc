public class HeartRates {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String firstName;
    String lastName;
    DateofBirth DOB;

    public HeartRates(String firstName, String lastName, DateofBirth DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    public int ageCalculator(){
        int age;
        age = 2023 - DOB.year;
        return age;
    }

    public double maxHeartRate() {
        double maxrate;
        maxrate = 220 - ageCalculator();
        return maxrate;
    }

    public double maxtargetHeartRate() {
        double max;
        max = maxHeartRate() * 0.85;
        return max;
    }

    public double mintargetHeartRate() {
        double min;
        min = maxHeartRate() * 0.5;
        return min;
    }

}

class DateofBirth{
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    int day;
    int month;
    int year;
    public DateofBirth(){

    }

    public DateofBirth(int day, int month, int year) {
        if (day > 0 && day < 32 && month > 0 && month < 13 && year > 1900 && year < 2023) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

    }
}
