# CodeExam

DESCRIPTION

Assignment given by N.Mutual for assesment 

ENVIRONMENT

Selenium WebDriver, IDE:Eclipse, Build: Maven, Framework:Cucumber, Junit, Language: JAVA SE8

INSTALLATION

Selenium and Cucumber framework. Features, steps and test runner class are created for testing through Cucumber. POM.xml file is created and dependencies are added. Features are written in gherkin language including a scenario with 3 conditions. Steps package includes Selenium and Java codes. Test Runner class is the execution point of tests and include Cucumber options. 

TESTS

Login and checkout functions of www.saucedemo.com are tested in both.Firstly, login and checkout functions are tested in Selenium-Java. Assertions are used. Different locators such as xpath, css Selector are used for locating WebElements. Select class is used for dropdown. 
In cucumber, a feature file that includes scenario and a step file that includes Selenium-Java codes are created. In feature file, * is used, instead of keywords such as when, then. In step file, Selenium-Java is used. To run test case, a test runner class is created. It includes cucumber options 
HTTP methods are tested for jsonplaceholder.typicode.com.  

CODE EXAMPLE

WebElement sortOptions = driver.findElement(By.cssSelector("select[class='product_sort_container']"));
	Select select = new Select(sortOptions);
	select.selectByValue("lohi");
  
  



