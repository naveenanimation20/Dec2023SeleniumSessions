package seleniumsessions;

public class WaitConcept {

	public static void main(String[] args) {

		//script ----sync--> app(slow, server slowness, network)
		
		//sync: wait
		//1. static wait: JAVA Thread.sleep(10000): 10 secs: 2 secs
		//2. dynamic wait : 10 secs: 2secs: 8 secs will be cancelled
		
		//2.a: Implicitly Wait: global wait for all the webelements
		//2.b: Explicitly Wait: for a specific web element
				//i: WebDriverWait (C)
				//ii: FluentWait (C)
		
		
		
		//Wait(I) : until(); --> FluentWait(C): until(){} + other methods --> WebDriverWait (C)
		
	}

}
