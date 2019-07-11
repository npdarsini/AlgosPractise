package com.company;


import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FileTransfer {

    // Read the list of files, ad pass it to one method to copy these files.

    public static void main(String[] args) throws IOException {

         File file = new File("C:\\Users\\PNidadav\\Desktop\\Data\\JIRA's\\37180\\outputMetaData.csv");
        //File file = new File("C:\\Users\\PNidadav\\Desktop\\DummyFileNames.csv");
        List<String> lines = Files.readAllLines(file.toPath());
        int count =0;
        for (String line : lines) {
            String[] array = line.split(",");
            String array2[] = array[1].split("/");
            String filename = array2[array2.length - 1];
            String dummy = "/mnt/cifs/danube-p/cms-holding/";
            int length = dummy.length();
            String st = "Z:\\" + array[1].substring(length);
            st = st.replace('/', '\\');
            //System.out.println(st);
            //System.out.println(filename);

            Path movefrom = FileSystems.getDefault().getPath(st);
            String destination = "C:\\Users\\PNidadav\\Desktop\\Priya\\MoveTo\\MetaData\\";
            String destFilePath = destination+array[1].substring(length);

            File destFile = new File(destination+array[1].substring(length));
            destFile.mkdirs();

            Path target = FileSystems.getDefault().getPath(destFilePath + "\\"+filename);

            System.out.println("Copying from "+movefrom + " to the location "+ target);
            try {
                Files.copy(movefrom, target, StandardCopyOption.REPLACE_EXISTING);
                count++;


            } catch (IOException e) {
                System.err.println(e);
            }


        }

        System.out.println(count+ " files copied");
    }
}
