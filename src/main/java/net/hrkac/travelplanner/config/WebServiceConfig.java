package net.hrkac.travelplanner.config;

import static net.hrkac.travelplanner.common.TravelPlannerConstants.*;

import java.util.List;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.server.endpoint.interceptor.PayloadLoggingInterceptor;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.soap.server.endpoint.interceptor.PayloadValidatingInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.SoapEnvelopeLoggingInterceptor;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        servlet.setMessageFactoryBeanName("messageFactory");
        return new ServletRegistrationBean(servlet, "/ws/*");
    }
    
    @Bean
    public XsdSchema travelPlannerSchema() {
        return new SimpleXsdSchema(new ClassPathResource("/wsdl/TravelPlannerServiceContractModel.xsd"));
    }
    
    @Bean(name = "travelplanner")       
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema travelPlannerSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("ITravelPlannerService");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace(TRAVEL_NAMESPACE_URI);
        wsdl11Definition.setSchema(travelPlannerSchema);
        wsdl11Definition.setCreateSoap11Binding(false);
        wsdl11Definition.setCreateSoap12Binding(true);
        return wsdl11Definition;
    }
    
    //@Bean(name = "travelplanner")
    public SimpleWsdl11Definition wsdlDefinition() {
        return new SimpleWsdl11Definition(new ClassPathResource("/wsdl/TravelPlannerService.wsdl"));
    }
    
    @Bean(name = "messageFactory")
    public SaajSoapMessageFactory soap12MessageFactory() {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
        messageFactory.setSoapVersion(SoapVersion.SOAP_12);
        return messageFactory;
    }

    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        interceptors.add(envelopeLoggingInterceptor());
        interceptors.add(validatingInterceptor());
        super.addInterceptors(interceptors);
    }
    
    @Bean
    public PayloadLoggingInterceptor payloadLoggingInterceptor() {
        return new PayloadLoggingInterceptor();
    }
    
    @Bean
    public SoapEnvelopeLoggingInterceptor envelopeLoggingInterceptor() {
        return new SoapEnvelopeLoggingInterceptor();
    }
    
    @Bean
    public PayloadValidatingInterceptor validatingInterceptor() {
        PayloadValidatingInterceptor validatingInterceptor = new PayloadValidatingInterceptor();
        validatingInterceptor.setXsdSchema(travelPlannerSchema());
        return validatingInterceptor;
    }
    
}
