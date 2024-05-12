package readFromCSV;

import java.util.ArrayList;

public class GlobalVarInit {
    public static ArrayList<ArrayList<String>> globalList;
    public static ArrayList<String> headers;
    public static String tableName;
    public static void initGlobalVars(){
        globalList = new ArrayList<>();
        headers = new ArrayList<>();
        tableName = new String();


    }
}
