package com.example.leetcode.Hot100.leetcode.editor.cn.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tiquRid {
    public static void main(String[] args) {
        String data = "\"recruitCaseId\":\"143199\",\"schoolInterviewID\":\"731655\",\"recruitmentYear\":\"2024\",\"contractStatus\":\"已签\",\"offerStatus\":\"接受\",\"recruitmentStaffName\":\"徐军扬\",\"telePhone\":\"+86-15827300738\",\"email\":\"502864930@qq.com\"\n";

        System.out.print("Recruit Case ID: ");
        getRecruitCaseIds(data);
    }

    public static void getRecruitCaseIds(String input) {
        Pattern pattern = Pattern.compile("\"recruitCaseId\":\"(\\d+)\"");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.print("\"" + matcher.group(1) + "\",");
        }
    }
}

