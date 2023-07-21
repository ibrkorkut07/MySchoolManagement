package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherMngPage {

    public TeacherMngPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//a[.='Teacher Management']")
    public WebElement TeacherMng;

    @FindBy(xpath = "//input[@role='combobox']")
    public WebElement Lesson;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement MyLogin;

    @FindBy(id = "name")
    public WebElement addTeacherName;

    @FindBy(id = "surname")
    public WebElement addTeacherSurname;

    @FindBy(id = "birthPlace")
    public WebElement addTeacherBirthPlace;

    @FindBy(id = "email")
    public WebElement addTeacherEmail;

    @FindBy(id = "phoneNumber")
    public WebElement addTeacherPhoneNumber;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement teacherGender;

    @FindBy(id = "birthDay")
    public WebElement addTeacherBirthday;

    @FindBy(id = "ssn")
    public WebElement ssnNo;

    @FindBy(id = "username")
    public WebElement usernameTeacher;

    @FindBy(id = "password")
    public WebElement passwordTeacher;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitTeacher;


}
