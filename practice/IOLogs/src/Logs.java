import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Logs {
  public static void main(String[] args) {

    // Read all data from 'log.csv'.
    // Each line represents a log message from a web server
    // Write a function that returns the IP addresses which have more than three occurrences.
    // Write a function that returns the GET / POST request ratio.

    System.out.println(getIPsOccuringMinThreeTimes("logs.csv"));
    System.out.println(getRatio("logs.csv"));
  }

  public static List<String> readFileContent (String filePath){
    List<String> fileRows = new ArrayList<>();
    try {
      fileRows = Files.readAllLines(Paths.get(filePath));
    } catch (IOException e) {
      System.out.println("Unable to read file.");
    }
    return fileRows;
  }

  public static String getRatio(String fileName) {
    List<String> fileRows = readFileContent(fileName);
    int amountPost = 0;
    int amountGet = 0;
    for(int i = 0; i < fileRows.size(); i++) {
      String request = splitToGetRequests(fileRows.get(i));
       if (request.equals("POST")){
        amountPost += 1;
      } else if (request.equals("GET")){
        amountGet += 1;
      }
    }
    String ratio = amountGet + " : " + amountPost;
    return ratio;
  }
  public static List<String> getIPsOccuringMinThreeTimes(String fileName){
    HashMap<String, Integer> IPMap = new HashMap<>();
    String IP = "";
    List<String> content = readFileContent(fileName);
    int value = 1;
    for(String temp : content){
       IP = splitToGetIPAddress(temp);
       if(!IPMap.containsKey(IP)){
         value = 1;
       } else {
         value = IPMap.get(IP) + 1;
       }
      IPMap.put(IP, value);
    }
    return findIPAddresses(IPMap);
  }

  public static String splitToGetIPAddress(String text){
    String[] textSplitted = text.split(" ");
    String IPAddress = textSplitted[8];
    return IPAddress;
  }

  public static List<String> findIPAddresses(HashMap<String, Integer> IPMap){
    int value = 0;
    int mostOften = 0;
    List<String> IPMoreThan3Times = new ArrayList<>();
    for (String IP : IPMap.keySet()){
      value = IPMap.get(IP);
      if (value > 3){
        IPMoreThan3Times.add(IP);
      }
    }
    return IPMoreThan3Times;
  }

  public static String splitToGetRequests(String sorText){
    String[] textSplitted = sorText.split(" ");
    String requests = textSplitted[11];
    return requests;
  }
}
