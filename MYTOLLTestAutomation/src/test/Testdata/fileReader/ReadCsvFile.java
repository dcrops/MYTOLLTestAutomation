package fileReader;
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.*;

public class ReadCsvFile {

    public static void main(String[] args) {
        try {

            CsvReader testcases = new CsvReader("src\\test\\Testdata\\cutofftime.csv");

            testcases.readHeaders();
            //get total numbers of header column
           int numberOfHeaders=testcases.getHeaderCount();
            //print header column
            for(int i=0;i<numberOfHeaders;i++)
            {
                System.out.print(testcases.getHeader(i)+",  ");
            }
            System.out.println();
            while (testcases.readRecord())
            {
                String CarrierCode = testcases.get("carrier_code");
                String ServiceCode = testcases.get("service_code");
                String Country = testcases.get("country_code");
                String State = testcases.get("state");
                String PostCode = testcases.get("postcode");
                String CutOffTime = testcases.get("cut_off_time");
                String Suburb = testcases.get("locality");
                 // output file content
                System.out.println(CarrierCode +",   " + ServiceCode +",    " + Country +",  " + State +",    " + PostCode +",   " + CutOffTime+",   "+Suburb);
            }

            testcases.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}