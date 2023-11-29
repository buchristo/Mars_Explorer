package com.codecool.marsexploration.mapexplorer.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class FileLogger implements Logger {
    private final String logFile;

    public FileLogger(String logFile){
        this.logFile = logFile;
    }
    @Override
    public void log(String message) {
        logMessage(message);
    }

    private void logMessage(String message){
        String entry = String.format("%s", message);
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(logFile, true)))){
            out.println(entry);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
