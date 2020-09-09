package com.company.leetcode;

import java.text.DecimalFormat;

public class RoundValue
{
    public static void main(String[] args)
    {

        double successCount = 12000000;
        double failCount = 500000000;
        double successPercent = successCount*100/(successCount+failCount);

        System.out.println("successPercent : " + successPercent);

        double newKB = Math.round(successPercent*100.0)/100.0;
        System.out.println("successPercent (Math.round) : " + successPercent);

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("successPercent (DecimalFormat) : " + df.format(successPercent));
    }
}