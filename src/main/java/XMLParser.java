import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;

public class XMLParser {
    //Положите файл address.xml в корневую папку
    private static final String FILE_NAME = "address.xml";

    public void parse(IMain iMain) {
        try {
            File file = new File(FILE_NAME);
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SaxParserHandler handler = new SaxParserHandler(iMain);
            SAXParser parser = factory.newSAXParser();
            parser.parse(file, handler);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Ошибка: " + e.toString());
            System.exit(0);
        }
    }
}
