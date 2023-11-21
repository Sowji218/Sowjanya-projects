
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class linkshortner
 {
    private static final String BASE62_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int SHORT_URL_LENGTH = 6;

    private Map<String, String> urlMappings;

    public linkshortner() 
    {
        this.urlMappings = new HashMap<>();
    }

    public String shortenUrl(String longUrl)
    {
        String shortUrl = generateShortUrl();
        urlMappings.put(shortUrl, longUrl);
        return shortUrl;
    }

    public String expandUrl(String shortUrl) 
    {
        return urlMappings.get(shortUrl);
    }

    private String generateShortUrl() 
    {
        StringBuilder shortUrl = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < SHORT_URL_LENGTH; i++) 
        {
            int index = random.nextInt(BASE62_CHARACTERS.length());
            shortUrl.append(BASE62_CHARACTERS.charAt(index));
        }

        return shortUrl.toString();
    }

    public static void main(String[] args)
    {
        linkshortner linkshortner = new linkshortner();

        // Example usage
        String longUrl = "https://www.example.com";
        String shortUrl = linkshortner.shortenUrl(longUrl);

        System.out.println("Shortened URL: " + shortUrl);
        System.out.println("Expanded URL: " + linkshortner.expandUrl(shortUrl));
    }
}
