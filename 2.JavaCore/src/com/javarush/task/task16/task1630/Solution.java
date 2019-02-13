package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName=reader.readLine();
            secondFileName=reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName) throws FileNotFoundException;

        String getFileContent() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private BufferedReader br;
        private StringBuffer stringBuffer = new StringBuffer();
        @Override
        public void setFileName(String fullFileName) throws FileNotFoundException {
            FileInputStream fstream = new FileInputStream(fullFileName);
            br = new BufferedReader(new InputStreamReader(fstream));
        }

        @Override
        public String getFileContent(){
            return String.valueOf(stringBuffer);
        }

        @Override
        public void run() {
            super.run();
            String strLine;
                try {
                    while (((strLine = br.readLine())!= null)){
                        //System.out.println(strLine);
                        stringBuffer.append(strLine).append(" ");
                    }
                    interrupt();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
