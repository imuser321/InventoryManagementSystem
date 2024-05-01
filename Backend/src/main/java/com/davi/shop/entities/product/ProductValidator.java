package com.davi.shop.entities.product;

import com.davi.shop.validation.ValidationHandler;
import com.davi.shop.validation.Validator;

public class ProductValidator extends Validator {

    private Product product;

    ProductValidator(final Product aProduct,
	    final ValidationHandler aHandler) {
	super(aHandler);
	this.product = aProduct;
    }

    @Override
    public void validate() {
	checkRegionalCouncilConstraints();
    }

    private void checkRegionalCouncilConstraints() {

    }

}