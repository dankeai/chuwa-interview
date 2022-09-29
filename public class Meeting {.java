import java.util.Arrays;
public class Meeting {
    public static boolean couldAttendAll(int[][]intervals){

        if(intervals == null || intervals.length == 0){
            return false;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 1; i< intervals.length; i++){
            if(intervals[i][0]<intervals[i-1][1]){
            return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] meet1 = {{15,20}, {0,10}};
        int[][] meet2 = {};
        int[][] meet3 = {{0,30}, {15,20},{5,10}};
        int[][] meet4 = {{0,10},{15,20}};
        int[][] meet5 = {{0,10},{10,20}};
        int[][] meet6 = {{15,20}, {0,30}};
        int[][] meet7 = null;
        System.out.println(couldAttendAll(meet1));
        System.out.println(couldAttendAll(meet2));
        System.out.println(couldAttendAll(meet3));
        System.out.println(couldAttendAll(meet4));
        System.out.println(couldAttendAll(meet5));
        System.out.println(couldAttendAll(meet6));
        System.out.println(couldAttendAll(meet7));

    }
    
}