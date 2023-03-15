package it.unibz.shipment.api;

public interface TaxesCalculator {
	double calculateTax(Shipment s);
	String getCountry();
	}

