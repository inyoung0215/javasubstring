package transList;

import java.util.ArrayList;
import java.util.List;

public class Program {
    static void trunsCateList(String txt, String start, String end){
        List<String> list = new ArrayList<>();
        int startIndex = txt.indexOf(start)+1;
        int endIndex = txt.indexOf(end, startIndex + end.length());
        list.add(txt.substring(startIndex, endIndex));
        while (startIndex != -1 && endIndex != -1){
            startIndex = txt.indexOf(start, endIndex+start.length())+1;
            if (startIndex <=0){
                break;
            }
            endIndex = txt.indexOf(end, startIndex + end.length());
            if (endIndex <= 0){
                break;
            }
            list.add(txt.substring(startIndex, endIndex));
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        String str = "<a color=\"red\"/>\n" + "<a color=\"blue\"/>\n" + "<a color=\"green\"/>\n" +
                "    <a color=\"black\"/>\n" +
                "    <a color=\"white\"/>\n" +
                "    <a color=\"yellow\"/>";
        trunsCateList(str,"\"","\"");
    }
}

