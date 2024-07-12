package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class MutiThread extends Thread{

    public void run(){
        int[] arr = {1,2,3,4,5};
        for (int j : arr)
        {


            /*ChromeOptions cO = new ChromeOptions();
            cO.setBinary("/Volumes/Google Chrome/Google Chrome.app");*/

            //System.setProperty("webdriver.chrome.driver","/Users/arpit/IdeaProjects/Utils/chromedriver");
            WebDriver driver = new SafariDriver();
            driver.navigate().to("http://www.google.com/");
            driver.close();

        }
    }

    public static void main(String[] args) {
        Thread obj = new MutiThread();
        Thread obj1 = new MutiThread();
        Thread obj2 = new MutiThread();
        Thread obj3 = new MutiThread();

        obj.start();
        obj2.start();
        obj3.start();
        obj1.start();
    }
}
