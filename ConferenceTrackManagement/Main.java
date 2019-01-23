package ConferenceTrackManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Conference conference = new Conference();

        conference.ProcessTalksInput(TrackConfiguration.TALKS_INPUT_FILE);

        int numberOfTracks = conference.getCountTrack();

        int startTalkIndex = 0;

        for(int trackCount = 0; trackCount <numberOfTracks; trackCount++)
        {
            startTalkIndex = conference.ScheduleTalksIntoTracks(trackCount, conference.getTrackTalks(), conference.getCountTrack(), startTalkIndex, conference.getCountTalks());
        }

        conference.OutputOfTalksIntoTracks(conference.getTrackTalks());

    }
}