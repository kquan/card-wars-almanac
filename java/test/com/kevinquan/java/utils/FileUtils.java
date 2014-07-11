/*
 * Copyright 2014 Kevin Quan (kevin.quan@gmail.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kevinquan.java.utils;

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
