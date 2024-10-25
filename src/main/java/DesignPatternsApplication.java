import models.*;
import services.AlignCenter;
import services.AlignLeft;
import services.AlignRight;
import models.Author;
import models.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        //SpringApplication.run(DesignPatternsApplication.class, args);
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Section cap1 = new Section("Capitolul 1");
        Section cap11 = new Section("Capitolul 1.1");
        Section cap111 = new Section("Capitolul 1.1.1");
        Section cap1111 = new Section("Subchapter 1.1.1.1");
        noapteBuna.addContent(new Paragraph("Multumesc celor care ..."));
        noapteBuna.addContent(cap1);
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(cap11);
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap11.add(cap111);
        cap111.add(new Paragraph("Text from subchapter 1.1.1"));
        cap111.add(cap1111);
        cap1111.add(new Image("Image subchapter 1.1.1.1"));
        noapteBuna.print();

        Paragraph paragraph = new Paragraph("This is a sample paragraph used for testing text alignment strategies.");

        // Set alignment to left and render
        paragraph.setStrategy(new AlignLeft());
        paragraph.render(20);

        System.out.println();

        // Set alignment to right and render
        paragraph.setStrategy(new AlignRight());
        paragraph.render(20);

        paragraph.setStrategy(new AlignCenter());
        paragraph.render(20);
    }
    //ceva cu enum Alignment nu interface
}
