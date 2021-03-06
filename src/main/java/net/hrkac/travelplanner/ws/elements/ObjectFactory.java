
package net.hrkac.travelplanner.ws.elements;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.hrkac.travelplanner.ws.elements package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoEchoRequest_QNAME = new QName("http://www.pluservice.net/travelplannerservice", "request");
    private final static QName _DoEchoResponseResponse_QNAME = new QName("http://www.pluservice.net/travelplannerservice", "response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.hrkac.travelplanner.ws.elements
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoEcho }
     * 
     */
    public DoEcho createDoEcho() {
        return new DoEcho();
    }

    /**
     * Create an instance of {@link DoEchoResponse }
     * 
     */
    public DoEchoResponse createDoEchoResponse() {
        return new DoEchoResponse();
    }

    /**
     * Create an instance of {@link GetStopListFromLocation }
     * 
     */
    public GetStopListFromLocation createGetStopListFromLocation() {
        return new GetStopListFromLocation();
    }

    /**
     * Create an instance of {@link GetStopListFromLocationResponse }
     * 
     */
    public GetStopListFromLocationResponse createGetStopListFromLocationResponse() {
        return new GetStopListFromLocationResponse();
    }

    /**
     * Create an instance of {@link GetStopListFromName }
     * 
     */
    public GetStopListFromName createGetStopListFromName() {
        return new GetStopListFromName();
    }

    /**
     * Create an instance of {@link GetStopListFromNameResponse }
     * 
     */
    public GetStopListFromNameResponse createGetStopListFromNameResponse() {
        return new GetStopListFromNameResponse();
    }

    /**
     * Create an instance of {@link GetBusStopSchedule }
     * 
     */
    public GetBusStopSchedule createGetBusStopSchedule() {
        return new GetBusStopSchedule();
    }

    /**
     * Create an instance of {@link GetBusStopScheduleResponse }
     * 
     */
    public GetBusStopScheduleResponse createGetBusStopScheduleResponse() {
        return new GetBusStopScheduleResponse();
    }

    /**
     * Create an instance of {@link GetJourneyRunTime }
     * 
     */
    public GetJourneyRunTime createGetJourneyRunTime() {
        return new GetJourneyRunTime();
    }

    /**
     * Create an instance of {@link GetJourneyRunTimeResponse }
     * 
     */
    public GetJourneyRunTimeResponse createGetJourneyRunTimeResponse() {
        return new GetJourneyRunTimeResponse();
    }

    /**
     * Create an instance of {@link GetTPSolutions }
     * 
     */
    public GetTPSolutions createGetTPSolutions() {
        return new GetTPSolutions();
    }

    /**
     * Create an instance of {@link GetTPSolutionsResponse }
     * 
     */
    public GetTPSolutionsResponse createGetTPSolutionsResponse() {
        return new GetTPSolutionsResponse();
    }

    /**
     * Create an instance of {@link GetTPSolutionDetail }
     * 
     */
    public GetTPSolutionDetail createGetTPSolutionDetail() {
        return new GetTPSolutionDetail();
    }

    /**
     * Create an instance of {@link GetTPSolutionDetailResponse }
     * 
     */
    public GetTPSolutionDetailResponse createGetTPSolutionDetailResponse() {
        return new GetTPSolutionDetailResponse();
    }

    /**
     * Create an instance of {@link GetTPSolutionGeometry }
     * 
     */
    public GetTPSolutionGeometry createGetTPSolutionGeometry() {
        return new GetTPSolutionGeometry();
    }

    /**
     * Create an instance of {@link GetTPSolutionGeometryResponse }
     * 
     */
    public GetTPSolutionGeometryResponse createGetTPSolutionGeometryResponse() {
        return new GetTPSolutionGeometryResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice", name = "request", scope = DoEcho.class)
    public JAXBElement<Integer> createDoEchoRequest(Integer value) {
        return new JAXBElement<Integer>(_DoEchoRequest_QNAME, Integer.class, DoEcho.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice", name = "response", scope = DoEchoResponse.class)
    public JAXBElement<Integer> createDoEchoResponseResponse(Integer value) {
        return new JAXBElement<Integer>(_DoEchoResponseResponse_QNAME, Integer.class, DoEchoResponse.class, value);
    }

}
