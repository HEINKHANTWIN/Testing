package demo;

public class HelloWorld {
    public static void main(String[] args) {
    	
        System.out.println("Hello World2!");
        
        ExchangeRateCoverter erc = new ExchangeRateCoverter(1.34);
        double g = erc.covertCurrency(1000);
        System.out.println(g);        
    }
}