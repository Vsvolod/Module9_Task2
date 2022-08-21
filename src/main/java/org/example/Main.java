package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        writeToJson();
    }
    public static ArrayList<User> readFile() throws Exception {
        ArrayList <User> usersFields = new ArrayList<>();
        FileReader fr = new FileReader("task2.txt");
        Scanner sc = new Scanner(fr);
        sc.nextLine();
        while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                String [] tempAr = temp.split(" ");
                usersFields.add(new User(tempAr[0], tempAr[1]));
        }return usersFields;
    }
    public static void writeToJson() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File("user.json"), readFile());

        }
    }


