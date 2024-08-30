public class MyNotes {
	Q] what is selenium webdriver?
	=> WebDriver is one of the component in selenium.
	=>  WebDriver is a java interface.
	=>  WebDriver is an API (Application programming interface)
  =>  WebDriver represents actual browser.
	
 SearchContext(I)-----> WebDriver(I)----> RemoteWbDriver(c)
	                                                |
	                                                |--> ChromeDriver 
	                                                |--> FirefoxDriver
                                               	|--> EdgeDriver
                                                  |--> SafariDriver
	                                                |--> OperaDriver
	
	
		
  //---------------------------------------------------------------------------------------------------	
 Session 22 : Locators = 8
                         1] Id
                         2] Name
                         3] className
                         4] tagName
                         5] linkText
                         6] partialLinkText
                         7] X-Path
                         8] cssSelector
	
 Q]-What is Difference between findeElement(); and findElements();


	
// ---------------------------------------------------------------------------------------------------
Session 22 : CSS Selector : 


//---------------------------------------------------------------------------------------------
 Session 24 : X-Path	
            1] XPath with Single Attribute
            2] XPath with Multiple Attribute
            3] XPath with 'and' , 'or' operator
            4] XPath with inner text
            5] XPath with contains()
                                   ==> in middle any text of string ---it will check	
            6] XPath with start-with()
                                   ==> starting text in string ---it will check
            7] XPath with
            8] XPath with


 Q] Difference between XPath with start-with(); and  XPath with contains();

 Handling Dynamic Attributes
 XPath with contains()
                
		   //tagname[contains(@attribute,'value')]
 XPath with start-with()
 
                    //tagname[starts-with(@attribute,'value')]


 Q] can we write contains(), if there is not available any inner text
           
	     //tagName[text()='']
	
 Q] When we use chained X-Path
  ==> when while inspect that perticular webElement, if there is not available any attribute and also not available inner text,
 then we can use chained xpath
//-------------------------------------------------------------------------------------------------------------------------------
  Q] What is the difference between CSS-Selector and X-Path

//================================================================================================================================
Session 24 : X-Path
	
	                Ancestor
	                   |
                	 Parent
	                   |
    Preceding-Sibling < Self-node > Following-Sibling
	                   |
	                 Child
	                   |
                	 Descendant
//================================================================================================================================
 Session 26 : WebDriver Methods

 1] get methods
 2] conditional methods
 3] browser methods
 4] navigational methods
 5] wait methods

1] get methods ==> we can access this methods through webdriver instance
==> all get methods related to web page...not related to webElement
  
    get("url") ==> open url in browser.
    getTitle() ==> return the title of page
    getCurrentUrl() ==> return url of current page
    getPageSource() ==> return source code of page
    getWindowHandle() ==> returns ID of single browser window
    getWindowHandles() ==> returns ID's of multiple browser windows

2] conditional methods ==> access these commands through WebElement
                        ==> returns boolean value (true/false)
 
    isDisplayed(); ==> we can check display of the element
    isEnabled(); ==> we can check enable/disable status of the element/operational element
    isSelected();  ==> apply on checkbox and radio button

3] browser methods 
 
    quit(); ==> close single browser window wherever the driver is focused
    close(); ==> close all the browser windows

//================================================================================================================================
Session 27 : WebDriver Methods	

 4] wait methods or commands

 Synchronization :
almost every automation tool face the synchronization promblem
 i. e when u run automation test case, then sometime not able to find any webelement that time u will get
exceptions such as ElementNotFoundException , NoSuchFoundException etc i.e called synchronization promblem
speed of application is slow and speed of execution is faster than response of application i.e synchronize issue
	 
 Implicit Wait


 
