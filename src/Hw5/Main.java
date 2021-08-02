package Hw5;

import lesson3.Box;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main<appDataArrayList> {
    private static Object CsvPreference;

    public static void main(String[] args) throws IOException{
        ArrayList<AppData> appDataArrayList = new ArrayList<>();

        String[] header = new String[]{"Value1", "Value2", "Value3"};
    }


    private Box appDataArrayList;

    {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("adddata.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        String tempString = null;
            while (true){
                try {
                    if (!(tempString == bufferedReader.readLine())) break;
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                String [] appDataArray = tempString.split(";");
                appDataArrayList.add(new AppData(appDataArray[0],appDataArray[1],appDataArray[2]));
            }
        }
    }

