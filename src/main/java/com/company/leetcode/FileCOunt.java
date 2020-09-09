package com.company.leetcode;

import java.io.File;

public class FileCOunt {
    public static void main(String args[]){
        File directory=new File("Y:\\pickup\\DocumentData");
        int fileCount=directory.list().length;
        System.out.println("File Count:"+fileCount);
        int currentCount = fileCount - 441;
        System.out.println("File Count:"+currentCount);
    }
}
