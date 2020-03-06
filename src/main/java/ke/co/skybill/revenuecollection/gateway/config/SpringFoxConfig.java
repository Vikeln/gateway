package ke.co.skybill.revenuecollection.gateway.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;


@Component
@Primary //Override Original swagger implementation with custom swagger resource provider.
@EnableAutoConfiguration
public class SpringFoxConfig implements SwaggerResourcesProvider {

    @Override
    public List get() {
        List resources = new ArrayList();
        resources.add(swaggerResource("accounts-service", "/accounts/v2/api-docs", "2.0"));
        resources.add(swaggerResource("customer-service", "/customers/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("communication-service", "/api/communication/v2/api-docs", "2.0"));
        return resources;
    }


    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }

}