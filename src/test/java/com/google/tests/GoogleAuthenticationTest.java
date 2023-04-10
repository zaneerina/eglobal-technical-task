package com.google.tests;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import com.google.resources.AuthConfig;

public class GoogleAuthenticationTest extends BaseTest {
    private String email;
    private String password;

    @BeforeTest
    public void setUsernameAndPassw() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File configFile = new File("src/test/java/com/google/resources/config.properties");
        AuthConfig authConfig = mapper.readValue(configFile, AuthConfig.class);
        email = authConfig.getEmail();
        password = authConfig.getPassword();
    }

    @Test()
    public void testLogin() {
        // Step 1: Navigate to login page: https://accounts.google.com/signin
        LoginPage loginPage = new LoginPage(driver);
        // Step 2: Enter a valid email and click next:
        loginPage.setEmail(email);
        // Step 3: Enter a valid password:
//        loginPage.enterPassword(password); // cannot automate
    }

}
