import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister
{
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String rec = "";

            try
            {
                File workingDirectory = new File(System.getProperty("user.dir"));
                chooser.setCurrentDirectory(workingDirectory);

                if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
                {
                    selectedFile = chooser.getSelectedFile();
                    Path file = selectedFile.toPath();
                    InputStream in = new BufferedInputStream(Files.newInputStream(file, CREATE));
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                    List<Object> shortWords;
                    ShortWordFilter shortWordFilter = new ShortWordFilter();
                    String line;
                    while ((line = reader.readLine()) != null)
                    {
                        String[] words = line.split("\\s+");
                        shortWords = Select.collectAll(words, shortWordFilter);

                        for (Object shortWord : shortWords)
                        {
                            System.out.println(shortWord);
                        }
                    }
                    reader.close();
                    System.out.println("\n\nData file read!");
                }
            }
            catch (FileNotFoundException e)
            {
                System.out.println("File not found!!!");
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
    }
}

