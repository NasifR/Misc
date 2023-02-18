import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String fname = JOptionPane.showInputDialog("Please enter your first name:");
        String lname = JOptionPane.showInputDialog("Please enter your last name:");
        DateofBirth idob = new DateofBirth();


        String m = JOptionPane.showInputDialog("Enter your date of birth (Month)");
        int imonth;
        imonth = Integer.parseInt(m);

        idob.setMonth(imonth);

        String d = JOptionPane.showInputDialog("Enter your date of birth (Day)");
        int iday;
        iday = Integer.parseInt(d);
        idob.setDay(iday);

        String y  = JOptionPane.showInputDialog("Enter your date of birth (Year)");
        int iyear;
        iyear = Integer.parseInt(y);
        idob.setYear(iyear);

        HeartRates h1 = new HeartRates(fname, lname, idob);
        h1.setFirstName(fname);
        h1.setLastName(lname);

        JOptionPane.showMessageDialog(null, "Patient name: " + fname + " " + lname + "\n" + "Date of birth: " + m + "/" + d + "/" + y + "\n" + "Age: " + h1.ageCalculator() + "\n" + "Max heart rate: " + h1.maxHeartRate() + "\nTarget heart rate (max): " + h1.maxtargetHeartRate() + "\nTarget heart rate (min): " + h1.mintargetHeartRate());
        System.exit( 0 );



    }
}