package com.yasemintoraman.readingapp;

import static org.junit.Assert.*;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.junit.Test;

import java.util.Scanner;

public class MainActivityTest {

    @Test
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String username="edkucuk", password="123456";

        String kullanici_adi, sifre;
        System.out.println("Enter the username:");
        kullanici_adi=input.next();
        System.out.println("Enter the password:");
        sifre=input.next();

        if (username.equals(kullanici_adi) && password.equals(sifre))
        {
            System.out.println ("The system has been successfully login!");
        }
        else
        {
            System.out.println ("Username or password is incorrect!\nCheck and try again.");
        }
    }

}