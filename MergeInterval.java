import java.util.* ;

import java.util.List;

import java.util.ArrayList;

class Interval {
    int start, finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class MergeInterval {

    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval> al = new ArrayList<>(); // ArrayList of type Interval created.

        // Sorting the intervals array
        // using the start values of the intervals
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        Interval pair = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            if (pair.finish >= intervals[i].start) {
                pair.finish = Math.max(pair.finish, intervals[i].finish);
            } else {
                al.add(pair);
                pair = intervals[i];
            }
        }

        al.add(pair);

        return al;
    }

    public static void main(String[] args) {
        
    }
    
}