package com.company;

import java.io.*;
import java.net.*;

public class InternetContent {
    public static String get(String url) {
        StringBuilder text = new StringBuilder();
        try {
            URL resource = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(resource.openStream()));
            String line;
            while ((line = in.readLine()) != null) {
                text.append(line + "\n ");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }
}

