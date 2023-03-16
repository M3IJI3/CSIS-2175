public class Invoice {
    /** attributes */
    private String invoiceNO;
    private String description;
    private int    quantity;
    private double price;

    /** constructor */
    public Invoice(String invoiceNO, String description, int quantity, double price)
    {
        this.invoiceNO   = invoiceNO;
        this.description = description;
        this.quantity    = quantity;
        this.price       = price;

        // set quantity to 0 if the number is not valid
        if (quantity <= 0) { this.quantity = 0; }

        // set price to 0.0 if the number is not valid
        if (price <= 0)    { this.price = 0.0; }
    }


    /** get and set methods **/
    // set methods
    public void setInvoiceNO(String invoiceNO)     { this.invoiceNO = invoiceNO; }
    public void setDescription(String description) { this.description = description; }
    public void setQuantity(int quantity)          { this.quantity = quantity; }
    public void setPrice(double price)             { this.price = price; }

    // get methods
    public String getInvoiceNO()   { return invoiceNO; }
    public String getDescription() { return description; }
    public int    getQuantity()    { return quantity; }
    public double getPrice()       { return price; }

    /** calculate total price method */
    public double getInvoiceAmount() { return quantity * price; }
}