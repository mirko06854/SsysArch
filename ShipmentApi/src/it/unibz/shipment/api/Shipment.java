package it.unibz.shipment.api;

public class Shipment {
	private String productName;
    private String productType;
    private Integer amount;
    private Double individualPrice;
    private Double shipmentPrice;
    private String country;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getIndividualPrice() {
        return individualPrice;
    }

    public void setIndividualPrice(Double individualPrice) {
        this.individualPrice = individualPrice;
    }

    public Double getShipmentPrice() {
        return shipmentPrice;
    }

    public void setShipmentPrice(Double shipmentPrice) {
        this.shipmentPrice = shipmentPrice;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
