package assignment5.prob1.rulesets;

import java.awt.Component;

import  assignment5.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	private BookWindow book;
	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		book = (BookWindow) ob;
		nonEmptyRule();
		isbnNumericRule();
		isbnLengthRule();
		priceRule();
	}
	
	private void nonEmptyRule() throws RuleException {
		if (book.getIsbnValue().trim().isEmpty() ||
				book.getTitleValue().trim().isEmpty() ||
				book.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}
	
	private void isbnNumericRule() throws RuleException {
		String val = book.getIsbnValue().trim();
		try {
			Long.parseLong(val);
		} catch (NumberFormatException e){
			throw new RuleException("ISBN must be numeric");
		}
	}
	
	private void isbnLengthRule() throws RuleException {
		String val = book.getIsbnValue().trim();
		if(val.length() != 10 || val.length()!= 13) {
			throw new RuleException("ISBN length must be either 10 or 13");
		}
		
		if(val.length() == 10) {
			if(val.charAt(0) != '0' || val.charAt(0) != '1') 
				throw new RuleException("ISBN with length 10 must either start with 0 or 1");
		}
		
		if(val.length() == 13) {
			if(!val.substring(0, 3).equals("978") || !val.substring(0, 3).equals("979")) {
				throw new RuleException("ISBN with length 13 must either start with 978 or 979");
			}
			
		}
	}
	
	private void priceRule() throws RuleException {
		String val = book.getPriceValue().trim();
		
		try {
			Double.parseDouble(val);
		} catch (NumberFormatException e) {
			throw new RuleException("Price must be double value");
		}
	}

}
