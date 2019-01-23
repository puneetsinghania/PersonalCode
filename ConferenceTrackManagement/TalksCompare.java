package ConferenceTrackManagement;


import java.util.Comparator;


public class TalksCompare implements Comparator<Talks>{

    @Override
    public int compare(Talks t1, Talks t2) {
        if(t1.getMinutes() < t2.getMinutes()){
            return 1;
        } else {
            return -1;
        }
    }
}