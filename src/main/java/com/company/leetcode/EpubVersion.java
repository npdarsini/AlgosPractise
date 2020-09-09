//package com.company;
//
//import nl.siegmann.epublib.domain.Book;
//import nl.siegmann.epublib.domain.Resource;
//import nl.siegmann.epublib.epub.EpubReader;
//import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.xml.sax.InputSource;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.*;
//import java.nio.charset.Charset;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class EpubVersion {
//
//    public static List<String> failedFilePaths = new ArrayList();
//
//    public static void main(String args[]) {
//        //String filePath = "C:/Users/PNidadav/Desktop/Priya Exp/EpubData exp/inputs/filePath2.txt";
//        String outputPath = "C:/Users/PNidadav/Desktop/Priya Exp/EpubData exp/outputs/";
//
//        List<String> fileNameList4 = new ArrayList<>(Arrays.asList(
//                "C:/Users/PNidadav/Desktop/Priya Exp/EpubData exp/inputs/file14.txt"));
//        List<String> fileNameList5 = new ArrayList<>(Arrays.asList(
//                "C:/Users/PNidadav/Desktop/Priya Exp/EpubData exp/inputs/file17.txt"));
//
//        List<List<String>> fileNameList = new ArrayList<>();
//        fileNameList.add(fileNameList4);
//        //fileNameList.add(fileNameList5);
//
//        fileNameList.parallelStream().forEach(fileList ->
//                fileList.parallelStream().forEach(filePath -> {
//                    Set<String> outputSet = new HashSet<>();
//                    try (Stream<String> stream = Files.lines(Paths.get(filePath), Charset.defaultCharset())) {
//                        stream.forEach(line -> {
//                            String content = processEPUB(line);
//                            System.out.println(content);
//                            try {
//                                WriteToFile.writingToFile(outputPath + filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf(".")) + "output.txt", content);
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                            //outputSet.add(content);
//                        });
//                        //writingToFile(outputPath + filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf(".")) + "output.txt", outputSet);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                }));
//
//        //processEPUB(filePath);
//        System.out.println(failedFilePaths.size());
//    }
//
//    public static String processEPUB(String epubFilePath) {
//
//        EpubReader epubReader = new EpubReader();
//        Resource opfResource = null;
//        String opfFile = null;
//        Book book = null;
//        boolean hasOpfFile = true;
//        InputStream fis = null;
//        String fileName = null;
//
//
//        if (epubFilePath.isEmpty()) {
//            return null;
//        }
//        String result = null;
//
//        fileName = epubFilePath.substring(epubFilePath.lastIndexOf("/") + 1);
//
//        try {
//            fis = new FileInputStream(epubFilePath);
//            if (null != fis && null != epubReader) {
//                result = "Update ContentProvider.EpubData set fileSize = '" + ((FileInputStream) fis).getChannel().size() + "' ";
//                book = epubReader.readEpub(fis);
//                //System.out.println(book);
//                //fis.close();
//                if (book != null) {
//                    opfResource = book.getOpfResource();
//                    // System.out.println(opfResource);
//                    if (null != opfResource)
//                        opfFile = new String(opfResource.getData());
//                    //System.out.println(opfFile);
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            hasOpfFile = false;
//        } finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        if (hasOpfFile) {
//
//            Document doc = getDocument(opfFile, epubFilePath);
//            if (doc != null) {
//                Node nNode = doc.getElementsByTagName("package").item(0);
//
//                if (nNode != null && (nNode.getNodeType() == Node.ELEMENT_NODE)) {
//                    String version = ((Element) nNode).getAttribute("version");
//                    System.out.println("Version = " + ((Element) nNode).getAttribute("version"));
//                    result = result + " , version = " + version;
//                }
//
//            }
//        }
//
//        if (result != null) {
//            result = result + " where filePath = '/mnt/cifs/danube-p/cms-processed" + epubFilePath.substring(2) + "' and fileName = '" + fileName + "'";
//        }
//
//        if (fis != null) {
//            try {
//                fis.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return result;
//    }
//
//
//    public static Document getDocument(String opfFile, String epubFilePath) {
//        Document doc = null;
//        // System.out.println(opfFile);
//        try {
//            if (opfFile != null) {
//                doc = loadXMLFromString(opfFile);
//            }
//        } catch (Exception e) {
//            failedFilePaths.add(epubFilePath + " failed with reason " + e.getMessage());
//        }
//        return doc;
//    }
//
//    public static Document loadXMLFromString(String xml) throws ParserConfigurationException, IOException, SAXException {
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = null;
//        try {
//            builder = factory.newDocumentBuilder();
//            Document doc = builder.parse(new InputSource(new StringReader(xml)));
//            return doc;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//}
