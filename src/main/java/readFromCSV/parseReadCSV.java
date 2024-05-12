package readFromCSV;

import java.sql.PreparedStatement;
import java.util.ArrayList;

import static readFromCSV.GlobalVarInit.globalList;
import static readFromCSV.GlobalVarInit.headers;
import static readFromCSV.GlobalVarInit.tableName;

public class parseReadCSV {

    public void parseOne(){
        headers = globalList.get(0);
    }



//    public PreparedStatement getStatementReady(){
//        String q = "UPDATE " + tableName + " SET ";
//        for(int i = 0; i < header.size(); i++){
//            q += (header.get(i) + "=?");
//        }
//    }





}
