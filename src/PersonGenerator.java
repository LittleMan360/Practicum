import java.util.ArrayList;
import java.util.Scanner;

public class PersonGenerator
{
    public static void main(String[] args)
    {
        ArrayList<String> people = new ArrayList<>();
        Scanner in =new Scanner(System.in);

        boolean done = false;
        /*
        a. ID (a String)
        b. FirstName
        c. LastName
        d. Title (a string like Mr., Mrs., Ms., Dr., etc.)
        e. YearOfBirth (an int)
         */

        String personRec = "";
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        int YOB = 0;

        do {

            ID = SafeInput.getNonZeroLenString(in,"Enter the ID [6 digits]");
            firstName = SafeInput.getNonZeroLenString(in,"Enter the first name");
            lastName = SafeInput.getNonZeroLenString(in,"Enter the last name");
            title = SafeInput.getNonZeroLenString(in,"Enter the title");
            YOB = SafeInput.getRangedInt(in,"Enter the YOB: ", 1000, 9999);

            personRec = ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;

            people.add(personRec);

            done = SafeInput.getYNConfirm(in, "Are you done?" );
        }while(!done);

        for( String p: people)
            System.out.println(p);
    }
}