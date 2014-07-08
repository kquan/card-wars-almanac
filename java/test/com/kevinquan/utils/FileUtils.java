package com.kevinquan.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

    @SuppressWarnings("unused")
    private static final String TAG = FileUtils.class.getSimpleName();
    
    public static final String LINE_BREAK = System.getProperty("line.separator");
    
    /**
     * Reads a target file and as a String
     * @param inputFile The file to read from
     * @return The read string, or null if it could not be read.
     */
    public static String readFileToString(File inputFile) {
        if (inputFile == null || !inputFile.exists()) {
            System.err.println("Provided file is not a valid file.");
            return null;
        }
        FileReader reader = null;
        BufferedReader bufferedReader = null;
        StringBuilder resultBuilder = new StringBuilder();
        try {
            reader = new FileReader(inputFile);
            bufferedReader = new BufferedReader(reader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                resultBuilder.append(line);
                resultBuilder.append(LINE_BREAK);
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Could not read from file as it does not exist: "+inputFile.getAbsolutePath());
            fnfe.printStackTrace();
            return null;
        } catch (IOException e) {
            System.err.println("Could not read from file at "+inputFile.getAbsolutePath());
            e.printStackTrace();
            return null;
        } finally {
            IOUtils.safeClose(reader);
            IOUtils.safeClose(bufferedReader);
        }
        return resultBuilder.toString();
    }

}
