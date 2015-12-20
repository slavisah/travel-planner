package net.hrkac.travelplanner.ws;

import static net.hrkac.travelplanner.common.TravelPlannerConstants.*;
import net.hrkac.travelplanner.ws.elements.GetStopListFromLocation;
import net.hrkac.travelplanner.ws.elements.GetStopListFromLocationResponse;
import net.hrkac.travelplanner.ws.elements.GetTPSolutions;
import net.hrkac.travelplanner.ws.elements.GetTPSolutionsResponse;
import net.hrkac.travelplanner.ws.types.ArrayOfDistancedStopPoint;
import net.hrkac.travelplanner.ws.types.ArrayOfTPSolution;
import net.hrkac.travelplanner.ws.types.DistancedStopPointStructure;
import net.hrkac.travelplanner.ws.types.GetStopListFromLocationResponseStructure;
import net.hrkac.travelplanner.ws.types.GetTPSolutionsResponseStructure;
import net.hrkac.travelplanner.ws.types.TPSolutionStructure;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TravelEndpoint {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TravelEndpoint.class);
    
    @PayloadRoot(namespace = TRAVEL_NAMESPACE_URI, localPart = STOP_LIST_FROM_LOCATION_REQUEST)
    @ResponsePayload
    public GetStopListFromLocationResponse getStopListFromLocation(@RequestPayload GetStopListFromLocation request) {
        LOGGER.debug("Zaprimljen request {}", STOP_LIST_FROM_LOCATION_REQUEST);
        GetStopListFromLocationResponse response = new GetStopListFromLocationResponse();
        GetStopListFromLocationResponseStructure structure = new GetStopListFromLocationResponseStructure();
        structure.setItems(new ArrayOfDistancedStopPoint());
        DistancedStopPointStructure stopPoint = new DistancedStopPointStructure();
        stopPoint.setAddress("Nekakva adresa za beću.");
        structure.getItems().getStopPoints().add(stopPoint);
        response.setResponse(structure);
        return response;
    }
    
    @PayloadRoot(namespace = TRAVEL_NAMESPACE_URI, localPart = TP_SOLUTIONS_REQUEST)
    @ResponsePayload
    public GetTPSolutionsResponse getTpSolutions(@RequestPayload GetTPSolutions request) {
        LOGGER.debug("Zaprimljen request {}", TP_SOLUTIONS_REQUEST);
        GetTPSolutionsResponse response = new GetTPSolutionsResponse();
        GetTPSolutionsResponseStructure responseStructure = new GetTPSolutionsResponseStructure();
        TPSolutionStructure structure = new TPSolutionStructure();
        structure.setDepartureTime(new DateTime().withYear(2015).withMonthOfYear(12).withDayOfMonth(24).withHourOfDay(22).withMinuteOfHour(30).toDate());
        structure.setArrivalTime(new DateTime().withYear(2015).withMonthOfYear(12).withDayOfMonth(25).withHourOfDay(5).withMinuteOfHour(30).toDate());
        responseStructure.setSolutions(new ArrayOfTPSolution());
        responseStructure.getSolutions().getSolutions().add(structure);
        response.setResponse(responseStructure);
        return response;
    }
    
}
