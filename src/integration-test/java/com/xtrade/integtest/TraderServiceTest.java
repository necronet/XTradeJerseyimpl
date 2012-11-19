package com.xtrade.integtest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.spi.container.TestContainerFactory;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import static org.junit.Assert.assertNotNull;

public class TraderServiceTest extends JerseyTest{


    public TraderServiceTest()throws Exception {
        super("com.xtrade");
    }

    @Test
    public void testHelloWorld() {
        WebResource webResource = resource();
        ClientResponse responseMsg = webResource.path("trader").type(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        assertNotNull(responseMsg);
    }

}
