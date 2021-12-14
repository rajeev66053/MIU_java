package com.simplilearn.mockito;
 import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

public class PortfolioTester {
	
	Portfolio portfolio;
	StockService stockService;
	
	public static void main(String[] args) {
		
		PortfolioTester tester = new PortfolioTester();
		tester.setUp();
		System.out.println(tester.testMarketValue()?"pass":"fail");
		
	}
	
	public void setUp() {
		
		portfolio=new Portfolio();
		//create the mock object of stockservice
		stockService=mock(StockService.class);
		
		portfolio.setStockservice(stockService);
		
	}
	
	public boolean testMarketValue() {
		List<Stock> stocks = new ArrayList<Stock>();
		Stock googleStock = new Stock("1","google",10);
		Stock microsoftStock = new Stock("1","Microsoft",100);
		
		stocks.add(googleStock);
		stocks.add(microsoftStock);
		
		portfolio.setStocks(stocks);
		
		when(stockService.getPrice(googleStock)).thenReturn(50.00);
		when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);
		
		double marketValue = portfolio.getMarketValue();
		return marketValue == 100500.00;
	}

}
