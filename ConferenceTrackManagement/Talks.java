package ConferenceTrackManagement;

public class Talks {

   private int minutes;
   private String title;
   private int id;
   private boolean lunchFlag = false;
   private String networkingTitle;
   private boolean networkingFlag = false;
   private String sessionTime;
   private String lunchTitle;

   private String trackTitle;

   public int getMinutes() {
       return minutes;
   }
   public void setMinutes(int minutes) {
       this.minutes = minutes;
   }
   public String getTitle() {
       return title;
   }
   public void setTitle(String title) {
       this.title = title;
   }
   public int getId() {
       return id;
   }
   public void setId(int id) {
       this.id = id;
   }
   public String getSessionTime() {
       return sessionTime;
   }
   public void setSessionTime(String sessionTime) {
       this.sessionTime = sessionTime;
   }

   public String getLunchTitle() {
       return lunchTitle;
   }
   public void setLunchTitle(String lunchTitle) {
       this.lunchTitle = lunchTitle;
   }
   public boolean isLunchFlag() {
       return lunchFlag;
   }
   public void setLunchFlag(boolean lunchFlag) {
       this.lunchFlag = lunchFlag;
   }
   public String getNetworkingTitle() {
       return networkingTitle;
   }
   public void setNetworkingTitle(String networkingTitle) {
       this.networkingTitle = networkingTitle;
   }
   public boolean isNetworkingFlag() {
       return networkingFlag;
   }
   public void setNetworkingFlag(boolean networkingFlag) {
       this.networkingFlag = networkingFlag;
   }

   public String getTrackTitle() {
       return trackTitle;
   }
   public void setTrackTitle(String trackTitle) {
       this.trackTitle = trackTitle;
   }

   Talks(int minutes,String title,int id)
   {
       this.minutes = minutes;
       this.title = title;
       this.id = id;

   }
}