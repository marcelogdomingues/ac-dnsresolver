package org.academiadecodigo.bootcamp.dnsresolver;

import java.net.InetAddress;
import java.util.Scanner;

public class DNSResolver {

    public static void main(String[] args) {

        Scanner inputUrl = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Host");

        String url = inputUrl.nextLine();  // Read user input
        System.out.println("");

//        InetAddress localhost = InetAddress.getLocalHost();

        try {

            InetAddress address = InetAddress.getByName(url);

            boolean addressConfirmation = address.isReachable(100);

            if (addressConfirmation) {

                System.out.println("URL Confirmation: True");

            } else {

                System.out.println("URL Confirmation: False");
            }

        }catch (Exception e){

            System.err.println(e.getMessage());

        }
    }

}
