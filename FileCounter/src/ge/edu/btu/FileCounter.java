package ge.edu.btu;

import java.io.File;
import java.io.FilenameFilter;

public class FileCounter implements FilenameFilter {
    public static void main(String args[]){
        File directory=new File("C:\\Windows\\debug"); // url უნდა მივუთითოთ
        String[] fileNames = directory.list(new FileCounter());
        System.out.println("მოძებნილი ფაილების რაოდენობაა: " + fileNames.length);
    }

    @Override
    public boolean accept(File dir, String name) {
        String searchKey="btu";
        if( name.toLowerCase().startsWith(searchKey.toLowerCase()) ){
            return true;
        } else {
            return false;
        }
    }
}