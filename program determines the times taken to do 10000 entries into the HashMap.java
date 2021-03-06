import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/*
Time for 10,000 insertions
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }
    public static long getInsertTimeInMs(List list) {
        Date date1 = new Date();
        insert10000(list);
        Date date2 = new Date();
        return date2.getTime() - date1.getTime();
    }
    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
