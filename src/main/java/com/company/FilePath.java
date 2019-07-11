package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FilePath {

    public static void main(String args[]) throws IOException {
        int count =0;
        FileWriter fstream = null;
        try
        {
            //File file = new File("C:\\Users\\PNidadav\\Desktop\\Data\\JIRA's\\37180\\Missing Files.csv");
            File file = new File("C:\\Users\\PNidadav\\Desktop\\Data\\JIRA's\\37180\\MissingMetaDataFiles.csv");

            List<String> fname = Files.readAllLines(file.toPath());
            File file2 = new File("C:\\Users\\PNidadav\\Desktop\\Data\\JIRA's\\Filenames.csv");
            List<String> fpathList = Files.readAllLines(file2.toPath());
            File f = new File("C:\\Users\\PNidadav\\Desktop\\Data\\JIRA's\\37180\\outputMetaData.csv");

            fstream = new FileWriter(f);
            //System.out.println("Fname Size = " + fname.size());
            //System.out.println("fpathList Size = " + fpathList.size());

            BufferedWriter out = new BufferedWriter(fstream);
            for (String line : fname)
            {
            System.out.println("fname = "+line);
               // String [] array1 = line.split(",");
                for(String line2: fpathList ){
                    //System.out.println("fpathList = "+line2);
                    //String[] array2 = line2.split(",");
                   // System.out.println("File Path is: "+ array2[2]);
                    if(line2.contains(line))
                    {
                        //System.out.println(array1[0] + " is in the path "+ array2[2]);
                        String wri = line+","+line2;
                        //System.out.println(wri);
                        out.write(wri);
                        out.newLine();
                        count++;

                    }

                }
            }
        }
        catch (IOException e) {
            System.out.println("I reached here");
            e.printStackTrace();
        }
        finally{
        fstream.close();
        ///mnt/cifs/danube-p/cms-holding/EBC-ORIGINALS/moody/MoodyPublishers201707010101_P909044_Ebooks_ProQuestEbookCentral_onix21.xml

        }

       System.out.println(count);


    }
}
