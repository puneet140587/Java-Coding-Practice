package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RemoveLetterA {
	
    public static void main(String[] args) {
        String urlString = "https://www.example.com"; // Replace with your desired URL

        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Create a BufferedReader to read content from the URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Read the content from the URL
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                // Remove lowercase letter 'a' from the line
                for (char ch : line.toCharArray()) {
                    if (ch != 'a') {
                        content.append(ch);
                    }
                }
                content.append("\n");
            }

            // Close the reader
            reader.close();

            // Display the modified content
            System.out.println(content.toString());
        } catch (IOException e) {
            System.err.println("Error fetching content from the URL: " + e.getMessage());
        }
    }
}
