package seleniumsessions;

import org.openqa.selenium.By;

public class CustomXpath {

	public static void main(String[] args) {

		//Xpath: address of the element in the DOM
		//XMLPath
		//1. absolute xpath
		//html/body/div[2]/div/div/div[3]/div[2]/div/div/div[2]/h4/a
		//2. relative xpath(custom xpath) 
		
		//1. using single attr:
		//tagname[@attrname = 'value']
		//input[@id = 'input-email']
		//input[@name='email']
		
		//input[@name] --5
		//input[@value='Login'] --1
		
		//2. using multiple attrs:
		//tagname[@attr1='value' and @attr2='value' and @attr3='value']
		//input[@type='submit' and @value='Login' ] --- 1
	
		//input[@type='submit'] -- 3
		//input[@type='text' or @type='email' ]
		//input[@type and @value='Login']
		//input[@type and @value]
		//a[@href]
		
		//3. text():
		//tagname[text()='value']
		//h2[text()='New Customer']
		//a[text()='Desktops']
		
		//4. text() and attributes:
		//tagname[@attr='value' and text()='value']
		//a[@class='dropdown-toggle' and text()='Desktops']
		//a[@class='dropdown-toggle' and text()='Desktops' and @data-toggle='dropdown']
		//a[text()='Desktops' and @class='dropdown-toggle' and @data-toggle='dropdown']
		
		//5. contains() with attr:
		//tagname[contains(@arrName, 'value')]
		//input[contains(@placeholder, 'E-Mail')]
		//input[contains(@placeholder, 'Address')]
		
		//tagname[contains(@arrName1, 'value') and @attr2='value']
		//input[contains(@placeholder, 'Address') and @name='email']
		//input[contains(@placeholder, 'Address') and @name='email' and contains(@id,'email')]
		//a[contains(@href,'wishlist')]
		
		//dynamic ids:
		//<input id=firstname_123 />
		//<input id=firstname_345 />
		//<input id=firstname_900 />
		//<input id=firstname_987 />

		//input[contains(@id,'firstname_')]
		
		//6. contains() with text():
		//tagname[contains(text(), 'value')]
		//p[contains(text(), 'Customer service, IT, and CRM software')]
		//a[contains(text(), 'Customer')]
		
		//7. contains() with text() and attr:
		//tagname[contains(text(),'value') and contains(@attr,'value')]
		//a[contains(text(),'Notebooks') and contains(@href,'category&path')]
		
		//tagname[contains(text(),'value') and contains(@attr1,'value') and @attr2='value']

		//8. starts-with():
		//tagname[starts-with(@attr, 'value')]
		//input[starts-with(@placeholder, 'E-Mail')]
		
		//9. starts-with() with text():
		//tagname[starts-with(text(),'value')]
		//a[starts-with(text(),'Forgotten')]
		
		//dynamic ids:
		//<input id=firstname_123_login />
		//<input id=456_firstname_login />
		//EXT JS
		
		//input[contains(@id,'firstname_') and contains(@id,'_login')]
		
		//10. ends-with() is not supported in xpath
		
		//11. index based xpath:
		// (//a[text()='Forgotten Password'])[1]
		// (//a[@class='list-group-item'])[13]
		// (//input[@class='form-control'])[6]
		// (//input[@class='form-control'])[position()=4]
		// (//input[@class='form-control'])[4]
		// (//input[@class='form-control'])[last()]
		
		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		
		// ((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()-last()+1]
				
		By fgt_pwd = By.xpath("(//a[text()='Forgotten Password'])[1]");
		
		//*
		//*[@id]
		//*[@class='form-control'] -- 100 ---> 6
		//input[@class='form-control'] -- 20 ---> 6
		//*[@href]
		
		//label[normalize-space()='No']
		
		
	}

}
