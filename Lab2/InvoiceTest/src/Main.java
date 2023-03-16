public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("20230112001",
                                      "iPhone14 Pro",
                                      2,
                                      1499.99);

        System.out.printf("------------Invoice------------\n" +
                          "InvoiceNo.  %19s\n" +
                          "Description %19s\n" +
                          "Quantity    %19d\n" +
                          "Price(each) %19.2f\n\n" +
                          "Total price %19.2f\n",
                          invoice.getInvoiceNO(), invoice.getDescription(),
                          invoice.getQuantity(), invoice.getPrice(),
                          invoice.getInvoiceAmount());
        System.out.print("-------------------------------");
    }
}