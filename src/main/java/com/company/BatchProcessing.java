package com.company;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

public class BatchProcessing {

    public static void main(String args[]) {
        List<Integer> documentIdList = new ArrayList<>();

//        for (int i = 500000; i < 505234; i++) {
//            documentIdList.add(i);
//        }

       List<List<Integer>> batchIds = range(0, documentIdList.size())
                .boxed()
                .collect(groupingBy(id -> id / 100))
               .values()
                .parallelStream()
                .map(index -> index
                        .stream()
                        .map(documentIdList::get)
                        .collect(toList()))
                .collect(toList());
        System.out.println(batchIds);
    }
}
