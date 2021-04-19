package assignment5.prob1.rulesets;

import java.awt.Component;

import  assignment5.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	private CDWindow cd;

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		cd = (CDWindow) ob;
		
		nonEmptyRule();
		priceRule();
	}
	
	private void nonEmptyRule() throws RuleException{
		if(cd.getArtistValue().trim().isEmpty() ||
				cd.getTitleValue().trim().isEmpty() ||
				cd.getPriceValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty");
		}
	}
	
	private void priceRule() throws RuleException {
		String var = cd.getPriceValue().trim();
		
		try {
			double price  = Double.parseDouble(var);
			if(price <= 0.49) {
				throw new RuleException("Price value must be greater than 0.49!");
			}
		} catch (NumberFormatException e){
			throw new RuleException("Price value must be double!");
		}
	}
	
}
