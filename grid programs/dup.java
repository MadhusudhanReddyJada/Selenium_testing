package p2;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class dup {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String,String> map = new HashMap<String,String>();
        Iterator itr = null;
        StringBuffer sb = null;
        Entry entry = null;
        String key = null;
        String val = null;

        map.put("1", "Rakesh");
        map.put("2", "Amal");
        map.put("3", "Nithish");

        itr = map.entrySet().iterator();
        sb = new StringBuffer();

        while(itr != null && itr.hasNext()) {
            try {
                entry = (Entry) itr.next();
                //key = (String) entry.getKey();
                //val = (String) entry.getValue();
                System.out.println(key);
                System.out.println(val);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


    }



}
