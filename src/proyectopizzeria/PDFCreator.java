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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agustin
 */
public class PDFCreator {

    private env env = new env();

    public void generarPDF(Factura factura, List<Producto> productos) throws DocumentException, DocumentException {
        try {
            Document doc = new Document();
//            FileOutputStream archivo = new FileOutputStream("/home/agustin/Documentos/Pedidos/" + factura.getId() + ".pdf");
            FileOutputStream archivo = new FileOutputStream(this.env.getPDFPath() + factura.getId() + ".pdf");
            PdfWriter.getInstance(doc, archivo);
            doc.open();

            try {
                Paragraph numPedido = new Paragraph("N° de pedido: " + factura.getId());
                doc.add(numPedido);

                Paragraph fecha = new Paragraph("" + factura.getFecha());
                fecha.setAlignment(2);
                doc.add(fecha);

                doc.add(Chunk.NEWLINE);

                PdfPTable table = new PdfPTable(3);
                table.setWidthPercentage(50);
                PdfPCell producto = new PdfPCell(new Phrase("Producto"));
                producto.setBackgroundColor(BaseColor.CYAN);
                PdfPCell cant = new PdfPCell(new Phrase("Cantidad"));
                cant.setBackgroundColor(BaseColor.CYAN);
                PdfPCell precio = new PdfPCell(new Phrase("Precio($)"));
                precio.setBackgroundColor(BaseColor.CYAN);

                table.addCell(producto);
                table.addCell(cant);
                table.addCell(precio);

                for (Producto p : productos) {
                    PdfPCell c1 = new PdfPCell(new Phrase(p.getNombre()));
                    PdfPCell c2 = new PdfPCell(new Phrase("" + p.getCantidad()));
                    PdfPCell c3 = new PdfPCell(new Phrase("" + p.getPrecio()));

                    table.addCell(c1);
                    table.addCell(c2);
                    table.addCell(c3);
                }

                PdfPCell total = new PdfPCell(new Phrase("Total: $" + factura.getTotal()));
                total.setColspan(3);
                total.setBackgroundColor(BaseColor.LIGHT_GRAY);
                table.addCell(total);

                doc.add(table);
                doc.close();

            } catch (Exception e) {
                Logger.getLogger(PDFCreator.class.getName()).log(Level.SEVERE, null, e);
            }

        } catch (Exception ex) {
            Logger.getLogger(PDFCreator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
