package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SftpWrite {
    static String PATHSEPARATOR = "/";

    /**
     * @param args
     */
    public static void main(String[] args) {
        String filename = new SimpleDateFormat("yyyyMMddHHmm'.xml'").format(new Date());
        String SFTPWORKINGDIR = "//mnt/cifs/danube-t/cmsfeed-deltas/EBC/"; // Source Directory on SFTP server
        String LOCALDIRECTORY = "C://Users/PNidadav/Desktop/Priya/Export/sample.xml"; // Local Target Directory
//        Session session = null;
//        ChannelSftp channel = null;
//        JSch jsch = new JSch();
//        jsch.addIdentity(ftpConfig.getKeyLocation(), ftpConfig.getPassword());
//        session = jsch.getSession(ftpConfig.getUser(), ftpConfig.getHost(), 22);
//        session.setConfig("StrictHostKeyChecking", "no");
//        session.setTimeout(15000);
//        session.connect();
//        channel = (ChannelSftp) session.openChannel("sftp");
//        channel.connect();
//
//        System.out.println(session.isConnected());
//        System.out.println(channel.pwd());
//        channel.cd("..");
//        channel.cd("..");
//        System.out.println(channel.pwd());
//        channel.cd(ftpConfig.getRemoteDir());
//        File f = new File(LOCALDIRECTORY);
//        System.out.println(f.getName());
//        channel.cd("/mnt/");
//        System.out.println(channel.pwd());
//        channel.cd("cifs/");
//        System.out.println(channel.pwd());
//        channel.cd("danube-t/");
//        System.out.println(channel.pwd());
//        channel.cd("cmsfeed-deltas/");
////                System.out.println(channel.pwd());
////                channel.cd("EBC/");
//        System.out.println(channel.pwd());
//        channel.mkdir("Sample");
//
//        channel.put(new FileInputStream(f), ftpConfig.getRemoteDir());
//
//
//        //recursiveFolderUpload(LOCALDIRECTORY, SFTPWORKINGDIR, channel);
//        //channel.cd(ftpConfig.getRemoteDir());
//        //String fileName = new SimpleDateFormat("yyyyMMddHHmm'.xml'").format(new Date());
//        //Files.write(Paths.get(fileName), x.getBytes(Charset.forName("UTF-8")), StandardOpenOption.CREATE_NEW, StandardOpenOption.TRUNCATE_EXISTING);
//
//        channel.disconnect();
//        session.disconnect();
//
//    } catch (Exception ex) {
//        ex.printStackTrace();
//    }

    }

    /**
     * This method is called recursively to Upload the local folder content to
     * SFTP server
     */
   // private static void recursiveFolderUpload(String sourcePath, String destinationPath) throws SftpException, FileNotFoundException {

//        File sourceFile = new File(sourcePath);
//        if (sourceFile.isFile()) {
//
//            // copy if it is a file
//            channelSftp.cd(destinationPath);
//            if (!sourceFile.getName().startsWith("."))
//                channelSftp.put(new FileInputStream(sourceFile), sourceFile.getName(), ChannelSftp.OVERWRITE);
//
//        } else {
//
//            System.out.println("inside else " + sourceFile.getName());
//            File[] files = sourceFile.listFiles();
//
//            if (files != null && !sourceFile.getName().startsWith(".")) {
//
//                channelSftp.cd(destinationPath);
//                SftpATTRS attrs = null;
//
//                // check if the directory is already existing
//                try {
//                    attrs = channelSftp.stat(destinationPath + "/" + sourceFile.getName());
//                } catch (Exception e) {
//                    System.out.println(destinationPath + "/" + sourceFile.getName() + " not found");
//                }
//
//                // else create a directory
//                if (attrs != null) {
//                    System.out.println("Directory exists IsDir=" + attrs.isDir());
//                } else {
//                    System.out.println("Creating dir " + sourceFile.getName());
//                    channelSftp.mkdir(sourceFile.getName());
//                }
//
//                for (File f : files) {
//                    recursiveFolderUpload(f.getAbsolutePath(), destinationPath + "/" + sourceFile.getName());
//                }
//
//            }
//        }
//
//    }

    }
//}
