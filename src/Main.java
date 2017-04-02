import twitter4j.*;

public class Main {

    public static void main(String[] args) throws TwitterException {


        TwitterFactory factory = new TwitterFactory();

        reply(848219027659010051L, "@realDonaldTrump https://www.youtube.com/watch?v=uq-v1TTUyhM", 0.0, 0.0, factory);


    }


    public static void reply(long inReplyToStatusId, String text, double latitude, double longitude, TwitterFactory factory) throws TwitterException
    {
        Twitter twitter = factory.getInstance();
        StatusUpdate stat= new StatusUpdate(text);
        stat.setInReplyToStatusId(inReplyToStatusId);
        GeoLocation location= new GeoLocation(latitude, longitude);
        stat.setLocation(location);

        twitter.updateStatus(stat);
    }

}
