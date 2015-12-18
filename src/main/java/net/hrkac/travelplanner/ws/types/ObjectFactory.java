
package net.hrkac.travelplanner.ws.types;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import net.hrkac.travelplanner.ws.custom.Adapter1;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.hrkac.travelplanner.ws.types package. 
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

    private final static QName _PointStructureMunicipality_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "Municipality");
    private final static QName _PointStructureAddress_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "Address");
    private final static QName _PointStructureDescription_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "Description");
    private final static QName _StopPointStructurePrivateCode_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "PrivateCode");
    private final static QName _StopPointStructurePublicCode_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "PublicCode");
    private final static QName _SimpleLegStructureLine_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "Line");
    private final static QName _ResponseResultStructureResultCode_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "ResultCode");
    private final static QName _ResponseResultStructureResultMessage_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "ResultMessage");
    private final static QName _LocationStructureLocatingSystem_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "LocatingSystem");
    private final static QName _LocationStructureCoordinateZ_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "CoordinateZ");
    private final static QName _JourneyPatternStructureJourneyPatternDescription_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "JourneyPatternDescription");
    private final static QName _JourneyPatternStructureHeadSign_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "HeadSign");
    private final static QName _GeoLegStructureColor_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "Color");
    private final static QName _DistancedStopPointStructureDistanceMeters_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "DistanceMeters");
    private final static QName _DetailedLegStructureDepartureTime_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "DepartureTime");
    private final static QName _DetailedLegStructureArrivalTime_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "ArrivalTime");
    private final static QName _DetailedLegStructureArrivalStop_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "ArrivalStop");
    private final static QName _DetailedLegStructureLegMeters_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "LegMeters");
    private final static QName _DetailedLegStructureLegMinutes_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "LegMinutes");
    private final static QName _DetailedLegStructureJourney_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "Journey");
    private final static QName _BaseResponseStructureResultInformation_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "ResultInformation");
    private final static QName _BaseResponseStructureCulture_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "Culture");
    private final static QName _BaseRequestStructureDeviceTrackInformation_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "DeviceTrackInformation");
    private final static QName _GetBusStopScheduleRequestStructureFromTime_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "FromTime");
    private final static QName _GetBusStopScheduleRequestStructureToTime_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "ToTime");
    private final static QName _GetStopListFromLocationRequestStructureMaxDistanceMeters_QNAME = new QName("http://www.pluservice.net/travelplannerservice/data", "MaxDistanceMeters");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.hrkac.travelplanner.ws.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStopListFromLocationRequestStructure }
     * 
     */
    public GetStopListFromLocationRequestStructure createGetStopListFromLocationRequestStructure() {
        return new GetStopListFromLocationRequestStructure();
    }

    /**
     * Create an instance of {@link GetStopListFromLocationResponseStructure }
     * 
     */
    public GetStopListFromLocationResponseStructure createGetStopListFromLocationResponseStructure() {
        return new GetStopListFromLocationResponseStructure();
    }

    /**
     * Create an instance of {@link GetStopListFromNameRequestStructure }
     * 
     */
    public GetStopListFromNameRequestStructure createGetStopListFromNameRequestStructure() {
        return new GetStopListFromNameRequestStructure();
    }

    /**
     * Create an instance of {@link GetStopListFromNameResponseStructure }
     * 
     */
    public GetStopListFromNameResponseStructure createGetStopListFromNameResponseStructure() {
        return new GetStopListFromNameResponseStructure();
    }

    /**
     * Create an instance of {@link GetBusStopScheduleRequestStructure }
     * 
     */
    public GetBusStopScheduleRequestStructure createGetBusStopScheduleRequestStructure() {
        return new GetBusStopScheduleRequestStructure();
    }

    /**
     * Create an instance of {@link GetBusStopScheduleResponseStructure }
     * 
     */
    public GetBusStopScheduleResponseStructure createGetBusStopScheduleResponseStructure() {
        return new GetBusStopScheduleResponseStructure();
    }

    /**
     * Create an instance of {@link GetJourneyRunTimeRequestStructure }
     * 
     */
    public GetJourneyRunTimeRequestStructure createGetJourneyRunTimeRequestStructure() {
        return new GetJourneyRunTimeRequestStructure();
    }

    /**
     * Create an instance of {@link GetJourneyRunTimeResponseStructure }
     * 
     */
    public GetJourneyRunTimeResponseStructure createGetJourneyRunTimeResponseStructure() {
        return new GetJourneyRunTimeResponseStructure();
    }

    /**
     * Create an instance of {@link GetTPSolutionsRequestStructure }
     * 
     */
    public GetTPSolutionsRequestStructure createGetTPSolutionsRequestStructure() {
        return new GetTPSolutionsRequestStructure();
    }

    /**
     * Create an instance of {@link GetTPSolutionsResponseStructure }
     * 
     */
    public GetTPSolutionsResponseStructure createGetTPSolutionsResponseStructure() {
        return new GetTPSolutionsResponseStructure();
    }

    /**
     * Create an instance of {@link GetTPSolutionDetailRequestStructure }
     * 
     */
    public GetTPSolutionDetailRequestStructure createGetTPSolutionDetailRequestStructure() {
        return new GetTPSolutionDetailRequestStructure();
    }

    /**
     * Create an instance of {@link GetTPSolutionDetailResponseStructure }
     * 
     */
    public GetTPSolutionDetailResponseStructure createGetTPSolutionDetailResponseStructure() {
        return new GetTPSolutionDetailResponseStructure();
    }

    /**
     * Create an instance of {@link GetTPSolutionGeometryRequestStructure }
     * 
     */
    public GetTPSolutionGeometryRequestStructure createGetTPSolutionGeometryRequestStructure() {
        return new GetTPSolutionGeometryRequestStructure();
    }

    /**
     * Create an instance of {@link GetTPSolutionGeometryResponseStructure }
     * 
     */
    public GetTPSolutionGeometryResponseStructure createGetTPSolutionGeometryResponseStructure() {
        return new GetTPSolutionGeometryResponseStructure();
    }

    /**
     * Create an instance of {@link ArrayOfBaseLeg }
     * 
     */
    public ArrayOfBaseLeg createArrayOfBaseLeg() {
        return new ArrayOfBaseLeg();
    }

    /**
     * Create an instance of {@link ArrayOfBusStopSchedule }
     * 
     */
    public ArrayOfBusStopSchedule createArrayOfBusStopSchedule() {
        return new ArrayOfBusStopSchedule();
    }

    /**
     * Create an instance of {@link ArrayOfDetailedLeg }
     * 
     */
    public ArrayOfDetailedLeg createArrayOfDetailedLeg() {
        return new ArrayOfDetailedLeg();
    }

    /**
     * Create an instance of {@link ArrayOfDistancedStopPoint }
     * 
     */
    public ArrayOfDistancedStopPoint createArrayOfDistancedStopPoint() {
        return new ArrayOfDistancedStopPoint();
    }

    /**
     * Create an instance of {@link ArrayOfGeoLeg }
     * 
     */
    public ArrayOfGeoLeg createArrayOfGeoLeg() {
        return new ArrayOfGeoLeg();
    }

    /**
     * Create an instance of {@link ArrayOfJourneyRunTime }
     * 
     */
    public ArrayOfJourneyRunTime createArrayOfJourneyRunTime() {
        return new ArrayOfJourneyRunTime();
    }

    /**
     * Create an instance of {@link ArrayOfLocation }
     * 
     */
    public ArrayOfLocation createArrayOfLocation() {
        return new ArrayOfLocation();
    }

    /**
     * Create an instance of {@link ArrayOfSimpleLeg }
     * 
     */
    public ArrayOfSimpleLeg createArrayOfSimpleLeg() {
        return new ArrayOfSimpleLeg();
    }

    /**
     * Create an instance of {@link ArrayOfSolutionSortCriteria }
     * 
     */
    public ArrayOfSolutionSortCriteria createArrayOfSolutionSortCriteria() {
        return new ArrayOfSolutionSortCriteria();
    }

    /**
     * Create an instance of {@link ArrayOfStopPoint }
     * 
     */
    public ArrayOfStopPoint createArrayOfStopPoint() {
        return new ArrayOfStopPoint();
    }

    /**
     * Create an instance of {@link ArrayOfTPSolution }
     * 
     */
    public ArrayOfTPSolution createArrayOfTPSolution() {
        return new ArrayOfTPSolution();
    }

    /**
     * Create an instance of {@link ArrayOfTransportModeSelection }
     * 
     */
    public ArrayOfTransportModeSelection createArrayOfTransportModeSelection() {
        return new ArrayOfTransportModeSelection();
    }

    /**
     * Create an instance of {@link BaseLegStructure }
     * 
     */
    public BaseLegStructure createBaseLegStructure() {
        return new BaseLegStructure();
    }

    /**
     * Create an instance of {@link BaseRequestStructure }
     * 
     */
    public BaseRequestStructure createBaseRequestStructure() {
        return new BaseRequestStructure();
    }

    /**
     * Create an instance of {@link BaseResponseStructure }
     * 
     */
    public BaseResponseStructure createBaseResponseStructure() {
        return new BaseResponseStructure();
    }

    /**
     * Create an instance of {@link BaseTPSolutionStructure }
     * 
     */
    public BaseTPSolutionStructure createBaseTPSolutionStructure() {
        return new BaseTPSolutionStructure();
    }

    /**
     * Create an instance of {@link BoundingBoxStructure }
     * 
     */
    public BoundingBoxStructure createBoundingBoxStructure() {
        return new BoundingBoxStructure();
    }

    /**
     * Create an instance of {@link BusStopScheduleStructure }
     * 
     */
    public BusStopScheduleStructure createBusStopScheduleStructure() {
        return new BusStopScheduleStructure();
    }

    /**
     * Create an instance of {@link DetailedLegStructure }
     * 
     */
    public DetailedLegStructure createDetailedLegStructure() {
        return new DetailedLegStructure();
    }

    /**
     * Create an instance of {@link DeviceTrackInformationStructure }
     * 
     */
    public DeviceTrackInformationStructure createDeviceTrackInformationStructure() {
        return new DeviceTrackInformationStructure();
    }

    /**
     * Create an instance of {@link DistancedStopPointStructure }
     * 
     */
    public DistancedStopPointStructure createDistancedStopPointStructure() {
        return new DistancedStopPointStructure();
    }

    /**
     * Create an instance of {@link GeoLegStructure }
     * 
     */
    public GeoLegStructure createGeoLegStructure() {
        return new GeoLegStructure();
    }

    /**
     * Create an instance of {@link JourneyInLegStructure }
     * 
     */
    public JourneyInLegStructure createJourneyInLegStructure() {
        return new JourneyInLegStructure();
    }

    /**
     * Create an instance of {@link JourneyPartStructure }
     * 
     */
    public JourneyPartStructure createJourneyPartStructure() {
        return new JourneyPartStructure();
    }

    /**
     * Create an instance of {@link JourneyPatternStructure }
     * 
     */
    public JourneyPatternStructure createJourneyPatternStructure() {
        return new JourneyPatternStructure();
    }

    /**
     * Create an instance of {@link JourneyRunTimeStructure }
     * 
     */
    public JourneyRunTimeStructure createJourneyRunTimeStructure() {
        return new JourneyRunTimeStructure();
    }

    /**
     * Create an instance of {@link JourneyStructure }
     * 
     */
    public JourneyStructure createJourneyStructure() {
        return new JourneyStructure();
    }

    /**
     * Create an instance of {@link LineStructure }
     * 
     */
    public LineStructure createLineStructure() {
        return new LineStructure();
    }

    /**
     * Create an instance of {@link LocationStructure }
     * 
     */
    public LocationStructure createLocationStructure() {
        return new LocationStructure();
    }

    /**
     * Create an instance of {@link OperatorStructure }
     * 
     */
    public OperatorStructure createOperatorStructure() {
        return new OperatorStructure();
    }

    /**
     * Create an instance of {@link PointStructure }
     * 
     */
    public PointStructure createPointStructure() {
        return new PointStructure();
    }

    /**
     * Create an instance of {@link PrivateCodeStructure }
     * 
     */
    public PrivateCodeStructure createPrivateCodeStructure() {
        return new PrivateCodeStructure();
    }

    /**
     * Create an instance of {@link ResponseResultStructure }
     * 
     */
    public ResponseResultStructure createResponseResultStructure() {
        return new ResponseResultStructure();
    }

    /**
     * Create an instance of {@link SimpleLegStructure }
     * 
     */
    public SimpleLegStructure createSimpleLegStructure() {
        return new SimpleLegStructure();
    }

    /**
     * Create an instance of {@link SolutionSortCriteriaStructure }
     * 
     */
    public SolutionSortCriteriaStructure createSolutionSortCriteriaStructure() {
        return new SolutionSortCriteriaStructure();
    }

    /**
     * Create an instance of {@link StopPointStructure }
     * 
     */
    public StopPointStructure createStopPointStructure() {
        return new StopPointStructure();
    }

    /**
     * Create an instance of {@link TPDetailedSolutionStructure }
     * 
     */
    public TPDetailedSolutionStructure createTPDetailedSolutionStructure() {
        return new TPDetailedSolutionStructure();
    }

    /**
     * Create an instance of {@link TPGeoSolutionStructure }
     * 
     */
    public TPGeoSolutionStructure createTPGeoSolutionStructure() {
        return new TPGeoSolutionStructure();
    }

    /**
     * Create an instance of {@link TPSolutionStructure }
     * 
     */
    public TPSolutionStructure createTPSolutionStructure() {
        return new TPSolutionStructure();
    }

    /**
     * Create an instance of {@link TransportModeSelectionStructure }
     * 
     */
    public TransportModeSelectionStructure createTransportModeSelectionStructure() {
        return new TransportModeSelectionStructure();
    }

    /**
     * Create an instance of {@link UseOfStopPointStructure }
     * 
     */
    public UseOfStopPointStructure createUseOfStopPointStructure() {
        return new UseOfStopPointStructure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "Municipality", scope = PointStructure.class)
    public JAXBElement<String> createPointStructureMunicipality(String value) {
        return new JAXBElement<String>(_PointStructureMunicipality_QNAME, String.class, PointStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "Address", scope = PointStructure.class)
    public JAXBElement<String> createPointStructureAddress(String value) {
        return new JAXBElement<String>(_PointStructureAddress_QNAME, String.class, PointStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "Description", scope = PointStructure.class)
    public JAXBElement<String> createPointStructureDescription(String value) {
        return new JAXBElement<String>(_PointStructureDescription_QNAME, String.class, PointStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivateCodeStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "PrivateCode", scope = StopPointStructure.class)
    public JAXBElement<PrivateCodeStructure> createStopPointStructurePrivateCode(PrivateCodeStructure value) {
        return new JAXBElement<PrivateCodeStructure>(_StopPointStructurePrivateCode_QNAME, PrivateCodeStructure.class, StopPointStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "PublicCode", scope = StopPointStructure.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStopPointStructurePublicCode(String value) {
        return new JAXBElement<String>(_StopPointStructurePublicCode_QNAME, String.class, StopPointStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "Line", scope = SimpleLegStructure.class)
    public JAXBElement<LineStructure> createSimpleLegStructureLine(LineStructure value) {
        return new JAXBElement<LineStructure>(_SimpleLegStructureLine_QNAME, LineStructure.class, SimpleLegStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "ResultCode", scope = ResponseResultStructure.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createResponseResultStructureResultCode(String value) {
        return new JAXBElement<String>(_ResponseResultStructureResultCode_QNAME, String.class, ResponseResultStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "ResultMessage", scope = ResponseResultStructure.class)
    public JAXBElement<String> createResponseResultStructureResultMessage(String value) {
        return new JAXBElement<String>(_ResponseResultStructureResultMessage_QNAME, String.class, ResponseResultStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocatingSystemEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "LocatingSystem", scope = LocationStructure.class)
    public JAXBElement<LocatingSystemEnum> createLocationStructureLocatingSystem(LocatingSystemEnum value) {
        return new JAXBElement<LocatingSystemEnum>(_LocationStructureLocatingSystem_QNAME, LocatingSystemEnum.class, LocationStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "CoordinateZ", scope = LocationStructure.class)
    public JAXBElement<Float> createLocationStructureCoordinateZ(Float value) {
        return new JAXBElement<Float>(_LocationStructureCoordinateZ_QNAME, Float.class, LocationStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "PublicCode", scope = LineStructure.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLineStructurePublicCode(String value) {
        return new JAXBElement<String>(_StopPointStructurePublicCode_QNAME, String.class, LineStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "PublicCode", scope = JourneyStructure.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJourneyStructurePublicCode(String value) {
        return new JAXBElement<String>(_StopPointStructurePublicCode_QNAME, String.class, JourneyStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "PublicCode", scope = JourneyPatternStructure.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJourneyPatternStructurePublicCode(String value) {
        return new JAXBElement<String>(_StopPointStructurePublicCode_QNAME, String.class, JourneyPatternStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "JourneyPatternDescription", scope = JourneyPatternStructure.class)
    public JAXBElement<String> createJourneyPatternStructureJourneyPatternDescription(String value) {
        return new JAXBElement<String>(_JourneyPatternStructureJourneyPatternDescription_QNAME, String.class, JourneyPatternStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "HeadSign", scope = JourneyPatternStructure.class)
    public JAXBElement<String> createJourneyPatternStructureHeadSign(String value) {
        return new JAXBElement<String>(_JourneyPatternStructureHeadSign_QNAME, String.class, JourneyPatternStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "Color", scope = GeoLegStructure.class)
    public JAXBElement<Integer> createGeoLegStructureColor(Integer value) {
        return new JAXBElement<Integer>(_GeoLegStructureColor_QNAME, Integer.class, GeoLegStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "DistanceMeters", scope = DistancedStopPointStructure.class)
    public JAXBElement<BigInteger> createDistancedStopPointStructureDistanceMeters(BigInteger value) {
        return new JAXBElement<BigInteger>(_DistancedStopPointStructureDistanceMeters_QNAME, BigInteger.class, DistancedStopPointStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "DepartureTime", scope = DetailedLegStructure.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Date> createDetailedLegStructureDepartureTime(Date value) {
        return new JAXBElement<Date>(_DetailedLegStructureDepartureTime_QNAME, Date.class, DetailedLegStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "ArrivalTime", scope = DetailedLegStructure.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Date> createDetailedLegStructureArrivalTime(Date value) {
        return new JAXBElement<Date>(_DetailedLegStructureArrivalTime_QNAME, Date.class, DetailedLegStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPointStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "ArrivalStop", scope = DetailedLegStructure.class)
    public JAXBElement<StopPointStructure> createDetailedLegStructureArrivalStop(StopPointStructure value) {
        return new JAXBElement<StopPointStructure>(_DetailedLegStructureArrivalStop_QNAME, StopPointStructure.class, DetailedLegStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "LegMeters", scope = DetailedLegStructure.class)
    public JAXBElement<BigInteger> createDetailedLegStructureLegMeters(BigInteger value) {
        return new JAXBElement<BigInteger>(_DetailedLegStructureLegMeters_QNAME, BigInteger.class, DetailedLegStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "LegMinutes", scope = DetailedLegStructure.class)
    public JAXBElement<BigInteger> createDetailedLegStructureLegMinutes(BigInteger value) {
        return new JAXBElement<BigInteger>(_DetailedLegStructureLegMinutes_QNAME, BigInteger.class, DetailedLegStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyInLegStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "Journey", scope = DetailedLegStructure.class)
    public JAXBElement<JourneyInLegStructure> createDetailedLegStructureJourney(JourneyInLegStructure value) {
        return new JAXBElement<JourneyInLegStructure>(_DetailedLegStructureJourney_QNAME, JourneyInLegStructure.class, DetailedLegStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocatingSystemEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "LocatingSystem", scope = BaseResponseStructure.class)
    public JAXBElement<LocatingSystemEnum> createBaseResponseStructureLocatingSystem(LocatingSystemEnum value) {
        return new JAXBElement<LocatingSystemEnum>(_LocationStructureLocatingSystem_QNAME, LocatingSystemEnum.class, BaseResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseResultStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "ResultInformation", scope = BaseResponseStructure.class)
    public JAXBElement<ResponseResultStructure> createBaseResponseStructureResultInformation(ResponseResultStructure value) {
        return new JAXBElement<ResponseResultStructure>(_BaseResponseStructureResultInformation_QNAME, ResponseResultStructure.class, BaseResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CultureEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "Culture", scope = BaseResponseStructure.class)
    public JAXBElement<CultureEnum> createBaseResponseStructureCulture(CultureEnum value) {
        return new JAXBElement<CultureEnum>(_BaseResponseStructureCulture_QNAME, CultureEnum.class, BaseResponseStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocatingSystemEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "LocatingSystem", scope = BaseRequestStructure.class)
    public JAXBElement<LocatingSystemEnum> createBaseRequestStructureLocatingSystem(LocatingSystemEnum value) {
        return new JAXBElement<LocatingSystemEnum>(_LocationStructureLocatingSystem_QNAME, LocatingSystemEnum.class, BaseRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceTrackInformationStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "DeviceTrackInformation", scope = BaseRequestStructure.class)
    public JAXBElement<DeviceTrackInformationStructure> createBaseRequestStructureDeviceTrackInformation(DeviceTrackInformationStructure value) {
        return new JAXBElement<DeviceTrackInformationStructure>(_BaseRequestStructureDeviceTrackInformation_QNAME, DeviceTrackInformationStructure.class, BaseRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CultureEnum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "Culture", scope = BaseRequestStructure.class)
    public JAXBElement<CultureEnum> createBaseRequestStructureCulture(CultureEnum value) {
        return new JAXBElement<CultureEnum>(_BaseResponseStructureCulture_QNAME, CultureEnum.class, BaseRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "FromTime", scope = GetBusStopScheduleRequestStructure.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Date> createGetBusStopScheduleRequestStructureFromTime(Date value) {
        return new JAXBElement<Date>(_GetBusStopScheduleRequestStructureFromTime_QNAME, Date.class, GetBusStopScheduleRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "ToTime", scope = GetBusStopScheduleRequestStructure.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Date> createGetBusStopScheduleRequestStructureToTime(Date value) {
        return new JAXBElement<Date>(_GetBusStopScheduleRequestStructureToTime_QNAME, Date.class, GetBusStopScheduleRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "Municipality", scope = GetStopListFromNameRequestStructure.class)
    public JAXBElement<String> createGetStopListFromNameRequestStructureMunicipality(String value) {
        return new JAXBElement<String>(_PointStructureMunicipality_QNAME, String.class, GetStopListFromNameRequestStructure.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.pluservice.net/travelplannerservice/data", name = "MaxDistanceMeters", scope = GetStopListFromLocationRequestStructure.class)
    public JAXBElement<BigInteger> createGetStopListFromLocationRequestStructureMaxDistanceMeters(BigInteger value) {
        return new JAXBElement<BigInteger>(_GetStopListFromLocationRequestStructureMaxDistanceMeters_QNAME, BigInteger.class, GetStopListFromLocationRequestStructure.class, value);
    }

}
