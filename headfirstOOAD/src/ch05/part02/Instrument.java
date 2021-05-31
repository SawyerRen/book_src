package ch05.part02;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentType instrumentType;
    private InstrumentSpec instrumentSpec;

    public Instrument(String serialNumber, double price, InstrumentType instrumentType, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentType = instrumentType;
        this.instrumentSpec = instrumentSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }

    public void setInstrumentSpec(InstrumentSpec instrumentSpec) {
        this.instrumentSpec = instrumentSpec;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }
}
