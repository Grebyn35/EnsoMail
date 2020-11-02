import org.openqa.selenium.WebDriver;

import java.io.File;
import java.util.Random;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    static String userName = "elliot@ensotech.io";
    static String password = "-v3@BG4Zg@7KrnX";
    //hotell & restaurang
    //detaljhandel
    //fastighetsverksamhet
    static String csvLocation = "C:\\Users\\ellio\\OneDrive\\Desktop\\LeadsList\\Blekinge\\FASTIGHETSVERKSAMHET.csv";
    static String cmpPersonName;
    static String cmpWebsiteVersion;
    static String cmpWebsite;
    static String cmpEmail;
    static String cmpName;
    static String text;
    static int i;
    static WebDriver driver = webDriver();

    public static void main(String[] args) {
        startBot();
        run();
    }
    static void run(){
        returnValuesFromCsv(csvLocation);
    }
    static void returnValuesFromCsv(String csv){
        String fileName = csv;
        File file = new File(fileName);
        try{
            Scanner inputStream = new Scanner(file);
            inputStream.nextLine();
            i=1;
            while(inputStream.hasNext()){
                String data = inputStream.nextLine();
                String values[] = data.split(",");
                fillValues(values[10], values[9], values[5], values[0]);
                printValues();
                textBuider();
                decider();
                i++;
                System.out.println("Mails sent: " + i);

            }
            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static void printValues(){
        System.out.println("Email: " + cmpEmail);
        System.out.println("Website: " + cmpWebsite);
        System.out.println("Contact person: " + cmpPersonName);
        System.out.println("Company name: " + cmpName);
        System.out.println("---------");
    }
    static void fillValues(String email, String website, String personName, String name){
        cmpName = name;
        cmpEmail = email;
        cmpWebsite = website;
        cmpPersonName = personName;
    }
    static void decider(){
        if(!cmpEmail.contains("NA") && !cmpWebsite.contains("NA")){
            mailUser();
        }
    }
    static void mailUser(){
        try{
            Thread.sleep(1000);
            driver.findElement(By.id("rcmbtn100")).click();
            try{
                Thread.sleep(1000);
                /*Actions builder = new Actions(driver);
                builder.sendKeys(Keys.ENTER);*/
                if(!driver.findElement(By.className("discard")).getText().contains("Skicka")) {
                    driver.findElement(By.className("discard")).click();
                }
            }catch (Exception e){
            }
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys(cmpEmail);
            driver.findElement(By.id("compose-subject")).sendKeys(cmpName + " - Samarbete");
            driver.findElement(By.id("compose-subject")).sendKeys(Keys.TAB + text);
            driver.findElement(By.cssSelector(".send.btn-primary.btn")).click();
            int timer = returnTimeout();
            System.out.println(timer/1000 + " Seconds timeout");
            Thread.sleep(timer);
            System.out.println("Email sent, continuing to next email");
        }catch (Exception e){
            System.out.println("Fel element");
        }
    }
    public static WebDriver webDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ellio\\OneDrive\\Desktop\\Chromemapp\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    static void startBot(){
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
        driver.get("https://webbmail.loopia.se/?_task=mail&_mbox=INBOX");
        String checkLogin = driver.findElement(By.tagName("body")).getText();
        if(checkLogin.contains("LOGGA IN")){
            driver.findElement(By.id("rcmloginuser")).sendKeys(userName);
            driver.findElement(By.id("rcmloginpwd")).sendKeys(password);
            driver.findElement(By.id("rcmloginpwd")).sendKeys(Keys.ENTER);
            System.out.println("User just logged in");
        }
        else{
            System.out.println("User is logged in");
        }
    }
    static void textBuider(){
        text = "Hej!\n" +
                "\n" +
                "Jag heter Elliot Nyberg och jobbar som webbutvecklare på Ensotech AB i Sundbyberg. Var förbi er hemsida " + cmpWebsite +  " och är egentligen nyfiken på om ni skulle vilja ha en offert på att göra en ny. \n" +
                "\n" +
                "Vi på Ensotech AB jobbar primärt med webbutveckling men även utveckling av mjukvara och programvara, det är kanske något annat ni skulle vara intresserade av. \n" +
                "\n" +
                "Ha det så fint!";
    }
    static int returnTimeout(){
        Random random = new Random();
        int local  = random.nextInt(120000 - 60000) + 60000;
        return local;
    }
}
