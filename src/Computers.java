import java.math.BigDecimal;

public class Computers {
    private String model;
    private double monitorDiagonal;
    private boolean isCompanyComputor;
    private BigDecimal price;
    boolean isLaptop;

    public Computers(String model, double monitorDiagonal, boolean isCompanyComputor,
                     BigDecimal price,boolean isLaptop) {
        this.model = model;
        this.monitorDiagonal = monitorDiagonal;
        this.isCompanyComputor = isCompanyComputor;
        this.price = price;
        this.isLaptop = isLaptop;
    }

    public Computers(String model, double monitorDiagonal) {
        this(model, monitorDiagonal, true, BigDecimal.valueOf(25800), true);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public void setMonitorDiagonal(double monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    public boolean isCompanyComputor() {
        return isCompanyComputor;
    }

    public void setCompanyComputor(boolean companyComputor) {
        isCompanyComputor = companyComputor;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }
}
