package com.google.tests;
import com.google.utils.SearchQueries;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class GoogleSearchTest extends BaseTest {

    @Test(dataProvider = "searchQueriesProvider")
    public void searchTest(String query)  {
        // Step 1: Navigate to google.com
        HomePage homePage = new HomePage(driver);

        // Accept terms & conditions if required
        if (homePage.isTermsAndConditionsDisplayed()) {
            homePage.acceptTermsAndConditions();
        }

        // Step 2: Search for a query in google
        homePage.setSearch(query);

        // Step 3: Assert that the first search result contains the query
        String title = driver.getTitle();
//        assertTrue(title.contains(searchQuery));
        assertTrue(title.contains(query));
    }

    @DataProvider(name = "searchQueriesProvider")
    public Object[][] searchQueriesProvider() {
        // Load the search queries from the JSON file
        String[] queries = SearchQueries.loadSearchQueries();

        // Create an object array with the search queries
        Object[][] data = new Object[queries.length][1];
        for (int i = 0; i < queries.length; i++) {
            data[i][0] = queries[i];
        }
        return data;
    }
}
