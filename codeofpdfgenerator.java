package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import java.io.IOException;

class PdfGenerator {
    public static void main(String[] args) {
        try (PDDocument document = new PDDocument()) {

            PDPage page = new PDPage(PDRectangle.A4);
            document.addPage(page);

            PDPageContentStream content = new PDPageContentStream(document, page);

            // Fotoğraf Ekleme
            String photoPath = "C:\\Users\\bennu\\Desktop\\java\\pdfcvgenerator\\cvphoto.jpg";
            try {
                PDImageXObject image = PDImageXObject.createFromFile(photoPath, document);
                content.drawImage(image, 50, 650, 100, 100);
            } catch (IOException e) {
                System.out.println("Fotograf bulunamadi, sadece yazilar eklenecek.");
            }

            // İsim başlığı
            content.beginText();
            content.setFont(PDType1Font.HELVETICA_BOLD, 20); //
            content.newLineAtOffset(200, 750);
            content.showText("Bennu Dal");
            content.endText();

            // kişisel
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 12);
            content.newLineAtOffset(50, 600);
            content.showText("Email: bennudal2007@icloud.com");
            content.newLineAtOffset(0, -15);
            content.showText("Telefon Numarasi: +90 505 008 59 21");
            content.newLineAtOffset(0, -15);
            content.showText("Adres: Kirklareli, Turkey");
            content.endText();

            // deneyim başlık
            content.beginText();
            content.setFont(PDType1Font.HELVETICA_BOLD, 14);
            content.newLineAtOffset(50, 530);
            content.showText("Is Deneyimi");
            content.endText();

            // deneyim1
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 12);
            content.newLineAtOffset(50, 510);
            content.showText("2020 - 2021 | Stajyer");
            content.newLineAtOffset(0, -15);
            content.showText("Stajyer Yazilim Muhendisi – XYZ Yazilim, Tekirdag.");
            content.endText();

            // deneyim 2
            content.beginText();
            content.newLineAtOffset(50, 470);
            content.showText("2022 - 2023 | Google Jules | Yazilim Gelistirme");
            content.newLineAtOffset(0, -15);
            content.showText("Java ile belge isleme araclari gelistirdi.");
            content.endText();

            // deneyim 3
            content.beginText();
            content.newLineAtOffset(50, 430);
            content.showText("2023 - 2025 | Claude Code | Backend Developer");
            content.newLineAtOffset(0, -15);
            content.showText("PDF olusturma ve API entegrasyonlari uzerinde calisti.");
            content.endText();

            // eğitim
            content.beginText();
            content.setFont(PDType1Font.HELVETICA_BOLD, 14);
            content.newLineAtOffset(50, 380);
            content.showText("Egitim");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 12);
            content.newLineAtOffset(50, 360);
            content.showText("Lisans Yazilim Muhendisligi | Kirklareli University");
            content.endText();

            content.close();
            document.save("ozgecmisbennu.pdf");
            System.out.println("PDF olusturuldu: ozgecmisbennu.pdf");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
