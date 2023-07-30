package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.ConfigReader;

import static utilities.Authentication.*;

public class ManagementonSchoolBaseUrl {

    public static RequestSpecification spec;
    protected static RequestSpecification spec2;

    @Before//This method will run before each @Test methods.
    public static void setUp() {

        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateToken())
                .build();

    }

    //    @Before//This method will run before each @Test methods.
    public void setUpViceDean() {

        spec2 = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://managementonschools.com/app")
                .addHeader("Authorization", generateTokenViceDean())
                .build();

    }

    public static void teacherSetUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", generateTokenTeacher()).
                setBaseUri(ConfigReader.getProperty("apiUrl")).build();

    }
}