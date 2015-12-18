
package net.hrkac.travelplanner.ws.custom;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (net.hrkac.travelplanner.ws.xjc.DataTypeAdapter.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (net.hrkac.travelplanner.ws.xjc.DataTypeAdapter.printDateTime(value));
    }

}
