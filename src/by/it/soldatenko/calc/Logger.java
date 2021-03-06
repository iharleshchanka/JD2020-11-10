package by.it.soldatenko.calc;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

enum Logger {
    INCTANCE;

    void log(String message){
        try
            (PrintWriter printWriter = new PrintWriter(new FileWriter(dir(), true)))
        {printWriter.println(message);
        } catch (IOException e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    private synchronized String dir() {
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator;
        String cldir = Logger.class.getName().replace(Logger.class.getSimpleName(), "").replace(".", File.separator);
        return path + cldir +"log.txt" ;
    }
}
