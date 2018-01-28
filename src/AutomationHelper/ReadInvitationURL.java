package AutomationHelper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadInvitationURL
{
    public static String GetInvitationUrl() throws IOException
    {
        String readLine = "";
        try
        {
            File f = new File("src/InvitationURL.txt");
            BufferedReader b = new BufferedReader(new FileReader(f));
            while ((readLine = b.readLine()) != null)
            {
                System.out.println(readLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readLine;
    }
}
