import entities.Item;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserHandler extends DefaultHandler {
    private static final String TAG_ITEM = "item";
    private static final String ATTRIBUTE_CITY = "city";
    private static final String ATTRIBUTE_STREET = "street";
    private static final String ATTRIBUTE_HOUSE = "house";
    private static final String ATTRIBUTE_FLOOR = "floor";

    IMain iMain;

    SaxParserHandler(IMain iMain) {
        this.iMain = iMain;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals(TAG_ITEM)) {
            String city = attributes.getValue(ATTRIBUTE_CITY);
            String street = attributes.getValue(ATTRIBUTE_STREET);
            int house = Integer.parseInt(attributes.getValue(ATTRIBUTE_HOUSE));
            int floor = Integer.parseInt(attributes.getValue(ATTRIBUTE_FLOOR));
            iMain.addNewItem(new Item(city, street, house, floor));
        }
    }
}
