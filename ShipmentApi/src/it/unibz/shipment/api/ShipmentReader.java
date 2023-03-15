package it.unibz.shipment.api;

import java.util.List;

public interface ShipmentReader {
    List<Shipment> readFile(String filepath);
    String getFileType();
}
