package com.yunsuan;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author WangJie
 * @time 2023/9/14 20:18
 * @description
 */
public class Liu {
    public static void main(String[] args) throws IOException {

        var contents = new String(Files.readAllBytes(Paths.get("alice.txt")), StandardCharsets.UTF_8); // Read fule into string
        List<String> words = List.of(contents.split("\\PL+"));

        int count = 0;
        for (String w : words) {
            if (w.length() > 12) count++;
        }
    }
}
