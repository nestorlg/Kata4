/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author usuario
 */
public class Kata4 {
    public static void main (String[] arg) throws FileNotFoundException, IOException {
        String filename = "emailsfile.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay<String> histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
