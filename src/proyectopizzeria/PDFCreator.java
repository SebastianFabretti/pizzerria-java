package proyectopizzeria;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author agustin
 */
public class PDFCreator {

    public void generarPDF(Factura factura, ArrayList<Pizza> pizzas) throws DocumentException, DocumentException {
        try {
            Document doc = new Document();
            FileOutputStream archivo = new FileOutputStream("/home/agustin/Documentos/Pedidos/" + factura.getId() + ".pdf");
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            try {
                Paragraph numPedido = new Paragraph("N° de pedido: " + factura.getId());
                doc.add(numPedido);

                doc.add(Chunk.NEWLINE);

                Paragraph fecha = new Paragraph("" + factura.getFecha());
                fecha.setAlignment(2);
                doc.add(fecha);

                doc.add(Chunk.NEWLINE);

                PdfPTable table = new PdfPTable(3);
                table.setWidthPercentage(50);
                PdfPCell pizza = new PdfPCell(new Phrase("Pizza"));
                pizza.setBackgroundColor(BaseColor.CYAN);
                PdfPCell cant = new PdfPCell(new Phrase("Cantidad"));
                cant.setBackgroundColor(BaseColor.CYAN);
                PdfPCell precio = new PdfPCell(new Phrase("Precio($)"));
                precio.setBackgroundColor(BaseColor.CYAN);

                table.addCell(pizza);
                table.addCell(cant);
                table.addCell(precio);

                for (Pizza p : pizzas) {
                    PdfPCell c1 = new PdfPCell(new Phrase(p.getNombre()));
                    PdfPCell c2 = new PdfPCell(new Phrase("" + p.getCantidad()));
                    PdfPCell c3 = new PdfPCell(new Phrase("" + p.getPrecio()));

                    table.addCell(c1);
                    table.addCell(c2);
                    table.addCell(c3);
                }

                PdfPCell total = new PdfPCell(new Phrase("Total: $"+factura.getTotal()));
                total.setColspan(3);
                table.addCell(total);
                
                doc.add(table);
                doc.close();

            } catch (Exception e) {
            }

        } catch (Exception e) {
        }

    }
}
